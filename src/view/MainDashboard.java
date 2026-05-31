package view;

import java.awt.CardLayout;
import java.awt.Color;
import view.ReserveDialog;
import dao.ParkingDAO;
import model.Reservation;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import controller.DBConnection;

public class MainDashboard extends javax.swing.JFrame {

    private javax.swing.table.DefaultTableModel model;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainDashboard.class.getName());

    public MainDashboard() {
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        // Sidebar Startup Highlight
        btnHome.setBackground(new java.awt.Color(255, 51, 51));
        btnHome.setForeground(java.awt.Color.WHITE);

        // Initialize Map Buttons
        javax.swing.JButton[] allSlots = {
            btnA1, btnB1, btnC1, btnD1, btnE1, btnF1,
            btnA2, btnB2, btnC2, btnD2, btnE2, btnF2,};

        for (javax.swing.JButton btn : allSlots) {
            btn.addActionListener(e -> handleReservation(btn));
        }

        model = (DefaultTableModel) tblReservations.getModel();
        tblReservations.setComponentPopupMenu(jPopupMenu1);

        loadExistingData();

        btnHome.setBackground(new java.awt.Color(255, 51, 51));
        btnHome.setForeground(java.awt.Color.BLACK);
        updateStats();

    }

    Color activeRed = new Color(255, 51, 51);
    Color defaultSidebar = new Color(240, 240, 240);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuUpdate = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenuItem();
        menuHistory = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        btnSeeSlot = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAccounts = new javax.swing.JButton();
        pnlReserve = new javax.swing.JPanel();
        pnlButtonGrid = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnF2 = new javax.swing.JButton();
        pnlSeeSlots = new javax.swing.JPanel();
        pnlStats = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblOccupied = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblAvailable = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblRevenue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservations = new javax.swing.JTable();
        SearchPanel = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        menuUpdate.setText("Update ");
        menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuUpdate);

        menuDelete.setText("Delete");
        menuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuDelete);

        menuHistory.setText("Transaction History");
        menuHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistoryActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuHistory);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 869));

        btnHome.setBackground(new java.awt.Color(229, 229, 229));
        btnHome.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 0, 0));
        btnHome.setText("Home");
        btnHome.setToolTipText("");
        btnHome.setBorderPainted(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setFocusPainted(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnReserve.setBackground(new java.awt.Color(229, 229, 229));
        btnReserve.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnReserve.setForeground(new java.awt.Color(0, 0, 0));
        btnReserve.setText("Reserve Slots");
        btnReserve.setToolTipText("");
        btnReserve.setBorderPainted(false);
        btnReserve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReserve.setFocusPainted(false);
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        btnSeeSlot.setBackground(new java.awt.Color(229, 229, 229));
        btnSeeSlot.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnSeeSlot.setForeground(new java.awt.Color(0, 0, 0));
        btnSeeSlot.setText("See Slots");
        btnSeeSlot.setToolTipText("");
        btnSeeSlot.setBorderPainted(false);
        btnSeeSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeeSlot.setFocusPainted(false);
        btnSeeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeSlotActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\Cor_Jesu_College_Logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnExit.setBackground(new java.awt.Color(229, 229, 229));
        btnExit.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Exit Program");
        btnExit.setToolTipText("");
        btnExit.setBorderPainted(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnSeeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pnlCards.setBackground(new java.awt.Color(214, 214, 214));
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(214, 214, 214));
        pnlHome.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Welcome to the Smart Parking System!");
        jLabel2.setAlignmentX(1.0F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(340, 110, 0, 136);
        pnlHome.add(jLabel2, gridBagConstraints);

        btnAccounts.setBackground(new java.awt.Color(255, 51, 51));
        btnAccounts.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnAccounts.setText("+");
        btnAccounts.setToolTipText("");
        btnAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 460, 399, 0);
        pnlHome.add(btnAccounts, gridBagConstraints);

        pnlCards.add(pnlHome, "cardHome");

        pnlReserve.setBackground(new java.awt.Color(222, 222, 222));
        pnlReserve.setLayout(new java.awt.GridBagLayout());

        pnlButtonGrid.setBackground(new java.awt.Color(222, 222, 222));
        pnlButtonGrid.setPreferredSize(new java.awt.Dimension(900, 800));
        pnlButtonGrid.setLayout(new java.awt.GridLayout(2, 3, 50, 150));

        btnA1.setBackground(new java.awt.Color(229, 229, 229));
        btnA1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnA1.setText("A-1");
        btnA1.setToolTipText("");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnA1);

        btnB1.setBackground(new java.awt.Color(229, 229, 229));
        btnB1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnB1.setText("B-1");
        btnB1.setToolTipText("");
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnB1);

        btnC1.setBackground(new java.awt.Color(229, 229, 229));
        btnC1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnC1.setText("C-1");
        btnC1.setToolTipText("");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnC1);

        btnD1.setBackground(new java.awt.Color(229, 229, 229));
        btnD1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnD1.setText("D-1");
        btnD1.setToolTipText("");
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnD1);

        btnE1.setBackground(new java.awt.Color(229, 229, 229));
        btnE1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnE1.setText("E-1");
        btnE1.setToolTipText("");
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnE1);

        btnF1.setBackground(new java.awt.Color(229, 229, 229));
        btnF1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnF1.setText("F-1");
        btnF1.setToolTipText("");
        btnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnF1);

        btnA2.setBackground(new java.awt.Color(229, 229, 229));
        btnA2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnA2.setText("A-2");
        btnA2.setToolTipText("");
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnA2);

        btnB2.setBackground(new java.awt.Color(229, 229, 229));
        btnB2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnB2.setText("B-2");
        btnB2.setToolTipText("");
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnB2);

        btnC2.setBackground(new java.awt.Color(229, 229, 229));
        btnC2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnC2.setText("C-2");
        btnC2.setToolTipText("");
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnC2);

        btnD2.setBackground(new java.awt.Color(229, 229, 229));
        btnD2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnD2.setText("D-2");
        btnD2.setToolTipText("");
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnD2);

        btnE2.setBackground(new java.awt.Color(229, 229, 229));
        btnE2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnE2.setText("E-2");
        btnE2.setToolTipText("");
        btnE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE2ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnE2);

        btnF2.setBackground(new java.awt.Color(229, 229, 229));
        btnF2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btnF2.setText("F-2");
        btnF2.setToolTipText("");
        btnF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2ActionPerformed(evt);
            }
        });
        pnlButtonGrid.add(btnF2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlReserve.add(pnlButtonGrid, gridBagConstraints);

        pnlCards.add(pnlReserve, "cardReserve");

        pnlSeeSlots.setBackground(new java.awt.Color(214, 214, 214));
        pnlSeeSlots.setLayout(new java.awt.BorderLayout());

        pnlStats.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Occupied Slots");
        jPanel2.add(jLabel4);

        lblOccupied.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblOccupied.setForeground(new java.awt.Color(255, 51, 51));
        lblOccupied.setText("0");
        jPanel2.add(lblOccupied);

        pnlStats.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Available Slots");
        jPanel4.add(jLabel3);

        lblAvailable.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblAvailable.setForeground(new java.awt.Color(255, 51, 51));
        lblAvailable.setText("12");
        jPanel4.add(lblAvailable);

        pnlStats.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(214, 214, 214));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total Revenue");
        jPanel5.add(jLabel6);

        lblRevenue.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblRevenue.setForeground(new java.awt.Color(255, 51, 51));
        lblRevenue.setText("Php 0.00");
        jPanel5.add(lblRevenue);

        pnlStats.add(jPanel5);

        pnlSeeSlots.add(pnlStats, java.awt.BorderLayout.PAGE_START);

        tblReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Slot ID", "Driver Name", "Plate Number", "Contact Number", "Type", "Fee", "Time In"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservations.setRowHeight(16);
        tblReservations.setSelectionBackground(new java.awt.Color(214, 214, 214));
        tblReservations.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblReservations.setShowGrid(false);
        jScrollPane1.setViewportView(tblReservations);

        pnlSeeSlots.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setText("Type Here");
        txtSearch.setPreferredSize(new java.awt.Dimension(200, 40));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        SearchPanel.add(txtSearch);

        btnAdd.setBackground(new java.awt.Color(255, 51, 51));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Find");
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.setPreferredSize(new java.awt.Dimension(72, 40));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        SearchPanel.add(btnAdd);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Slot ID", "Plate Number", "Driver Name" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(107, 40));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        SearchPanel.add(jComboBox1);

        pnlSeeSlots.add(SearchPanel, java.awt.BorderLayout.PAGE_END);

        pnlCards.add(pnlSeeSlots, "cardSeeSlots");

        getContentPane().add(pnlCards, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        setActiveButton(btnReserve);
        CardLayout cl = (CardLayout) pnlCards.getLayout();
        cl.show(pnlCards, "cardReserve");
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setActiveButton(btnHome);
        CardLayout cl = (CardLayout) pnlCards.getLayout();
        cl.show(pnlCards, "cardHome");
    }//GEN-LAST:event_btnHomeActionPerformed
    private void setActiveButton(javax.swing.JButton clickedButton) {

        btnHome.setBackground(defaultSidebar);
        btnReserve.setBackground(defaultSidebar);
        btnSeeSlot.setBackground(defaultSidebar);
        btnExit.setBackground(defaultSidebar);

        clickedButton.setBackground(activeRed);
    }
    private void btnSeeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeSlotActionPerformed
        setActiveButton(btnSeeSlot);
        CardLayout cl = (CardLayout) pnlCards.getLayout();
        cl.show(pnlCards, "cardSeeSlots");
    }//GEN-LAST:event_btnSeeSlotActionPerformed

    private void btnAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountsActionPerformed
        setActiveButton(btnReserve);
        CardLayout cl = (CardLayout) pnlCards.getLayout();
        cl.show(pnlCards, "cardReserve");
    }//GEN-LAST:event_btnAccountsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setActiveButton(btnExit);
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Are you sure you want to exit the Smart Parking System?",
                "Exit Confirmation",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        setActiveButton(btnExit);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed

    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnE1ActionPerformed

    private void btnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnF1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnE2ActionPerformed

    private void btnF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnF2ActionPerformed

    private void menuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteActionPerformed

        // 1. Get the row index as seen on the SCREEN
        int viewRow = tblReservations.getSelectedRow();

        if (viewRow != -1) {
            // 2. Convert View Index to Model Index (Important if you have filtered/sorted the table)
            int modelRow = tblReservations.convertRowIndexToModel(viewRow);

            // 3. Extract the data needed for the Database delete and history log
            String slotId = model.getValueAt(modelRow, 0).toString();
            String plate = model.getValueAt(modelRow, 2).toString();
            int fee = Integer.parseInt(model.getValueAt(modelRow, 5).toString());

            int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                    "Confirm checkout for Slot " + slotId + "?\nThis will finalize the payment and free the slot.",
                    "Release Slot",
                    javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                // 4. DATABASE INTEGRATION: Call the DAO to delete from DB
                dao.ParkingDAO daoObj = new dao.ParkingDAO();

                if (daoObj.deleteReservation(slotId, plate, fee)) {
                    // 5. UI UPDATE: Only remove from the screen if the DB delete was successful
                    model.removeRow(modelRow);
                    resetMapButton(slotId);
                    updateStats();

                    javax.swing.JOptionPane.showMessageDialog(this, "Checkout successful! Slot " + slotId + " is now available.");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error: Could not delete from database. Please check your connection.");
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a reservation from the table first.");
        }
    }//GEN-LAST:event_menuDeleteActionPerformed

    private void menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateActionPerformed
        int viewRow = tblReservations.getSelectedRow();

        if (viewRow != -1) {
            int modelRow = tblReservations.convertRowIndexToModel(viewRow);

            // Get existing data to show in the dialog
            String slotId = model.getValueAt(modelRow, 0).toString();
            String name = model.getValueAt(modelRow, 1).toString();
            String plate = model.getValueAt(modelRow, 2).toString();
            String contact = model.getValueAt(modelRow, 3).toString();

            UpdateDialog dialog = new UpdateDialog(this, true);
            dialog.setFields(name, plate, contact);
            dialog.setVisible(true);

            if (dialog.isSucceeded()) {
                // 1. Update the Table Data
                String newName = dialog.getDriverName();
                String newPlate = dialog.getPlateNumber();
                String newContact = dialog.getContactNumber();

                model.setValueAt(newName, modelRow, 1);
                model.setValueAt(newPlate, modelRow, 2);
                model.setValueAt(newContact, modelRow, 3);

                // 2. THE FIX: Update the button's hover text on the map
                updateMapButtonToolTip(slotId, newName, newPlate);

                javax.swing.JOptionPane.showMessageDialog(this, "Reservation Updated!");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a row first!");
        }
    }//GEN-LAST:event_menuUpdateActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered

    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited

    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        filterTable(txtSearch.getText());

    }//GEN-LAST:event_btnAddActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        filterTable(txtSearch.getText());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().isEmpty()) {
            txtSearch.setText("Type Here");
            txtSearch.setForeground(java.awt.Color.GRAY); // Make it look like a placeholder
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        // Check if the current text is the default prompt
        if (txtSearch.getText().equals("Type Here")) {
            txtSearch.setText(""); // Clear the field
            txtSearch.setForeground(java.awt.Color.BLACK); // Ensure text is black when typing
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void menuHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistoryActionPerformed
        dao.ParkingDAO daoObj = new dao.ParkingDAO();
        String historyText = daoObj.getHistoryAsText();

        // Create a text area to hold the data with a Monospaced font for perfect alignment
        javax.swing.JTextArea textArea = new javax.swing.JTextArea(historyText);
        textArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        textArea.setEditable(false);

        // Wrap it in a scroll pane
        javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.JOptionPane.showMessageDialog(this, scrollPane, "Transaction History", javax.swing.JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuHistoryActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainDashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnAccounts;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnE2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnF1;
    private javax.swing.JButton btnF2;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnSeeSlot;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblOccupied;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JMenuItem menuDelete;
    private javax.swing.JMenuItem menuHistory;
    private javax.swing.JMenuItem menuUpdate;
    private javax.swing.JPanel pnlButtonGrid;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlReserve;
    private javax.swing.JPanel pnlSeeSlots;
    private javax.swing.JPanel pnlStats;
    private javax.swing.JTable tblReservations;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void handleReservation(javax.swing.JButton slotButton) {
        String slotID = slotButton.getText().trim();

        ReserveDialog dialog = new ReserveDialog(this, true);
        dialog.setVisible(true);

        if (dialog.isSucceeded()) {
            String name = dialog.getDriverName();
            String plate = dialog.getPlateNumber();
            String contact = dialog.getContactNumber();
            String type = dialog.getCustomerType();

            // FAIL-SAFE: If the word 'Employee' is chosen, the fee MUST be 0
            int fee = 50;
            if (type != null && type.trim().equalsIgnoreCase("Employee")) {
                fee = 0;
                type = "Employee"; // Normalize it
            } else if (type != null && type.trim().equalsIgnoreCase("Senior Citizen")) {
                fee = 30;
            }

            dao.ParkingDAO daoObj = new dao.ParkingDAO();
            model.Reservation res = new model.Reservation(slotID, name, plate, contact, type, fee, "");

            boolean saved = false;
            if (type.equals("Employee")) {
                saved = daoObj.addEmployee(res);
            } else {
                saved = daoObj.addReservation(res);
            }

            if (saved) {
                slotButton.setBackground(new java.awt.Color(255, 51, 51));
                slotButton.setForeground(java.awt.Color.WHITE);

                // This ensures the popup says "Php 0.00"
                String formattedFee = String.format("%.2f", (double) fee);
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Successfully registered as " + type + " (Fee: Php " + formattedFee + ")");

                loadExistingData(); // This refreshes the table to show the 0
                updateStats();
            }
        }
    }

    private void updateStats() {
        dao.ParkingDAO daoObj = new dao.ParkingDAO();

        // 1. Get the combined count from the DAO
        int occupied = daoObj.getTotalOccupied();

        // 2. Calculate available (12 total slots - occupied)
        int totalSlots = 12;
        int available = totalSlots - occupied;

        // 3. Get Revenue
        double revenue = (double) daoObj.getTotalRevenue();

        // 4. Force the text to update
        lblOccupied.setText(String.valueOf(occupied));
        lblAvailable.setText(String.valueOf(available));
        lblRevenue.setText(String.format("Php %.2f", revenue));

        // 5. Debugging: This will print the numbers in your NetBeans terminal
        // so you can see if the code is actually running
        System.out.println("Stats Updated - Occupied: " + occupied + ", Available: " + available);
    }

    private void resetMapButton(String slotId) {
        javax.swing.JButton[] allSlots = {
            btnA1, btnB1, btnC1, btnD1, btnE1, btnF1,
            btnA2, btnB2, btnC2, btnD2, btnE2, btnF2
        };

        for (javax.swing.JButton btn : allSlots) {
            // We check if the button text is exactly the slotId
            if (btn.getText().equals(slotId)) {
                btn.setBackground(new java.awt.Color(240, 240, 240)); // Default Gray
                btn.setForeground(java.awt.Color.BLACK);
                btn.setText(slotId);
                btn.setToolTipText(null); // This REMOVES the plate number hover text
                break;
            }
        }

    }

    private void filterTable(String query) {
        // 1. Create the sorter for the table
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> sorter
                = new javax.swing.table.TableRowSorter<>((javax.swing.table.DefaultTableModel) tblReservations.getModel());
        tblReservations.setRowSorter(sorter);

        // 2. THE FIX: If the search box is empty OR contains the placeholder, show EVERYTHING
        if (query == null || query.trim().isEmpty() || query.equalsIgnoreCase("Type Here")) {
            sorter.setRowFilter(null);
        } else {
            // 3. Determine which column to search
            String selection = jComboBox1.getSelectedItem().toString();
            int columnIndex = -1; // Default -1 means search "All" columns

            switch (selection) {
                case "Slot ID":
                    columnIndex = 0;
                    break;
                case "Driver Name":
                    columnIndex = 1;
                    break;
                case "Plate Number":
                    columnIndex = 2;
                    break;
                default:
                    columnIndex = -1;
                    break; // Covers "All"
            }

            try {
                if (columnIndex == -1) {
                    // Search across all columns
                    sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + query));
                } else {
                    // Search ONLY in the specific selected column
                    sorter.setRowFilter(javax.swing.RowFilter.regexFilter("(?i)" + query, columnIndex));
                }
            } catch (java.util.regex.PatternSyntaxException e) {
                // Prevents errors if the user types special characters
            }
        }
    }

    private void updateMapButtonToolTip(String slotId, String name, String plate) {
        javax.swing.JButton[] allSlots = {
            btnA1, btnB1, btnC1, btnD1, btnE1, btnF1,
            btnA2, btnB2, btnC2, btnD2, btnE2, btnF2
        };

        for (javax.swing.JButton btn : allSlots) {
            // Strip HTML to find the correct button
            String cleanId = btn.getText().replaceAll("<[^>]*>", "").trim();

            if (cleanId.equals(slotId)) {
                // Update the hover text with the new data
                btn.setToolTipText("<html><b>Driver:</b> " + name + "<br><b>Plate:</b> " + plate + "</html>");
                break;
            }
        }
    }

    private void loadExistingData() {
        dao.ParkingDAO daoObj = new dao.ParkingDAO();
        java.util.List<model.Reservation> activeList = daoObj.getAllActive();

        model.setRowCount(0);

        for (model.Reservation res : activeList) {
            model.addRow(new Object[]{
                res.getSlotId(), res.getName(), res.getPlate(),
                res.getContact(), res.getType(), res.getFee(), res.getTimeIn()
            });
            updateMapButtonVisuals(res.getSlotId(), res.getName(), res.getPlate());
        }
        updateStats();
    }

    private void updateMapButtonVisuals(String slotId, String name, String plate) {
        javax.swing.JButton[] allSlots = {
            btnA1, btnB1, btnC1, btnD1, btnE1, btnF1,
            btnA2, btnB2, btnC2, btnD2, btnE2, btnF2
        };

        for (javax.swing.JButton btn : allSlots) {
            if (btn.getText().trim().equals(slotId)) {
                btn.setBackground(new java.awt.Color(255, 51, 51));
                btn.setForeground(java.awt.Color.WHITE);
                btn.setToolTipText("<html><b>Driver:</b> " + name + "<br><b>Plate:</b> " + plate + "</html>");
                break;
            }
        }
    }

    private void openLoginRegistration(javax.swing.JButton slotButton) {
        String slotID = slotButton.getText();

        // 1. Open your Login popup
        LogInDialog dialog = new LogInDialog(this, true);
        dialog.setVisible(true);

        // 2. If they clicked the Log-in button in the popup
        if (dialog.isSucceeded()) {
            // Here you would call your DAO to save the username/password/role

            // 3. Change the slot color to Red to show it is "Reserved"
            slotButton.setBackground(new java.awt.Color(255, 51, 51));
            slotButton.setForeground(java.awt.Color.WHITE);

            javax.swing.JOptionPane.showMessageDialog(this, "Employee registered to " + slotID);
        }
    }

}
