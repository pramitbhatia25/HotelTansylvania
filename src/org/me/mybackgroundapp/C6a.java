package org.me.mybackgroundapp;
import javax.swing.*;
import java.time.format.DateTimeFormatter;  
import java.util.*;    

public class C6a extends javax.swing.JFrame {
double totalcost = 0;
int n;
    public C6a() {
this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        
        initComponents();
        
        OrderB.setVisible(false);
        reservationid.setVisible(false);
        reservationno.setVisible(false);
        dd.setVisible(false);
        total.setVisible(false);
        l1.setVisible(false);
        t2.setVisible(false);
        m1.setVisible(false);
        m2.setVisible(false);
        m3.setVisible(false);
        m4.setVisible(false);
        m5.setVisible(false);
        m6.setVisible(false);
        m7.setVisible(false);
        m8.setVisible(false);
        m9.setVisible(false);
        m10.setVisible(false);
        m11.setVisible(false);
        m12.setVisible(false);
        
        r1.setVisible(false);
        r2.setVisible(false);
        r3.setVisible(false);
        r4.setVisible(false);
        r5.setVisible(false);
        r6.setVisible(false);
        r12.setVisible(false);
        r11.setVisible(false);
        r10.setVisible(false);
        r9.setVisible(false);
        r8.setVisible(false);
        r7.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        Submit = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        m2 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        r3 = new javax.swing.JRadioButton();
        m6 = new javax.swing.JLabel();
        r6 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        m5 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        m4 = new javax.swing.JLabel();
        m7 = new javax.swing.JLabel();
        m8 = new javax.swing.JLabel();
        m9 = new javax.swing.JLabel();
        m10 = new javax.swing.JLabel();
        m11 = new javax.swing.JLabel();
        m12 = new javax.swing.JLabel();
        r12 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        reservationid = new javax.swing.JLabel();
        reservationno = new javax.swing.JTextField();
        dd = new javax.swing.JButton();
        OrderB = new javax.swing.JButton();
        Submit1 = new javax.swing.JButton();
        p1 = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        Submit2 = new javax.swing.JButton();
        t2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 190, 800, 130);

        p2.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jPanel1.add(p2);
        p2.setBounds(330, 230, 850, 51);

