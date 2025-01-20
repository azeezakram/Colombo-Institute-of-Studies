
package com.app;


public class AdminMenu extends javax.swing.JFrame {

  
    public AdminMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btRegisterAdmin = new javax.swing.JButton();
        btRegisterHR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btSignOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Menu");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(7, 68, 151));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        btRegisterAdmin.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btRegisterAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btRegisterAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Add User Male.png"))); // NOI18N
        btRegisterAdmin.setText("New Admin");
        btRegisterAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btRegisterAdmin.setContentAreaFilled(false);
        btRegisterAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterAdminActionPerformed(evt);
            }
        });

        btRegisterHR.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btRegisterHR.setForeground(new java.awt.Color(255, 255, 255));
        btRegisterHR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Add User Male.png"))); // NOI18N
        btRegisterHR.setText("New HR");
        btRegisterHR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btRegisterHR.setContentAreaFilled(false);
        btRegisterHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegisterHRActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRegisterHR, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRegisterAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
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
                        .addComponent(btRegisterAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(btRegisterHR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btSignOut)
                .addGap(24, 24, 24))
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

    private void btRegisterAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterAdminActionPerformed
        RegisterAdmin newAdmin = new RegisterAdmin();
        newAdmin.setVisible(true);
        newAdmin.pack();
        newAdmin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btRegisterAdminActionPerformed

    private void btRegisterHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegisterHRActionPerformed
        RegisterHR newHR = new RegisterHR();
        newHR.setVisible(true);
        newHR.pack();
        newHR.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btRegisterHRActionPerformed

    private void btSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignOutActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        mainMenu.pack();
        mainMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btSignOutActionPerformed

    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegisterAdmin;
    private javax.swing.JButton btRegisterHR;
    private javax.swing.JButton btSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
