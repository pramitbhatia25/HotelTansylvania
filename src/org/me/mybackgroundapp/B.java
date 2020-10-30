package org.me.mybackgroundapp;
import javax.swing.*;
public class B extends javax.swing.JFrame {
    public B() {this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/generatedtext (2).jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/generatedtext (3).jpg"))); // NOI18N

        Submit.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        Submit.setText("ENTER AT YOUR OWN RISK! ");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        Submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SubmitKeyReleased(evt);
            }
        });

        p1.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N

        p2.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(679, 679, 679)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(495, 495, 495)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(566, 566, 566)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(578, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/thumb-1920-552086.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        
        String username = p2.getText();   //gets username
        String password = new String(p1.getPassword());   //gets password

        if (username.equals("Pramit"))   //check username 
            {
                if (password.equals("Pramit"))
                    {
                        C obj = new C();
                        this.dispose();
                        obj.setVisible(true);
                    }
                else
                    {
                        JOptionPane.showMessageDialog(this, "Sorry, Incorrect Password.");
                        p1.setText("");
                        p2.setText("");
                    }
            }
            else if (username.equals("Darshan"))   //check username 
            {
                if (password.equals("Darshan"))
                    {
                        C obj = new C();
                        this.dispose();
                        obj.setVisible(true);
                    }
                else
                    {
                        JOptionPane.showMessageDialog(this, "Sorry, Incorrect Password.");
                        p1.setText("");
                        p2.setText("");
                    }
            }
            else
            {
                p1.setText("");
                p2.setText("");
                JOptionPane.showMessageDialog(this, "Sorry, Incorrect Monstername. "
                            + "Please Enter A Valid Monstername.");
            }
    }//GEN-LAST:event_SubmitActionPerformed
    private void SubmitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubmitKeyReleased
            
        
            String username = new String(p2.getText());   //gets username
            String password = new String(p1.getPassword());   //gets password

            if (username.equals("Pramit"))   //check username 
            {
                if (password.equals("Pramit"))
                    {
                        C obj = new C();
                        this.dispose();
                        obj.setVisible(true);
                    }
                else
                    {
                        JOptionPane.showMessageDialog(this, "Sorry, Incorrect Password.");
                        p1.setText("");
                        p2.setText("");
                    }
            }
            else if (username.equals("Darshan"))   //check username 
            {
                if (password.equals("Darshan"))
                    {
                        C obj = new C();
                        this.dispose();
                        obj.setVisible(true);
                    }
                else
                    {
                        JOptionPane.showMessageDialog(this, "Sorry, Incorrect Password.");
                        p1.setText("");
                        p2.setText("");
                    }
            }
            else
            {
                p1.setText("");
                p2.setText("");
                JOptionPane.showMessageDialog(this, "Sorry, Incorrect Monstername. "
                            + "Please Enter A Valid Monstername.");
            }
    }//GEN-LAST:event_SubmitKeyReleased

    
    
    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
    }//GEN-LAST:event_p2ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField p2;
    // End of variables declaration//GEN-END:variables
}
