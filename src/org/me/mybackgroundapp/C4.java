package org.me.mybackgroundapp;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class C4 extends javax.swing.JFrame {
int jwon;
int level = 1;


    public C4() {
    
    this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tc = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        t5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Casino.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1300, 810, 740, 780);

        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/welcometocasino.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(190, 20, 910, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Availaible Money.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(470, 120, 320, 50);

        tc.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        tc.setText("2500");
        tc.setMinimumSize(new java.awt.Dimension(6, 42));
        tc.setPreferredSize(new java.awt.Dimension(69, 42));
        tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcActionPerformed(evt);
            }
        });
        jPanel2.add(tc);
        tc.setBounds(600, 190, 80, 50);

        t4.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel2.add(t4);
        t4.setBounds(450, 640, 550, 100);

        jButton1.setFont(new java.awt.Font("Lucida Bright", 3, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("PLAY!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 520, 390, 260);

        t5.setFont(new java.awt.Font("Ink Free", 3, 24)); // NOI18N
        t5.setText("Jackpots Won = 0");
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel2.add(t5);
        t5.setBounds(450, 530, 270, 100);

        jButton2.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(740, 530, 250, 100);

        t2.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2);
        t2.setBounds(500, 310, 160, 130);

        t3.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3);
        t3.setBounds(700, 310, 160, 130);

        t1.setFont(new java.awt.Font("Ink Free", 1, 48)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1);
        t1.setBounds(300, 310, 160, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Casino.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 800);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 800);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Casino.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 800, 1400, 800);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Casino.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1200, 0, 800, 810);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Casino.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 40, 720, 1040);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Casino.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 800, 1400, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int m = Integer.parseInt(tc.getText());
m = m-20;

if (jwon == 10)
        {
        JOptionPane.showMessageDialog(this,"CONGRATULATIONS! LEVEL " + level + " CLEARED ");
        level += 1;
        jwon += 1;
        }
if (jwon == 20)
        {
        JOptionPane.showMessageDialog(this,"CONGRATULATIONS! LEVEL " + level + " CLEARED ");
        level += 1;
        jwon += 1;
        }
if (jwon == 30)
        {
        JOptionPane.showMessageDialog(this,"CONGRATULATIONS! LEVEL " + level + " CLEARED ");
        level += 1;
        jwon += 1;
        System.exit(0);
        }

if (m>=0)
{
if (m == 0)
{
 t4.setText("NO COINS LEFT!");
 tc.setText("" + m);
}
else
{
Random a = new Random();
int b = a.nextInt(3);
t1.setText(""  + b);

Random c = new Random();
int d = c.nextInt(3);
t2.setText(""  + d);

Random e = new Random();
int f = e.nextInt(3);
t3.setText(""  + f);

if ( b == d)
{
    if ( b == f)
    {
        t4.setText("YOU WIN! CONGRATULATIONS!");
        m = m + 60;
        jwon = jwon + 1;
        t5.setText("Jackpots Won = " + jwon);
    }
}
}

tc.setText("" + m);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

C obj = new C();
            this.dispose();
            obj.setVisible(true);



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
            java.util.logging.Logger.getLogger(C4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField tc;
    // End of variables declaration//GEN-END:variables
}
