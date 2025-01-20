
package com.app;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class RegisterEmployee extends javax.swing.JFrame {
    private String[] depName;
    private String[] designationName;
    private int selectedRow;
  
    public RegisterEmployee() {
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
        tfFirstName = new javax.swing.JTextField();
        tfEpfNo = new javax.swing.JTextField();
        btRegister = new javax.swing.JButton();
        tfLastName = new javax.swing.JTextField();
        btBackToHRMenu = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEmployee = new javax.swing.JTable();
        btRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        cbDepartment = new javax.swing.JComboBox<>();
        cbDesignation = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Registration");
        setPreferredSize(new java.awt.Dimension(1400, 730));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 730));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 730));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 68, 151));
        jLabel2.setText("Employee");

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
        jLabel7.setText("Department");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("EPF No.");

        tfFirstName.setPreferredSize(new java.awt.Dimension(64, 26));

        tfEpfNo.setPreferredSize(new java.awt.Dimension(64, 26));

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

        btBackToHRMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Back.png"))); // NOI18N
        btBackToHRMenu.setBorderPainted(false);
        btBackToHRMenu.setContentAreaFilled(false);
        btBackToHRMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackToHRMenuActionPerformed(evt);
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

        tbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last name", "Department", "Designation", "EPF No.", "Email"
            }
        ));
        jScrollPane2.setViewportView(tbEmployee);

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Designation");

        tfEmail.setPreferredSize(new java.awt.Dimension(64, 26));

        String folderPath = "Department/";

        // Create a File object for the folder
        File folder = new File(folderPath);

        // Get the list of files in the folder
        File[] files = folder.listFiles();

        depName = new String[files.length];
        if (files != null) {
            // Loop through the files and print their names
            for (int i = 0; i < depName.length; i++) {
                depName[i] = files[i].getName().replace(".txt", "");

            }
        } else {
            JOptionPane.showMessageDialog(null,
                "An error occurred!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(depName));
        cbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartmentActionPerformed(evt);
            }
        });

        int lineCounter = 0;
        int i = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("Department/" + depName[0] + ".txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                i++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        designationName = new String[i];

        try (BufferedReader reader = new BufferedReader(new FileReader("Department/" + depName[0] + ".txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                designationName[lineCounter] = line;
                lineCounter++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cbDesignation.setModel(new javax.swing.DefaultComboBoxModel<>(designationName));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btBackToHRMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(tfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(tfEpfNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(322, 322, 322))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
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
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfEpfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btBackToHRMenu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchBarKeyReleased
        DefaultTableModel model = (DefaultTableModel) tbEmployee.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        tbEmployee.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(tfSearchBar.getText()));
    }//GEN-LAST:event_tfSearchBarKeyReleased

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tbEmployee.getModel();
            Employee employee = new Employee();
            this.selectedRow = tbEmployee.getSelectedRow();
            String firstName;
            String lastName;
            String department;
            String designation;
            String epfNo;
            String email;


            if (selectedRow != -1) {
                employee.setFirstName(JOptionPane.showInputDialog(RegisterEmployee.this, "First Name (Please don't leave it blank)"));

                employee.setLastname(JOptionPane.showInputDialog(RegisterEmployee.this, "Last Name (Please don't leave it blank)"));

                try {
                    JComboBox departmentCombo = new JComboBox(depName);
                    int inputDep = JOptionPane.showOptionDialog(null, departmentCombo, "Select department",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

                    if (inputDep == JOptionPane.OK_OPTION) {
                        employee.setDepartment((String) departmentCombo.getSelectedItem());

                    }

                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(this,
                            "An error occurred " + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                department = employee.getDepartment();

                JComboBox<String> designationCombo = new JComboBox<>();
                designationCombo.removeAllItems();
                try ( BufferedReader reader = new BufferedReader(new FileReader("Department/" + department + ".txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        designationCombo.addItem(line);
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this,
                            "Error reading file: " + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                int inputDes = JOptionPane.showOptionDialog(null, designationCombo, "Select department",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                if (inputDes == JOptionPane.OK_OPTION) {
                    employee.setDesignation((String) designationCombo.getSelectedItem());
                }

                employee.setEpfNo(JOptionPane.showInputDialog(RegisterEmployee.this, "Epf No. (Please don't leave it blank)"));
                employee.setEmail(JOptionPane.showInputDialog(RegisterEmployee.this, "Email (Please don't leave it blank)"));

                firstName = employee.getFirstName();
                lastName = employee.getLastName();
                designation = employee.getDesignation();
                epfNo = employee.getEpfNo();
                email = employee.getEmail();

                if (firstName != null && lastName != null && epfNo != null && email != null) {
                    model.setValueAt(firstName, this.selectedRow, 0);
                    model.setValueAt(lastName, this.selectedRow, 1);
                    model.setValueAt(department, this.selectedRow, 2);
                    model.setValueAt(designation, this.selectedRow, 3);
                    model.setValueAt(epfNo, this.selectedRow, 4);
                    model.setValueAt(email, this.selectedRow, 5);

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


    private void btBackToHRMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackToHRMenuActionPerformed
        HRMenu backToMenu = new HRMenu();
        backToMenu.setVisible(true);
        backToMenu.pack();
        backToMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btBackToHRMenuActionPerformed

    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        try {
            Employee employee = new Employee();
            employee.setFirstName(tfFirstName.getText());
            employee.setLastname(tfLastName.getText());
            employee.setDepartment((String) cbDepartment.getSelectedItem());
            employee.setDesignation((String) cbDesignation.getSelectedItem());
            employee.setEpfNo(tfEpfNo.getText());
            employee.setEmail(tfEmail.getText());

            String firstName = employee.getFirstName();
            String lastName = employee.getLastName();
            String department = employee.getDepartment();
            String designation = employee.getDesignation();
            String epfNo = employee.getEpfNo();
            String email = employee.getEmail();


            if (firstName.isEmpty() || lastName.isEmpty() || epfNo.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please enter all fields",
                        "Try Again",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                DefaultTableModel model = (DefaultTableModel) tbEmployee.getModel();
                model.addRow(new Object[]{firstName, lastName, department, designation, epfNo, email});

                try {
                    FileWriter writeAdminRecord = new FileWriter("EmpolyeeRecords.txt", true);
                    writeAdminRecord.write(firstName + "  " + lastName + "  " + department + "  " + designation + "  " + epfNo + "  " + email);
                    writeAdminRecord.write(System.getProperty("line.separator"));
                    writeAdminRecord.close();

                    JOptionPane.showMessageDialog(this,
                            "Successfully registered!",
                            "Succeed",
                            JOptionPane.INFORMATION_MESSAGE);

                    tfFirstName.setText("");
                    tfLastName.setText("");
                    tfEmail.setText("");
                    tfEpfNo.setText("");

                } catch (HeadlessException | IOException e) {
                    JOptionPane.showMessageDialog(null,
                            "An error occurred!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "An error occurred!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRegisterActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        this.selectedRow = tbEmployee.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one.",
                    "Select Row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tbEmployee.getModel();
            model.removeRow(selectedRow);
            updateTextFile();

        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void cbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartmentActionPerformed
        cbDesignation.removeAllItems();
        String selectedDepartment = (String) cbDepartment.getSelectedItem();
        try ( BufferedReader reader = new BufferedReader(new FileReader("Department/" + selectedDepartment + ".txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                cbDesignation.addItem(line);
            }

            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "An error occurred!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbDepartmentActionPerformed

    private void loadDataFromFile() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbEmployee.getModel();
            BufferedReader reader = new BufferedReader(new FileReader("EmpolyeeRecords.txt"));
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
            DefaultTableModel model = (DefaultTableModel) tbEmployee.getModel();
            BufferedWriter writer = new BufferedWriter(new FileWriter("EmpolyeeRecords.txt"));
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
    private javax.swing.JButton btBackToHRMenu;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbDesignation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbEmployee;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEpfNo;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfSearchBar;
    // End of variables declaration//GEN-END:variables
}
