package com.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class RegisterDepartment extends javax.swing.JFrame {
    
    private int selectedRow;

    public RegisterDepartment() {
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
        jLabel7 = new javax.swing.JLabel();
        tfDepartmentName = new javax.swing.JTextField();
        btRegister = new javax.swing.JButton();
        btBackToAdminMenu = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        tfSearchBar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDeparment = new javax.swing.JTable();
        btRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDesignation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Department Registration");
        setPreferredSize(new java.awt.Dimension(1420, 655));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 700));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1500, 700));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 68, 151));
        jLabel2.setText("Department");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 68, 151));
        jLabel3.setText("REGISTRATION");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Department Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Designation (Please separate by comma. Eg: Senior, Junior)");

        tfDepartmentName.setPreferredSize(new java.awt.Dimension(64, 26));

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

        tbDeparment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department Name", "Designations"
            }
        ));
        jScrollPane2.setViewportView(tbDeparment);

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

        tfDesignation.setColumns(20);
        tfDesignation.setRows(5);
        jScrollPane1.setViewportView(tfDesignation);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btBackToAdminMenu)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(btRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(191, 191, 191))
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(tfDepartmentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(tfSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(224, 224, 224))))
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
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(tfDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(btBackToAdminMenu))))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1406, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1406, Short.MAX_VALUE)
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
        DefaultTableModel model = (DefaultTableModel) tbDeparment.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        tbDeparment.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(tfSearchBar.getText()));
    }//GEN-LAST:event_tfSearchBarKeyReleased


    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        try {
            this.selectedRow = tbDeparment.getSelectedRow();
            if (selectedRow != -1) {
                String newDesignations = JOptionPane.showInputDialog(RegisterDepartment.this,
                        "Enter new designations separated by commas");
                
                if (newDesignations != null) {
                    tbDeparment.setValueAt(newDesignations, selectedRow, 1);
                    updateTextFile(newDesignations, selectedRow);        
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Please select a row to update!",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "An error occurred!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btUpdateActionPerformed


    private void btBackToAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackToAdminMenuActionPerformed
        HRMenu backToMenu = new HRMenu();
        backToMenu.setVisible(true);
        backToMenu.pack();
        backToMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btBackToAdminMenuActionPerformed


    private void btRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbDeparment.getModel();
        Department dep = new Department(); 
        
        dep.setDepartment(tfDepartmentName.getText());
        dep.setDesignation(tfDesignation.getText().replaceAll("\\s", "")); 
        
        String department = dep.getDepartment();
        String designations = dep.getDesignation();
        
        String[] designationArray = designations.trim().split(",");
        String designationString = String.join(",", designationArray);
        
        if(department.isEmpty() || designations.isEmpty() ){
            JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
        } else {
            File file = new File(department + ".txt");

            try (FileWriter writer = new FileWriter("Department/" + file, true);  
                    BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

                for (String item : designationArray) {
                    bufferedWriter.write(item + "\n");
                }
                JOptionPane.showMessageDialog(this,
                        "Successfully registered!",
                        "Succeed",
                        JOptionPane.INFORMATION_MESSAGE);

                tfDepartmentName.setText("");
                tfDesignation.setText("");

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Error occurred while writing to file",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

            model.addRow(new Object[]{department, designationString});
        }  
    }//GEN-LAST:event_btRegisterActionPerformed

    
    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        this.selectedRow = tbDeparment.getSelectedRow();
        Department dep = new Department();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this,
                    "No row is selected! Please select one.",
                    "Select Row",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tbDeparment.getModel();
            dep.setDepartment((String) tbDeparment.getValueAt(selectedRow, 0));
            model.removeRow(this.selectedRow);

            String department = dep.getDepartment();
            
            String fileName = "Department/" + department + ".txt";
            File file = new File(fileName);
            if (file.exists()) {
                if (!file.delete()) {
                    JOptionPane.showMessageDialog(this, "Error removing file: " + fileName,
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void loadDataFromFile() {
        DefaultTableModel model = (DefaultTableModel) tbDeparment.getModel();
        Department dep2 = new Department();
        
        String folderPath = "Department";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    dep2.setDepartment(file.getName().replace(".txt", "")); 
                    
                    String department = dep2.getDepartment();

                    try ( BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        StringBuilder designationsBuilder = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            if (designationsBuilder.length() > 0) {
                                designationsBuilder.append(", ");
                            }
                            designationsBuilder.append(line.trim());
                        }
                        model.addRow(new Object[]{department, designationsBuilder.toString()});
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null,
                                "An error occurred!",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }

    private void updateTextFile(String newDesignations, int rowIndex) {
    try {
        String departmentName = getDepartmentNameFromRowIndex(rowIndex);
        String fileName = departmentName + ".txt";
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)); 
        String[] designations = newDesignations.split("\n");

        for (String designation : designations) {
            writer.write(designation.trim()); 
            writer.newLine(); 
        }

        writer.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null,
                "Error updating text file: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
    

    private String getDepartmentNameFromRowIndex(int rowIndex) {
        return "Department" + rowIndex; 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackToAdminMenu;
    private javax.swing.JButton btRegister;
    private javax.swing.JButton btRemove;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbDeparment;
    private javax.swing.JTextField tfDepartmentName;
    private javax.swing.JTextArea tfDesignation;
    private javax.swing.JTextField tfSearchBar;
    // End of variables declaration//GEN-END:variables
}
