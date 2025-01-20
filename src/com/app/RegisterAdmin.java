
package com.app;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class RegisterAdmin extends javax.swing.JFrame {
    
    private int selectedRow; 
    
    public RegisterAdmin() {
        initComponents();
        loadDataFromFile();
      
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        tfCPassword = new javax.swing.JPasswordField();
        btRegister = new javax.swing.JButton();
        tfLastName = new javax.swing.JTextField();
        btBackMenu = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        btRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Registration");
        setPreferredSize(new java.awt.Dimension(1310, 655));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 700));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1400, 700));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 68, 151));
        jLabel2.setText("Admin");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 68, 151));
        jLabel3.setText("REGISTRATION");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Username");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Confirm password");

        tfFirstName.setPreferredSize(new java.awt.Dimension(64, 26));

        tfEmail.setPreferredSize(new java.awt.Dimension(64, 26));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Password");

        tfUsername.setPreferredSize(new java.awt.Dimension(64, 26));

        btRegister.setBackground(new java.awt.Color(7, 68, 151));
        btRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btRegister.setForeground(new java.awt.Color(255, 255, 255));
        btRegister.setText("Register");
        btRegister.setMaximumSize(new java.awt.Dimension(75, 27));
        btRegister.setMinimumSize(new java.awt.Dimension(75, 27));
        btRegister.setPreferredSize(new java.awt.Dimension(75, 27));
        btRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterActionPerformed(evt);
            }
        });

        tfLastName.setPreferredSize(new java.awt.Dimension(64, 26));

        btBackMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Back.png"))); // NOI18N
        btBackMenu.setBorderPainted(false);
        btBackMenu.setContentAreaFilled(false);
        btBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackMenuActionPerformed(evt);
            }
        });

        btUpdate.setBackground(new java.awt.Color(7, 68, 151));
        btUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btUpdate.setText("Update");
        btUpdate.setMaximumSize(new java.awt.Dimension(75, 27));
        btUpdate.setMinimumSize(new java.awt.Dimension(75, 27));
        btUpdate.setPreferredSize(new java.awt.Dimension(75, 27));
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        tfSearchBar.setPreferredSize(new java.awt.Dimension(64, 26));
        tfSearchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchBarKeyReleased(evt);
            }
        });

        tbAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last name", "Email", "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(tbAdmin);

        btRemove.setBackground(new java.awt.Color(7, 68, 151));
        btRemove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btRemove.setForeground(new java.awt.Color(255, 255, 255));
        btRemove.setText("Remove");
        btRemove.setMaximumSize(new java.awt.Dimension(75, 27));
        btRemove.setMinimumSize(new java.awt.Dimension(75, 27));
        btRemove.setPreferredSize(new java.awt.Dimension(75, 27));
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Search here");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBackMenu)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4)
                                .addComponent(tfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addComponent(tfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)
                                .addComponent(tfCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btBackMenu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchBarKeyReleased
        DefaultTableModel model = (DefaultTableModel) tbAdmin.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        tbAdmin.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(tfSearchBar.getText()));
    }//GEN-LAST:event_tfSearchBarKeyReleased

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        
        try {
            DefaultTableModel model = (DefaultTableModel) tbAdmin.getModel();
            SystemUser admin = new SystemUser();
            this.selectedRow = tbAdmin.getSelectedRow();
            if (selectedRow != -1) {
                admin.setFirstName(JOptionPane.showInputDialog(RegisterAdmin.this, "First Name (Please don't leave it blank)"));
                admin.setLastname(JOptionPane.showInputDialog(RegisterAdmin.this, "Last Name (Please don't leave it blank)"));
                admin.setEmail(JOptionPane.showInputDialog(RegisterAdmin.this, "Email (Please don't leave it blank)"));
                admin.setUsername(JOptionPane.showInputDialog(RegisterAdmin.this, "Username (Please don't leave it blank)"));
                admin.setPassword(JOptionPane.showInputDialog(RegisterAdmin.this, "Password (Please don't leave it blank)"));

                String firstName = admin.getFirstName();
                String lastName = admin.getLastName();
                String email = admin.getEmail();
                String username = admin.getUsername();
                String password = admin.getPassword();

                if (firstName != null && lastName != null && email != null && username != null && password != null) {
                    model.setValueAt(firstName, selectedRow, 0);
                    model.setValueAt(lastName, selectedRow, 1);
                    model.setValueAt(email, selectedRow, 2);
                    model.setValueAt(username, selectedRow, 3);
                    model.setValueAt(password, selectedRow, 4);

                    updateTextFile();
                }
            } else {
                JOptionPane.showMessageDialog(this,
                    "Please select a row to update!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "An error occurred!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btUpdateActionPerformed


    private void btBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackMenuActionPerformed
        AdminMenu backToAdminMenu = new AdminMenu();
        backToAdminMenu.setVisible(true);
        backToAdminMenu.pack();
        backToAdminMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btBackMenuActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        SystemUser admin = new SystemUser();
        
        admin.setFirstName(tfFirstName.getText());
        admin.setLastname(tfLastName.getText());
        admin.setEmail(tfEmail.getText());
        admin.setUsername(tfUsername.getText());
        char[] passwordContain = tfPassword.getPassword();
        admin.setPassword(new String(passwordContain));
        char[] confirmPasswordContain = tfCPassword.getPassword();
        admin.setConfirmPassword(new String(confirmPasswordContain));
        
        
        String firstName = admin.getFirstName();
        String lastName = admin.getLastName();
        String email = admin.getEmail();
        String username = admin.getUsername();
        String password = admin.getPassword();
        String confirmPassword = admin.getConfirmPassword();
        
       

        if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Please select a row to update!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        } else if(!(password.equals(confirmPassword))){
            JOptionPane.showMessageDialog(this,
                "Passwords don't match!",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);

        } else {
            DefaultTableModel model = (DefaultTableModel) tbAdmin.getModel();
            model.addRow(new Object[]{firstName, lastName, email, username, password});

            try{
                FileWriter writeAdminRecord = new FileWriter("AdminRecords.txt", true);
                writeAdminRecord.write(firstName + "  " + lastName + "  " + email + "  " + username + "  " + password);
                writeAdminRecord.write(System.getProperty("line.separator"));
                writeAdminRecord.close();

                JOptionPane.showMessageDialog(this,
                    "Successfully registered!",
                    "Succeed",
                    JOptionPane.INFORMATION_MESSAGE);

                tfFirstName.setText("");
                tfLastName.setText("");
                tfEmail.setText("");
                tfUsername.setText("");
                tfPassword.setText("");
                tfCPassword.setText("");

            } catch(HeadlessException | IOException e) {    
                JOptionPane.showMessageDialog(null,
                "An error occurred!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        this.selectedRow = tbAdmin.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, 
                    "No row is selected! Please select one.",
                    "Select Row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel)tbAdmin.getModel();
            model.removeRow(selectedRow);
            updateTextFile();
            
        }
    }//GEN-LAST:event_btRemoveActionPerformed

     private void loadDataFromFile() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbAdmin.getModel();
            BufferedReader reader = new BufferedReader(new FileReader("AdminRecords.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split("  ")); 
            }
            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                "An error occurred!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTextFile() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbAdmin.getModel();
            BufferedWriter writer = new BufferedWriter(new FileWriter("AdminRecords.txt"));
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    writer.write(model.getValueAt(row, col).toString());
                    if (col < model.getColumnCount() - 1) {
                        writer.write("  ");
                    }
                }
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                "An error occurred!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackMenu;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JPasswordField tfCPassword;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfSearchBar;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