        Submit.setBackground(new java.awt.Color(255, 0, 0));
        Submit.setFont(new java.awt.Font("MV Boli", 3, 36)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 0));
        Submit.setText("SUBMIT");
        Submit.setOpaque(false);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(1350, 240, 203, 61);

        l1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 0));
        l1.setText("Now, Select Your Items");
        jPanel1.add(l1);
        l1.setBounds(40, 290, 480, 130);

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("MonsterName");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 110, 800, 130);

        r2.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 0));
        r2.setText("Mornin' McMuffin - 299/-");
        r2.setOpaque(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2);
        r2.setBounds(360, 590, 380, 40);

        r1.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 0));
        r1.setText("McAloo Tikki - 199/-");
        r1.setOpaque(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(1050, 590, 310, 40);

        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/eggcheese.JPG"))); // NOI18N
        m2.setText("jLabel1");
        jPanel1.add(m2);
        m2.setBounds(80, 420, 260, 160);

        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/alootikki.JPG"))); // NOI18N
        m1.setText("jLabel1");
        jPanel1.add(m1);
        m1.setBounds(1090, 410, 240, 160);

        m3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/vegmcm.JPG"))); // NOI18N
        m3.setText("jLabel1");
        jPanel1.add(m3);
        m3.setBounds(790, 410, 250, 160);

        r3.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r3.setForeground(new java.awt.Color(255, 255, 0));
        r3.setText("Veg McMuffin - 249/-");
        r3.setOpaque(false);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3);
        r3.setBounds(730, 590, 320, 40);

        m6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/hashb.JPG"))); // NOI18N
        m6.setText("jLabel1");
        jPanel1.add(m6);
        m6.setBounds(1690, 400, 220, 180);

        r6.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r6.setForeground(new java.awt.Color(255, 255, 0));
        r6.setText("Hash Browns - 59/-");
        r6.setOpaque(false);
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });
        jPanel1.add(r6);
        r6.setBounds(1640, 590, 290, 40);

        r5.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r5.setForeground(new java.awt.Color(255, 255, 0));
        r5.setText("Filter Coffee - 141/-");
        r5.setOpaque(false);
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });
        jPanel1.add(r5);
        r5.setBounds(1350, 590, 290, 40);

        m5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/filt.JPG"))); // NOI18N
        m5.setText("jLabel1");
        jPanel1.add(m5);
        m5.setBounds(1400, 410, 220, 160);

        r4.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r4.setForeground(new java.awt.Color(255, 255, 0));
        r4.setText("McMuffin Exotica - 299/-");
        r4.setOpaque(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4);
        r4.setBounds(0, 590, 370, 40);

        m4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/spinachcorn.JPG"))); // NOI18N
        jPanel1.add(m4);
        m4.setBounds(450, 420, 240, 160);

        m7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/eggcheese.JPG"))); // NOI18N
        m7.setText("jLabel1");
        jPanel1.add(m7);
        m7.setBounds(60, 650, 260, 160);

        m8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/spinachcorn.JPG"))); // NOI18N
        jPanel1.add(m8);
        m8.setBounds(410, 650, 240, 160);

        m9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/vegmcm.JPG"))); // NOI18N
        m9.setText("jLabel1");
        jPanel1.add(m9);
        m9.setBounds(730, 640, 250, 160);

        m10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/alootikki.JPG"))); // NOI18N
        m10.setText("jLabel1");
        jPanel1.add(m10);
        m10.setBounds(1040, 640, 240, 160);

        m11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/filt.JPG"))); // NOI18N
        m11.setText("jLabel1");
        jPanel1.add(m11);
        m11.setBounds(1370, 640, 220, 160);

        m12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/hashb.JPG"))); // NOI18N
        m12.setText("jLabel1");
        jPanel1.add(m12);
        m12.setBounds(1690, 630, 220, 180);

        r12.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r12.setForeground(new java.awt.Color(255, 255, 0));
        r12.setText("Chips And Fries - 100/-");
        r12.setOpaque(false);
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });
        jPanel1.add(r12);
        r12.setBounds(1590, 820, 330, 40);

        r11.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r11.setForeground(new java.awt.Color(255, 255, 0));
        r11.setText("Choco Latte - 141/-");
        r11.setOpaque(false);
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });
        jPanel1.add(r11);
        r11.setBounds(1310, 820, 290, 40);

        r10.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r10.setForeground(new java.awt.Color(255, 255, 0));
        r10.setText("BigMac Chicken - 501/-");
        r10.setOpaque(false);
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });
        jPanel1.add(r10);
        r10.setBounds(990, 820, 330, 40);

        r9.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r9.setForeground(new java.awt.Color(255, 255, 0));
        r9.setText("BigMac Veg - 401/-");
        r9.setOpaque(false);
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });
        jPanel1.add(r9);
        r9.setBounds(710, 820, 340, 40);

        r8.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r8.setForeground(new java.awt.Color(255, 255, 0));
        r8.setText("McSpicy Chicken - 399/- ");
        r8.setOpaque(false);
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });
        jPanel1.add(r8);
        r8.setBounds(350, 820, 360, 40);

        r7.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        r7.setForeground(new java.awt.Color(255, 255, 0));
        r7.setText("McSpicy Paneer - 299/-");
        r7.setOpaque(false);
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });
        jPanel1.add(r7);
        r7.setBounds(0, 820, 370, 40);

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Please Log In To Continue");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 30, 800, 130);

        reservationid.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        reservationid.setForeground(new java.awt.Color(255, 255, 0));
        reservationid.setText("Total:");
        jPanel1.add(reservationid);
        reservationid.setBounds(800, 900, 130, 60);

        reservationno.setFont(new java.awt.Font("MV Boli", 3, 36)); // NOI18N
        reservationno.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(reservationno);
        reservationno.setBounds(490, 910, 250, 50);

        dd.setBackground(new java.awt.Color(255, 51, 0));
        dd.setFont(new java.awt.Font("MV Boli", 3, 36)); // NOI18N
        dd.setForeground(new java.awt.Color(255, 255, 0));
        dd.setOpaque(false);
        dd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddActionPerformed(evt);
            }
        });
        jPanel1.add(dd);
        dd.setBounds(950, 890, 210, 90);

        OrderB.setBackground(new java.awt.Color(255, 51, 0));
        OrderB.setFont(new java.awt.Font("MV Boli", 3, 48)); // NOI18N
        OrderB.setForeground(new java.awt.Color(255, 255, 0));
        OrderB.setText("Place Order");
        OrderB.setOpaque(false);
        OrderB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBActionPerformed(evt);
            }
        });
        jPanel1.add(OrderB);
        OrderB.setBounds(1300, 880, 450, 110);

        Submit1.setBackground(new java.awt.Color(255, 0, 0));
        Submit1.setFont(new java.awt.Font("MV Boli", 3, 36)); // NOI18N
        Submit1.setForeground(new java.awt.Color(255, 255, 0));
        Submit1.setText("BACK");
        Submit1.setOpaque(false);
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });
        jPanel1.add(Submit1);
        Submit1.setBounds(1200, 20, 203, 61);

        p1.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1KeyPressed(evt);
            }
        });
        jPanel1.add(p1);
        p1.setBounds(330, 150, 850, 50);

        total.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 0));
        total.setText("Enter Reservation ID:");
        jPanel1.add(total);
        total.setBounds(50, 870, 430, 130);

        Submit2.setBackground(new java.awt.Color(255, 0, 0));
        Submit2.setFont(new java.awt.Font("MV Boli", 3, 36)); // NOI18N
        Submit2.setForeground(new java.awt.Color(255, 255, 0));
        Submit2.setText("EXIT");
        Submit2.setOpaque(false);
        Submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit2ActionPerformed(evt);
            }
        });
        jPanel1.add(Submit2);
        Submit2.setBounds(1420, 20, 203, 61);

        t2.setBackground(new java.awt.Color(255, 0, 0));
        t2.setFont(new java.awt.Font("MV Boli", 2, 36)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 0));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(1259, 325, 370, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        
        String username = new String(p2.getPassword());   //gets username
        String password = new String(p1.getText());   //gets password

        if (username.equals("Pramit"))   //check username
        {
            if (password.equals("Pramit"))
            {
                l1.setVisible(true);
                t2.setVisible(true);
                
                OrderB.setVisible(true);
                reservationid.setVisible(true);
                reservationno.setVisible(true);
                dd.setVisible(true);
                total.setVisible(true);
                Calendar C = new GregorianCalendar();
                int hour = C.get( Calendar.HOUR_OF_DAY );
                if( hour > 2 && hour < 12 )
                    {
                        n = 1;
                        t2.setText("BreakFast Mode On");
                        m1.setVisible(true);
                        m2.setVisible(true);
                        m3.setVisible(true);
                        m4.setVisible(true);
                        m5.setVisible(true);
                        m6.setVisible(true);
                        m7.setVisible(true);
                        m8.setVisible(true);
                        m9.setVisible(true);
                        m10.setVisible(true);
                        m11.setVisible(true);
                        m12.setVisible(true);
                    
                        
                        m7.setEnabled(false);
                        m8.setEnabled(false);
                        m9.setEnabled(false);
                        m10.setEnabled(false);
                        m11.setEnabled(false);                  
                        m12.setEnabled(false);
                        
                        r1.setVisible(true);
                        r2.setVisible(true);
                        r3.setVisible(true);
                        r4.setVisible(true);
                        r5.setVisible(true);
                        r6.setVisible(true);
                        r12.setVisible(true);
                        r11.setVisible(true);
                        r10.setVisible(true);
                        r9.setVisible(true);
                        r8.setVisible(true);
                        r7.setVisible(true);
                    
                        
                        r12.setEnabled(false);
                        r11.setEnabled(false);
                        r10.setEnabled(false);
                        r9.setEnabled(false);
                        r8.setEnabled(false);                  
                        r7.setEnabled(false);
                    }
                    else 
                    {
                        
                        n = 2;
                        t2.setText("Lunch Mode On");
                        m1.setVisible(true);
                        m2.setVisible(true);
                        m3.setVisible(true);
                        m4.setVisible(true);
                        m5.setVisible(true);
                        m6.setVisible(true);
                        m7.setVisible(true);
                        m8.setVisible(true);
                        m9.setVisible(true);
                        m10.setVisible(true);
                        m11.setVisible(true);
                        m12.setVisible(true);
                        m1.setEnabled(false);
                        m2.setEnabled(false);
                        m3.setEnabled(false);
                        m4.setEnabled(false);
                        m5.setEnabled(false);                  
                        m6.setEnabled(false);
                        
                        r1.setVisible(true);
                        r2.setVisible(true);
                        r3.setVisible(true);
                        r4.setVisible(true);
                        r5.setVisible(true);
                        r6.setVisible(true);
                        r12.setVisible(true);
                        r11.setVisible(true);
                        r10.setVisible(true);
                        r9.setVisible(true);
                        r8.setVisible(true);
                        r7.setVisible(true);
                    
                        
                        r1.setEnabled(false);
                        r2.setEnabled(false);
                        r3.setEnabled(false);
                        r4.setEnabled(false);
                        r5.setEnabled(false);                  
                        r6.setEnabled(false);
                        
                        
                    }

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
                OrderB.setVisible(true);
                l1.setVisible(true);
                t2.setVisible(true);
                reservationid.setVisible(true);
                reservationno.setVisible(true);
                dd.setVisible(true);
                total.setVisible(true);
                Calendar C = new GregorianCalendar();
                int hour = C.get( Calendar.HOUR_OF_DAY );
                if( hour > 2 && hour < 12 )
                    {
                        t2.setText("BreakFast Mode On");
                        m1.setVisible(true);
                        m2.setVisible(true);
                        m3.setVisible(true);
                        m4.setVisible(true);
                        m5.setVisible(true);
                        m6.setVisible(true);
                        m7.setVisible(true);
                        m8.setVisible(true);
                        m9.setVisible(true);
                        m10.setVisible(true);
                        m11.setVisible(true);
                        m12.setVisible(true);
                    
                        
                        m7.setEnabled(false);
                        m8.setEnabled(false);
                        m9.setEnabled(false);
                        m10.setEnabled(false);
                        m11.setEnabled(false);                  
                        m12.setEnabled(false);
                        
                        r1.setVisible(true);
                        r2.setVisible(true);
                        r3.setVisible(true);
                        r4.setVisible(true);
                        r5.setVisible(true);
                        r6.setVisible(true);
                        r12.setVisible(true);
                        r11.setVisible(true);
                        r10.setVisible(true);
                        r9.setVisible(true);
                        r8.setVisible(true);
                        r7.setVisible(true);
                    
                        
                        r12.setEnabled(false);
                        r11.setEnabled(false);
                        r10.setEnabled(false);
                        r9.setEnabled(false);
                        r8.setEnabled(false);                  
                        r7.setEnabled(false);
                        
                    }
                    else 
                    {
                        t2.setText("Lunch Mode On");
                        m1.setVisible(true);
                        m2.setVisible(true);
                        m3.setVisible(true);
                        m4.setVisible(true);
                        m5.setVisible(true);
                        m6.setVisible(true);
                        m7.setVisible(true);
                        m8.setVisible(true);
                        m9.setVisible(true);
                        m10.setVisible(true);
                        m11.setVisible(true);
                        m12.setVisible(true);
                    
                        
                        m1.setEnabled(false);
                        m2.setEnabled(false);
                        m3.setEnabled(false);
                        m4.setEnabled(false);
                        m5.setEnabled(false);                  
                        m6.setEnabled(false);
                        
                        r1.setVisible(true);
                        r2.setVisible(true);
                        r3.setVisible(true);
                        r4.setVisible(true);
                        r5.setVisible(true);
                        r6.setVisible(true);
                        r12.setVisible(true);
                        r11.setVisible(true);
                        r10.setVisible(true);
                        r9.setVisible(true);
                        r8.setVisible(true);
                        r7.setVisible(true);
                    
                        
                        r1.setEnabled(false);
                        r2.setEnabled(false);
                        r3.setEnabled(false);
                        r4.setEnabled(false);
                        r5.setEnabled(false);                  
                        r6.setEnabled(false);
                    }
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

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
if (r4.isSelected() == true)
{
    totalcost += 299;
}
else if(r4.isSelected() == false)
{
   totalcost -= 299;
}    
dd.setText("" + totalcost);
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
if (r2.isSelected() == true)
{
    totalcost += 299;
}
else if(r2.isSelected() == false)
{
   totalcost -= 299;
}    
dd.setText("" + totalcost);
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
if (r8.isSelected() == true)
{
    totalcost += 399;
}
else if(r8.isSelected() == false)
{
   totalcost -= 399;
}    
dd.setText("" + totalcost);

    }//GEN-LAST:event_r8ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
if (r7.isSelected() == true)
{
    totalcost += 299;
}
else if(r7.isSelected() == false)
{
   totalcost -= 299;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r7ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
if (r3.isSelected() == true)
{
    totalcost += 249;
}
else if(r3.isSelected() == false)
{
   totalcost -= 249;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r3ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
if (r1.isSelected() == true)
{
    totalcost += 199;
}
else if(r1.isSelected() == false)
{
   totalcost -= 199;
}    
dd.setText("" + totalcost);
     // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
if (r5.isSelected() == true)
{
    totalcost += 141;
}
else if(r5.isSelected() == false)
{
   totalcost -= 141;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
if (r6.isSelected() == true)
{
    totalcost += 59;
}
else if(r6.isSelected() == false)
{
   totalcost -= 59;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r6ActionPerformed

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
if (r9.isSelected() == true)
{
    totalcost += 401;
}
else if(r9.isSelected() == false)
{
   totalcost -= 401;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r9ActionPerformed

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
if (r10.isSelected() == true)
{
    totalcost += 501;
}
else if(r10.isSelected() == false)
{
   totalcost -= 501;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r10ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
if (r11.isSelected() == true)
{
    totalcost += 141;
}
else if(r11.isSelected() == false)
{
   totalcost -= 141;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r11ActionPerformed

    private void r12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12ActionPerformed
if (r12.isSelected() == true)
{
    totalcost += 100;
}
else if(r12.isSelected() == false)
{
   totalcost -= 100;
}    
dd.setText("" + totalcost);
    }//GEN-LAST:event_r12ActionPerformed

    private void ddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddActionPerformed
    }//GEN-LAST:event_ddActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed

C6 obj = new C6();
this.dispose();
obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Submit1ActionPerformed

    private void OrderBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBActionPerformed

        
        
        
        JOptionPane.showMessageDialog(this, "Thank You For Ordering At McDonalds! You will be billed Rs." + totalcost + " on your credit card linked with Reservation Number: " + reservationno.getText() + " automatically. Enjoy!");

// TODO add your handling code here:
    }//GEN-LAST:event_OrderBActionPerformed

    private void p1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyPressed


        // TODO add your handling code here:
    }//GEN-LAST:event_p1KeyPressed

    private void Submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit2ActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_Submit2ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(C6a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C6a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C6a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C6a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C6a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrderB;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JButton Submit2;
    private javax.swing.JButton dd;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m10;
    private javax.swing.JLabel m11;
    private javax.swing.JLabel m12;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m5;
    private javax.swing.JLabel m6;
    private javax.swing.JLabel m7;
    private javax.swing.JLabel m8;
    private javax.swing.JLabel m9;
    private javax.swing.JTextField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    private javax.swing.JLabel reservationid;
    private javax.swing.JTextField reservationno;
    private javax.swing.JToggleButton t2;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
