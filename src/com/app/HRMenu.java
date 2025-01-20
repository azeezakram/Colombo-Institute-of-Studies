
package com.app;


public class HRMenu extends javax.swing.JFrame {

  
    public HRMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btRegisterDepartment = new javax.swing.JButton();
        btRegisterEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btSignOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR Menu");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(7, 68, 151));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        btRegisterDepartment.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btRegisterDepartment.setForeground(new java.awt.Color(255, 255, 255));
        btRegisterDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Add User Male.png"))); // NOI18N
        btRegisterDepartment.setText("New Department");
        btRegisterDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btRegisterDepartment.setContentAreaFilled(false);
        btRegisterDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterDepartmentActionPerformed(evt);
            }
        });

        btRegisterEmployee.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btRegisterEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btRegisterEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Add User Male.png"))); // NOI18N
        btRegisterEmployee.setText("New Employee");
        btRegisterEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btRegisterEmployee.setContentAreaFilled(false);
        btRegisterEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterEmployeeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo (1).png"))); // NOI18N

        btSignOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSignOut.setForeground(new java.awt.Color(7, 68, 151));
        btSignOut.setText("Sign out");
        btSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btSignOut)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btRegisterEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btRegisterDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addGap(79, 79, 79))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btRegisterDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(btRegisterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btSignOut)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegisterDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterDepartmentActionPerformed
        RegisterDepartment regDep = new RegisterDepartment();
        regDep.setVisible(true);
        regDep.pack();
        regDep.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btRegisterDepartmentActionPerformed

    private void btRegisterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterEmployeeActionPerformed
        RegisterEmployee regEmp = new RegisterEmployee();
        regEmp.setVisible(true);
        regEmp.pack();
        regEmp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btRegisterEmployeeActionPerformed

    private void btSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignOutActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        mainMenu.pack();
        mainMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btSignOutActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegisterDepartment;
    private javax.swing.JButton btRegisterEmployee;
    private javax.swing.JButton btSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
