package view;

public class ReserveDialog extends javax.swing.JDialog {

    private boolean succeeded = false;
    private boolean isPaid = false;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReserveDialog.class.getName());

    public ReserveDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnReserve.setEnabled(false);
        java.awt.EventQueue.invokeLater(() -> {
            txtName.requestFocusInWindow();
        });

        btnReserve.setBackground(new java.awt.Color(204, 204, 204)); // Gray
        setLocationRelativeTo(parent);

    }

    public void setFields(String name, String plate, String contact) {
        txtName.setText(name);
        txtPlate.setText(plate);
        txtContact.setText(contact);

        // Since we are updating, we bypass the lock
        this.isPaid = true;
        btnReserve.setEnabled(true);
        btnReserve.setText("Update Record");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtPlate = new javax.swing.JTextField();
        plate = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        btnReserve = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        chkNonSenior = new javax.swing.JCheckBox();
        chkSenior = new javax.swing.JCheckBox();
        lblPlateStatus = new javax.swing.JLabel();
        lblContactStatus = new javax.swing.JLabel();
        chkEmployee = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 222, 222));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reserve Slot");

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Name");

        txtName.setPreferredSize(new java.awt.Dimension(400, 35));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtContact.setPreferredSize(new java.awt.Dimension(400, 35));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });

        txtPlate.setPreferredSize(new java.awt.Dimension(400, 35));
        txtPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlateActionPerformed(evt);
            }
        });
        txtPlate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlateKeyReleased(evt);
            }
        });

        plate.setBackground(new java.awt.Color(0, 0, 0));
        plate.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        plate.setForeground(new java.awt.Color(0, 0, 0));
        plate.setText("Plate Number");

        contact.setBackground(new java.awt.Color(0, 0, 0));
        contact.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(0, 0, 0));
        contact.setText("Contact Number");

        btnReserve.setBackground(new java.awt.Color(255, 51, 51));
        btnReserve.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnReserve.setForeground(new java.awt.Color(255, 255, 255));
        btnReserve.setText("Reserve");
        btnReserve.setBorderPainted(false);
        btnReserve.setFocusPainted(false);
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReserveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReserveMouseExited(evt);
            }
        });
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\634769c5645bf6004a35c9fc91236cae.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        chkNonSenior.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        chkNonSenior.setForeground(new java.awt.Color(0, 0, 0));
        chkNonSenior.setText("Regular Citizen");
        chkNonSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNonSeniorActionPerformed(evt);
            }
        });

        chkSenior.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        chkSenior.setForeground(new java.awt.Color(0, 0, 0));
        chkSenior.setText("Senior Citizen");
        chkSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSeniorActionPerformed(evt);
            }
        });

        lblPlateStatus.setFont(new java.awt.Font("Tw Cen MT", 0, 10)); // NOI18N
        lblPlateStatus.setToolTipText("");
        lblPlateStatus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblPlateStatus.setPreferredSize(new java.awt.Dimension(55, 10));

        lblContactStatus.setFont(new java.awt.Font("Tw Cen MT", 0, 10)); // NOI18N
        lblContactStatus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblContactStatus.setPreferredSize(new java.awt.Dimension(55, 10));

        chkEmployee.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        chkEmployee.setForeground(new java.awt.Color(0, 0, 0));
        chkEmployee.setText("Employee");
        chkEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(268, 268, 268))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(plate)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtPlate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(contact)
                            .addComponent(lblPlateStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(chkNonSenior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkSenior, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkEmployee)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(plate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblPlateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(lblContactStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNonSenior)
                    .addComponent(chkSenior)
                    .addComponent(chkEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSeniorActionPerformed
        if (chkSenior.isSelected()) {
            chkNonSenior.setSelected(false);
            chkEmployee.setSelected(false);

            // LOCK the button
            btnReserve.setEnabled(false);
            btnReserve.setBackground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_chkSeniorActionPerformed

    private void chkNonSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNonSeniorActionPerformed
        if (chkNonSenior.isSelected()) {
            chkSenior.setSelected(false);
            chkEmployee.setSelected(false);

            // LOCK button (They must pay via QR first)
            btnReserve.setEnabled(false);
            btnReserve.setBackground(new java.awt.Color(204, 204, 204));
        }
    }//GEN-LAST:event_chkNonSeniorActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        javax.swing.JOptionPane.showMessageDialog(this, "Payment Successful!", "QR Scanner", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // This line stays as it is to unlock the button:
        btnReserve.setEnabled(true);

        btnReserve.setBackground(new java.awt.Color(255, 51, 51));
        btnReserve.setText("Reserve");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // 1. Basic Field Validation
        String nameValue = txtName.getText().trim();
        String plateValue = txtPlate.getText().trim();

        if (nameValue.isEmpty() || plateValue.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        // 2. THE GATEKEEPER: Only prompt if Employee is checked
        if (chkEmployee.isSelected()) {
            String input = javax.swing.JOptionPane.showInputDialog(this,
                    "Employee Verification Required:\nEnter Password",
                    "Security Check",
                    javax.swing.JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                return; // User clicked cancel
            }
            if (!input.equals("password123")) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Incorrect Password! Only verified employees can bypass payment.",
                        "Access Denied",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                return; // EXIT - Do not save reservation
            }

            // If they got here, password was correct
            javax.swing.JOptionPane.showMessageDialog(this, "Employee Verified.");
        }
        // NOTE: Regulars/Seniors don't even reach this button unless you manually 
        // enable it elsewhere after your QR payment logic is finished.

        // 3. Finalize Reservation
        this.succeeded = true;
        this.dispose();
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnReserveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseExited

    }//GEN-LAST:event_btnReserveMouseExited

    private void btnReserveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseEntered

    }//GEN-LAST:event_btnReserveMouseEntered

    private void txtPlateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlateKeyReleased
        // 1. Force everything to Uppercase immediately
        String text = txtPlate.getText().toUpperCase();
        txtPlate.setText(text);

        // 2. Real-time validation check
        // This regex checks for exactly 3 letters and 4 numbers
        if (text.matches("^[A-Z]{3}[0-9]{4}$")) {
            lblPlateStatus.setText("✓ Valid Plate Format");
            lblPlateStatus.setForeground(new java.awt.Color(0, 153, 0)); // Professional Green
        } else if (text.isEmpty()) {
            lblPlateStatus.setText(""); // Keep it hidden if empty
        } else {
            lblPlateStatus.setText("Required: 3 Letters + 4 Numbers (e.g., ABC1234)");
            lblPlateStatus.setForeground(java.awt.Color.RED);
        }
        if (text.isEmpty()) {
            lblPlateStatus.setText(" "); // Use a space instead of ""
        }
    }//GEN-LAST:event_txtPlateKeyReleased

    private void txtPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlateActionPerformed

    }//GEN-LAST:event_txtPlateActionPerformed

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        String text = txtContact.getText().trim();

        // Check if it is exactly 11 digits
        if (text.matches("^[0-9]{11}$")) {
            lblContactStatus.setText("✓ Valid Contact Number");
            lblContactStatus.setForeground(new java.awt.Color(0, 153, 0)); // Green
        } else if (text.isEmpty()) {
            lblContactStatus.setText("");
        } else {
            lblContactStatus.setText("Required: Exactly 11 digits (e.g., 09123456789)");
            lblContactStatus.setForeground(java.awt.Color.RED); // Red
            if (text.isEmpty()) {
                lblPlateStatus.setText(" "); // Use a space instead of ""
            }
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed

    }//GEN-LAST:event_txtContactActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void chkEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEmployeeActionPerformed
        if (chkEmployee.isSelected()) {
            chkNonSenior.setSelected(false);
            chkSenior.setSelected(false);

            // UNLOCK the button only for employees
            btnReserve.setEnabled(true);
            btnReserve.setBackground(new java.awt.Color(255, 51, 51)); // Bright Red
        } else {
            btnReserve.setEnabled(false);
            btnReserve.setBackground(new java.awt.Color(204, 204, 204));
        }

    }//GEN-LAST:event_chkEmployeeActionPerformed

    public String getDriverName() {
        return txtName.getText();
    }

    public String getPlateNumber() {
        return txtPlate.getText();
    }

    public String getContactNumber() {
        return txtContact.getText();
    }

    public boolean isSucceeded() {
        return succeeded;
    }

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ReserveDialog dialog = new ReserveDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReserve;
    private javax.swing.JCheckBox chkEmployee;
    private javax.swing.JCheckBox chkNonSenior;
    private javax.swing.JCheckBox chkSenior;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContactStatus;
    private javax.swing.JLabel lblPlateStatus;
    private javax.swing.JLabel name;
    private javax.swing.JLabel plate;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPlate;
    // End of variables declaration//GEN-END:variables
public boolean isSenior() {
        return chkSenior.isSelected();
    }

    public String getCustomerType() {
        return chkSenior.isSelected() ? "Senior Citizen" : "Regular";
    }
}
