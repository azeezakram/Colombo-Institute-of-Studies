
package com.app;


public class MainMenu extends javax.swing.JFrame {

  
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_SignIn = new javax.swing.JMenu();
        mItemAdminSignIn = new javax.swing.JMenuItem();
        mItemHRSignIn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainMenu");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(7, 68, 151));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo_menue.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(157, 30));

        Menu_SignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Enter2.png"))); // NOI18N
        Menu_SignIn.setText("Sign In");
        Menu_SignIn.setToolTipText("");

        mItemAdminSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/User.png"))); // NOI18N
        mItemAdminSignIn.setText("Admin ");
        mItemAdminSignIn.setPreferredSize(new java.awt.Dimension(87, 30));
        mItemAdminSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAdminSignIn_ActionPerformed(evt);
            }
        });
        Menu_SignIn.add(mItemAdminSignIn);

        mItemHRSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/User.png"))); // NOI18N
        mItemHRSignIn.setText("HR ");
        mItemHRSignIn.setPreferredSize(new java.awt.Dimension(72, 30));
        mItemHRSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemHRSignIn_ActionPerformed(evt);
            }
        });
        Menu_SignIn.add(mItemHRSignIn);

        jMenuBar1.add(Menu_SignIn);

        setJMenuBar(jMenuBar1);

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
                .addGap(0, 111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemAdminSignIn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAdminSignIn_ActionPerformed
        AdminSignIn adminSignIn = new AdminSignIn();
        adminSignIn.setVisible(true);
        adminSignIn.pack();
        adminSignIn.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mItemAdminSignIn_ActionPerformed

    private void mItemHRSignIn_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemHRSignIn_ActionPerformed
        HRSignIn hrManager = new HRSignIn();
        hrManager.setVisible(true);
        hrManager.pack();
        hrManager.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mItemHRSignIn_ActionPerformed

    
 
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_SignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem mItemAdminSignIn;
    private javax.swing.JMenuItem mItemHRSignIn;
    // End of variables declaration//GEN-END:variables
}
