package com.app;

import javax.swing.JOptionPane;


public class HRSignIn extends javax.swing.JFrame {
    
    public HRSignIn() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btHRSignIn = new javax.swing.JButton();
        btBackToMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR Sign in");
        setBackground(new java.awt.Color(250, 250, 252));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        Left.setBackground(new java.awt.Color(7, 68, 151));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo (1).png"))); // NOI18N

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanel2.add(Left);
        Left.setBounds(0, 0, 360, 500);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setToolTipText("");
        Right.setMinimumSize(new java.awt.Dimension(400, 500));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 68, 151));
        jLabel1.setText("Human Resource");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 68, 151));
        jLabel2.setText("SIGN IN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");

        tfUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");

        pfPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfPassword.setForeground(new java.awt.Color(102, 102, 102));

        btHRSignIn.setBackground(new java.awt.Color(7, 68, 151));
        btHRSignIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btHRSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btHRSignIn.setText("Sign in");
        btHRSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHRSignInActionPerformed(evt);
            }
        });

        btBackToMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Back.png"))); // NOI18N
        btBackToMainMenu.setBorderPainted(false);
        btBackToMainMenu.setContentAreaFilled(false);
        btBackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addComponent(btBackToMainMenu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btHRSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel2))
                            .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(tfUsername)
                                .addComponent(jLabel4)
                                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btBackToMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btHRSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        jPanel2.add(Right);
        Right.setBounds(360, 0, 440, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHRSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHRSignInActionPerformed
      
        String username = tfUsername.getText();
        char[] passwordContain = pfPassword.getPassword();
        String password = new String(passwordContain); 
        String fileName = "HRRecords.txt";
        boolean auth = SystemUser.authenticate(username, password, fileName);
        
        if (auth) {
            HRMenu hrMenu = new HRMenu();
            hrMenu.setVisible(true);
            hrMenu.pack();
            hrMenu.setLocationRelativeTo(null);
            this.dispose();
            
        } else if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Please enter all fields",
                "Warning",
                JOptionPane.WARNING_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(this,
                "Username or Password incorrect!",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
            tfUsername.setText("");
            pfPassword.setText("");
        }

                                             
    }//GEN-LAST:event_btHRSignInActionPerformed

    private void btBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackToMainMenuActionPerformed
        MainMenu backToMainMenu = new MainMenu();
        backToMainMenu.setVisible(true);
        backToMainMenu.pack();
        backToMainMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btBackToMainMenuActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btBackToMainMenu;
    private javax.swing.JButton btHRSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
