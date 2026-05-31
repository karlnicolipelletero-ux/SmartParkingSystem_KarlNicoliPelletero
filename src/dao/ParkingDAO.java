package dao;

import controller.DBConnection;
import model.Reservation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ParkingDAO {

    /**
     * 1. Get Table Data
     * Combines both 'active_reservations' and 'employees' tables using a UNION
     * so they both show up in your main dashboard table.
     */
    public List<Reservation> getAllActive() {
        List<Reservation> list = new ArrayList<>();
        String sql = "SELECT slot_id, driver_name, plate_number, contact_number, customer_type, fee, time_in FROM active_reservations "
                + "UNION "
                + "SELECT slot_id, driver_name, plate_number, contact_number, customer_type, fee, time_in FROM employees "
                + "ORDER BY slot_id ASC";

        try (Connection conn = DBConnection.getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Reservation(
                        rs.getString("slot_id"), rs.getString("driver_name"),
                        rs.getString("plate_number"), rs.getString("contact_number"),
                        rs.getString("customer_type"), rs.getInt("fee"),
                        rs.getTimestamp("time_in") != null ? rs.getTimestamp("time_in").toString() : ""
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 2. Add Reservation (For Regulars/Seniors)
     * Saves data into the 'active_reservations' table.
     */
    public boolean addReservation(Reservation res) {
        String cleanSlotId = res.getSlotId().replace("[", "").replace("]", "").trim();
        String sql = "INSERT INTO active_reservations (slot_id, driver_name, plate_number, contact_number, customer_type, fee, time_in) VALUES (?, ?, ?, ?, ?, ?, NOW())";
        try (Connection conn = DBConnection.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cleanSlotId);
            ps.setString(2, res.getName());
            ps.setString(3, res.getPlate());
            ps.setString(4, res.getContact());
            ps.setString(5, res.getType());
            ps.setInt(6, res.getFee());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    /**
     * 3. Add Employee (Specific Table)
     * Forces the fee to 0 and saves into the 'employees' table.
     */
    public boolean addEmployee(Reservation res) {
        String cleanSlotId = res.getSlotId().replace("[", "").replace("]", "").trim();
        String sql = "INSERT INTO employees (slot_id, driver_name, plate_number, contact_number, customer_type, fee, time_in) VALUES (?, ?, ?, ?, ?, ?, NOW())";

        try (Connection conn = DBConnection.getConnection(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cleanSlotId);
            ps.setString(2, res.getName());
            ps.setString(3, res.getPlate());
            ps.setString(4, res.getContact());
            ps.setString(5, "Employee");
            ps.setInt(6, 0); // Forces 0 fee in DB
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 4. THE FIX: Checkout (Deletes from either table and moves to history)
     * This method ensures the record is removed from the correct table 
     * before adding it to the 'transaction_history'.
     */
    public boolean deleteReservation(String slotId, String plate, int fee) {
        String cleanId = slotId.replace("[", "").replace("]", "").trim();
        String sqlHistory = "INSERT INTO transaction_history (plate_number, slot_id, total_paid, time_out) VALUES (?, ?, ?, NOW())";

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false); // Begin transaction
            try {
                // First, add to history
                try (PreparedStatement psHist = conn.prepareStatement(sqlHistory)) {
                    psHist.setString(1, plate != null ? plate : "N/A");
                    psHist.setString(2, cleanId);
                    psHist.setInt(3, fee);
                    psHist.executeUpdate();
                }

                // Second, attempt deletion from BOTH tables to be safe
                String delActive = "DELETE FROM active_reservations WHERE slot_id = ?";
                String delEmp = "DELETE FROM employees WHERE slot_id = ?";

                try (PreparedStatement p1 = conn.prepareStatement(delActive); 
                     PreparedStatement p2 = conn.prepareStatement(delEmp)) {
                    p1.setString(1, cleanId);
                    p1.executeUpdate();
                    p2.setString(1, cleanId);
                    p2.executeUpdate();
                }

                conn.commit(); // Save changes
                return true;
            } catch (SQLException e) {
                conn.rollback(); // Undo changes if something failed
                e.printStackTrace();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 5. Revenue Calculation
     * Pulls the sum of all 'total_paid' from history.
     */
    public int getTotalRevenue() {
        String sql = "SELECT SUM(total_paid) as revenue FROM transaction_history";
        try (Connection conn = DBConnection.getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt("revenue");
            }
        } catch (SQLException e) {
            System.err.println("Revenue Error: " + e.getMessage());
        }
        return 0;
    }

    /**
     * 6. Count Occupied (Combined count of both tables)
     * Used for the dashboard stats.
     */
    public int getTotalOccupied() {
        String sql = "SELECT (SELECT COUNT(*) FROM active_reservations) + (SELECT COUNT(*) FROM employees) AS total";
        try (Connection conn = DBConnection.getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException e) {
            System.err.println("Occupied Count Error: " + e.getMessage());
        }
        return 0;
    }

    /**
     * 7. History Formatter
     * Prepares the transaction history for display in the popup.
     */
    public String getHistoryAsText() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-15s %-10s %-15s %-20s\n", "ID", "PLATE", "SLOT", "PAID", "TIME OUT"));
        sb.append("--------------------------------------------------------------------------------\n");
        String sql = "SELECT * FROM transaction_history ORDER BY time_out DESC";
        try (Connection conn = DBConnection.getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                sb.append(String.format("%-10s %-15s %-10s Php %-11.2f %-20s\n",
                        rs.getInt("history_id"), rs.getString("plate_number"),
                        rs.getString("slot_id"), rs.getDouble("total_paid"),
                        rs.getTimestamp("time_out").toString()));
            }
        } catch (SQLException e) {
            return "Error: " + e.getMessage();
        }
        return sb.toString();
    }
}