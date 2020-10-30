package org.me.mybackgroundapp;
import javax.swing.*;
public class C7 extends javax.swing.JFrame {
    public C7() {this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 78, 66));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Ink Free", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Welcome! Please Log In To Continue:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(620, 190, 990, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Sub.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 300);

        jLabel4.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(530, 390, 220, 45);

        p2.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jPanel1.add(p2);
        p2.setBounds(780, 390, 440, 51);

        jLabel2.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 300, 230, 45);

        Submit.setBackground(new java.awt.Color(0, 78, 56));
        Submit.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 0));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(780, 470, 440, 67);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/SpicyItalian.JPG"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1340, 580, 430, 310);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Rotisseriestyle.JPG"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 580, 440, 310);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/garlicsteak.JPG"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(790, 580, 430, 310);

        p1.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jPanel1.add(p1);
        p1.setBounds(780, 300, 440, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        String username = new String(p2.getPassword());   //gets username
        String password = new String(p1.getText());
        if (username.equals("Pramit"))   //check username
        {
            if (password.equals("Pramit"))
            {
                C7a obj = new C7a();
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
                C7a obj = new C7a();
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

        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitActionPerformed

   
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(C7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField p1;
    private javax.swing.JPasswordField p2;
    // End of variables declaration//GEN-END:variables
}
