package com.app;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class RegisterHR extends javax.swing.JFrame {

    private int selectedRow;
            
    public RegisterHR() {
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
        tfConfirmPassword = new javax.swing.JPasswordField();
        btRegister = new javax.swing.JButton();
        tfLastName = new javax.swing.JTextField();
        btBackToAdminMenu = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        btRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbHRDesignation = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_HR = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR Registration");
        setPreferredSize(new java.awt.Dimension(1420, 655));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 700));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 700));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 68, 151));
        jLabel2.setText("Human Resource");

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

        btBackToAdminMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Back.png"))); // NOI18N
        btBackToAdminMenu.setBorderPainted(false);
        btBackToAdminMenu.setContentAreaFilled(false);
        btBackToAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackToAdminMenuActionPerformed(evt);
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

        cbHRDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Assistant" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Designation");

        Table_HR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Designation", "Email", "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(Table_HR);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBackToAdminMenu)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(tfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cbHRDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(302, 302, 302))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btBackToAdminMenu)
                                .addGap(151, 151, 151))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
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
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbHRDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(tfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 431, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1908, Short.MAX_VALUE)
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
        DefaultTableModel model = (DefaultTableModel) Table_HR.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        Table_HR.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(tfSearchBar.getText()));
    }//GEN-LAST:event_tfSearchBarKeyReleased

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) Table_HR.getModel();
            this.selectedRow = Table_HR.getSelectedRow();

            SystemUser hr = new SystemUser();

            if (selectedRow != -1) {
                hr.setFirstName(JOptionPane.showInputDialog(RegisterHR.this, "First Name (Please don't leave it blank)"));
                hr.setLastname(JOptionPane.showInputDialog(RegisterHR.this, "Last Name (Please don't leave it blank)"));

                String[] options = {"Manager", "Assistant"};
                JComboBox designationaCombo = new JComboBox(options);
                int result = JOptionPane.showOptionDialog(null, designationaCombo, "Select an Option",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                if (result == JOptionPane.OK_OPTION) {
                    // Get the selected item from the combo box
                    hr.setDesignation((String) designationaCombo.getSelectedItem());
                }

                hr.setEmail(JOptionPane.showInputDialog(RegisterHR.this, "Email (Please don't leave it blank)"));
                hr.setUsername(JOptionPane.showInputDialog(RegisterHR.this, "Username (Please don't leave it blank)"));
                hr.setPassword(JOptionPane.showInputDialog(RegisterHR.this, "Password(Please don't leave it blank)"));

                String firstName = hr.getFirstName();
                String lastName = hr.getLastName();
                String designation = hr.getDesignation();
                String email = hr.getEmail();
                String username = hr.getUsername();
                String password = hr.getPassword();

                if (firstName != null && lastName != null && designation != null && email != null && username != null && password != null) {
                    model.setValueAt(firstName, this.selectedRow, 0);
                    model.setValueAt(lastName, this.selectedRow, 1);
                    model.setValueAt(designation, this.selectedRow, 2);
                    model.setValueAt(email, this.selectedRow, 3);
                    model.setValueAt(username, this.selectedRow, 4);
                    model.setValueAt(password, this.selectedRow, 5);

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


    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed

        try {
            SystemUser hr = new SystemUser();
            hr.setFirstName(tfFirstName.getText());
            hr.setLastname(tfLastName.getText());
            hr.setDesignation((String) cbHRDesignation.getSelectedItem());
            hr.setEmail(tfEmail.getText());
            hr.setUsername(tfUsername.getText());
            hr.setPasswordContain(tfPassword.getPassword());
            char[] passwordContain = hr.getPasswordContain();
            hr.setPassword(new String(passwordContain));
            hr.setConfirmPasswordContain(tfConfirmPassword.getPassword());
            char[] confirmPasswordContain = hr.getConfirmPasswordContain();
            hr.setConfirmPassword(new String(confirmPasswordContain));

            String firstName = hr.getFirstName();
            String lastName = hr.getLastName();
            String designation = hr.getDesignation();
            String email = hr.getEmail();
            String username = hr.getUsername();
            String password = hr.getPassword();
            String confirmPassword = hr.getConfirmPassword();

            if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() 
                    || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please enter all fields",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);

            } else if (!(password.equals(confirmPassword))) {
                JOptionPane.showMessageDialog(this,
                        "Passwords do not match!",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel model = (DefaultTableModel) Table_HR.getModel();
                model.addRow(new Object[]{firstName, lastName, designation, email, username, password});

                try {
                    FileWriter writeAdminRecord = new FileWriter("HRRecords.txt", true);
                    writeAdminRecord.write(firstName + "  " + lastName + "  " + 
                            designation + "  " + email + "  " + username + "  " + password);
                    
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
                    tfConfirmPassword.setText("");

                } catch (HeadlessException | IOException e) {
                    JOptionPane.showMessageDialog(null,
                            e,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                            e,
                            "error",
                            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
      
        this.selectedRow = Table_HR.getSelectedRow();
        
        if(this.selectedRow < 0){
            JOptionPane.showMessageDialog(this, 
                    "No row is selected! Please select one.",
                    "Select Row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel)Table_HR.getModel();
            model.removeRow(this.selectedRow);
            updateTextFile();
            
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btBackToAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackToAdminMenuActionPerformed
        AdminMenu backToAdminMenu = new AdminMenu();
        backToAdminMenu.setVisible(true);
        backToAdminMenu.pack();
        backToAdminMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btBackToAdminMenuActionPerformed

     private void loadDataFromFile() {
        try {
            DefaultTableModel model = (DefaultTableModel) Table_HR.getModel();
            BufferedReader reader = new BufferedReader(new FileReader("HRRecords.txt"));
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
            DefaultTableModel model = (DefaultTableModel) Table_HR.getModel();
            BufferedWriter writer = new BufferedWriter(new FileWriter("HRRecords.txt"));
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
    private javax.swing.JTable Table_HR;
    private javax.swing.JButton btBackToAdminMenu;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbHRDesignation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPasswordField tfConfirmPassword;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfSearchBar;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
