package org.me.mybackgroundapp;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import java.sql.*;
public class C1a extends javax.swing.JFrame {

 
public C1a() {
    this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    initComponents();l170.setVisible(false);
    
}

public C1a(String hotelDetails, String checkinout, String adults, String children, String checkindate, String checkoutdate) 
{
    this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    initComponents();
    l1.setText(hotelDetails);
    l2.setText(adults + "Adults");
    l3.setText(checkinout);
    l4.setText(children + "Children");
    l170.setVisible(false);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        l56 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        ld = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lc = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        l170 = new javax.swing.JLabel();
        le = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(null);

        t1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(30, 430, 270, 40);

        t7.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel1.add(t7);
        t7.setBounds(720, 540, 110, 40);

        l56.setBackground(new java.awt.Color(255, 255, 255));
        l56.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l56.setForeground(new java.awt.Color(255, 255, 255));
        l56.setText("Cards Accepted ??");
        l56.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                l56MouseMoved(evt);
            }
        });
        jPanel1.add(l56);
        l56.setBounds(720, 420, 560, 50);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Ink Free", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Payment Information");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(720, 310, 280, 30);

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Details");
        jPanel1.add(l1);
        l1.setBounds(40, 260, 710, 40);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Country/Region *");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 610, 210, 30);

        t4.setEditable(true);
        t4.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "India", "USA", "UK", "Germany", "Canada", "Australia" }));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(30, 660, 590, 40);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email Address *");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 500, 180, 30);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address *");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 730, 180, 30);

        t5.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(30, 770, 590, 40);

        l2.setBackground(new java.awt.Color(255, 255, 255));
        l2.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Adults");
        jPanel1.add(l2);
        l2.setBounds(40, 210, 90, 40);

        l3.setBackground(new java.awt.Color(255, 255, 255));
        l3.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Date");
        jPanel1.add(l3);
        l3.setBounds(40, 170, 370, 40);

        l4.setBackground(new java.awt.Color(255, 255, 255));
        l4.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Children");
        jPanel1.add(l4);
        l4.setBounds(210, 210, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/mybackgroundapp/newpackage/Confirmgi.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 490, 120);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone Number *");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 830, 180, 30);

        t6.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel1.add(t6);
        t6.setBounds(30, 870, 590, 40);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("First Name *");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 390, 150, 30);

        l6.setBackground(new java.awt.Color(255, 255, 255));
        l6.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setText("usually acceptable. Fees may apply depending upon");
        jPanel1.add(l6);
        l6.setBounds(710, 100, 470, 40);

        l8.setBackground(new java.awt.Color(255, 255, 255));
        l8.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setText("Taxes And Additional Charges");
        jPanel1.add(l8);
        l8.setBounds(640, 160, 340, 40);

        l9.setBackground(new java.awt.Color(255, 255, 255));
        l9.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setText("STATE TAX 9.75PCT. COUNTY TAX 3PCT.");
        jPanel1.add(l9);
        l9.setBounds(690, 220, 450, 40);

        l7.setBackground(new java.awt.Color(255, 255, 255));
        l7.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setText("  arrival date and hotel selected.");
        jPanel1.add(l7);
        l7.setBounds(700, 120, 450, 40);

        l10.setBackground(new java.awt.Color(255, 255, 255));
        l10.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 255, 255));
        l10.setText("available rate. Changes to your reservation are ");
        jPanel1.add(l10);
        l10.setBounds(710, 80, 415, 40);

        l11.setBackground(new java.awt.Color(255, 255, 255));
        l11.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l11.setForeground(new java.awt.Color(255, 255, 255));
        l11.setText("Rate Description");
        jPanel1.add(l11);
        l11.setBounds(640, 20, 280, 40);

        l12.setBackground(new java.awt.Color(255, 255, 255));
        l12.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l12.setForeground(new java.awt.Color(255, 255, 255));
        l12.setText("Take advantage of our best and least restrictive ");
        jPanel1.add(l12);
        l12.setBounds(710, 60, 460, 40);

        l13.setBackground(new java.awt.Color(255, 255, 255));
        l13.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l13.setForeground(new java.awt.Color(255, 255, 255));
        l13.setText("12.75% per night is not included in the shown rate.");
        jPanel1.add(l13);
        l13.setBounds(690, 200, 450, 40);

        l14.setBackground(new java.awt.Color(255, 255, 255));
        l14.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l14.setForeground(new java.awt.Color(255, 255, 255));
        l14.setText("Parking");
        jPanel1.add(l14);
        l14.setBounds(1140, 20, 340, 40);

        l15.setBackground(new java.awt.Color(255, 255, 255));
        l15.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l15.setForeground(new java.awt.Color(255, 255, 255));
        l15.setText("3 Bedroom Rooms - Max 3 cars allowed");
        jPanel1.add(l15);
        l15.setBounds(1190, 80, 450, 40);

        l16.setBackground(new java.awt.Color(255, 255, 255));
        l16.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l16.setForeground(new java.awt.Color(255, 255, 255));
        l16.setText("1/2 Bedroom Rooms - Max 2 cars allowed");
        jPanel1.add(l16);
        l16.setBounds(1190, 60, 450, 40);

        l17.setBackground(new java.awt.Color(255, 255, 255));
        l17.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l17.setForeground(new java.awt.Color(255, 255, 255));
        l17.setText("Check-In / Check - Out Time");
        jPanel1.add(l17);
        l17.setBounds(1140, 160, 340, 40);

        l19.setBackground(new java.awt.Color(255, 255, 255));
        l19.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l19.setForeground(new java.awt.Color(255, 255, 255));
        l19.setText("Check - Out: 10 am to 12 am");
        jPanel1.add(l19);
        l19.setBounds(1190, 220, 450, 40);

        l20.setBackground(new java.awt.Color(255, 255, 255));
        l20.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l20.setForeground(new java.awt.Color(255, 255, 255));
        l20.setText("?? - Mouse Hover Field");
        jPanel1.add(l20);
        l20.setBounds(1530, 200, 340, 40);

        l21.setBackground(new java.awt.Color(255, 255, 255));
        l21.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l21.setForeground(new java.awt.Color(255, 255, 255));
        l21.setText("Fine of $250.00 will be incurred if found");
        jPanel1.add(l21);
        l21.setBounds(1570, 80, 450, 40);

        l22.setBackground(new java.awt.Color(255, 255, 255));
        l22.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l22.setForeground(new java.awt.Color(255, 255, 255));
        l22.setText("No pet are permitted on this property");
        jPanel1.add(l22);
        l22.setBounds(1580, 60, 450, 40);

        l23.setBackground(new java.awt.Color(255, 255, 255));
        l23.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l23.setForeground(new java.awt.Color(255, 255, 255));
        l23.setText("Pet Policy");
        jPanel1.add(l23);
        l23.setBounds(1570, 30, 340, 40);

        l24.setBackground(new java.awt.Color(255, 255, 255));
        l24.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        l24.setForeground(new java.awt.Color(255, 255, 255));
        l24.setText("Check - In:  4 pm to 6 pm");
        jPanel1.add(l24);
        l24.setBounds(1190, 200, 450, 40);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Ink Free", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Guest Information");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 320, 240, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name *");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 390, 150, 30);

        t3.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(30, 540, 590, 40);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Your Room Will Be held Until The Day Of Your Check-In");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(720, 360, 630, 30);

        t11.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        jPanel1.add(t11);
        t11.setBounds(720, 660, 270, 40);

        t12.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        jPanel1.add(t12);
        t12.setBounds(1070, 660, 250, 40);

        ld.setBackground(new java.awt.Color(255, 255, 255));
        ld.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        ld.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ld);
        ld.setBounds(700, 830, 700, 30);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Year*");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(1070, 620, 150, 30);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Payment Card Number*");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(720, 500, 630, 30);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Expiration Month*");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(720, 620, 240, 30);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("A Credit Card Must Be Presented Upon Check - In ??");
        jLabel24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel24MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(710, 740, 610, 30);

        lc.setBackground(new java.awt.Color(255, 255, 255));
        lc.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lc.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lc);
        lc.setBounds(700, 800, 700, 30);

        l25.setBackground(new java.awt.Color(255, 255, 255));
        l25.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l25.setForeground(new java.awt.Color(255, 255, 255));
        l25.setText("* - Mandatory Field");
        jPanel1.add(l25);
        l25.setBounds(1530, 160, 340, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Learn More");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1550, 560, 170, 39);

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("             Get a $50 Statement\n         Credit After First Purchase* \n    \n    Earn 125,000 bonus points. Plus, earn   \n    40X points total at IHG® Hotels & \n    Resorts for 12 months and 4X points  \n       everywhere else for 12 months.\n");
        jTextArea1.setBorder(null);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1400, 340, 500, 270);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CONFIRM RESERVATION");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1490, 640, 350, 80);

        l170.setBackground(new java.awt.Color(255, 255, 255));
        l170.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        l170.setForeground(new java.awt.Color(255, 255, 255));
        l170.setText("All Done, Here's Your Reservation Number!");
        l170.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                l170MouseMoved(evt);
            }
        });
        jPanel1.add(l170);
        l170.setBounds(1420, 740, 500, 30);

        le.setBackground(new java.awt.Color(255, 255, 255));
        le.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        le.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(le);
        le.setBounds(1630, 790, 130, 30);

        t2.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(370, 430, 250, 40);

        t8.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        jPanel1.add(t8);
        t8.setBounds(880, 540, 110, 40);

        t9.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel1.add(t9);
        t9.setBounds(1030, 540, 110, 40);

        t10.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        jPanel1.add(t10);
        t10.setBounds(1180, 540, 110, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EXIT");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1670, 860, 170, 39);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BACK");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1480, 860, 170, 39);

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

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void l56MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l56MouseMoved
l56.setText("American Express, Discover, Visa, MasterCard ");        // TODO add your handling code here:
      
        // TODO add your handling code here:
    }//GEN-LAST:event_l56MouseMoved

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
l56.setText("Cards Accepted ??");        // TODO add your handling code here:
lc.setText("");
ld.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void jLabel24MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseMoved
lc.setText("Most IHG hotels and resorts place a hold on debit card");
ld.setText("at Check - In, to account for additional purchases made.");

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try {
         
        Desktop.getDesktop().browse(new URI("https://www.ihg.com/content/us/en/offers"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    Random gen = new Random();
    long gen1 = gen.nextInt(899);    // gen1 can have most value of 899
    long gen2 = 1000 + gen1;          // thus gen2 will always be less than 1999 implies 4 digit number.
    l170.setVisible(true);
    le.setText("" + gen2);
    
    
    String q = l1.getText();
    String w = l2.getText();
    String l = l3.getText();
    String r = l4.getText();
    
    
    String t = t1.getText();
    String y = t2.getText();
    String u = t3.getText();
//t4 is combo box
    String o = t5.getText();
    String p = t6.getText();
    String a = t7.getText();
    String s = t8.getText();
    String d = t9.getText();
    String f = t10.getText();
    String g = t11.getText();
    String h = t12.getText();
    Connection con = null;
    ResultSet rs = null;
    Statement stmt = null;
try {
    
      
            Class.forName("java.sql.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteltransylvania","root","pramit"); //root is username and password
            stmt = con.createStatement();  
            String query = "Select * from paymentinfo;";
            rs = stmt.executeQuery(query);
            if (rs.next() )
            {
            String cardno = rs.getString("cardno");
            String month = rs.getString("month");
            String year = rs.getString("year");
            String reservationno = rs.getString("reservationno");
            
            }
    
    } catch (Exception e) 
    {
            System.out.print(" " + e);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void l170MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l170MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_l170MouseMoved

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
C1 obj = new C1();
obj.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(C1a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C1a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C1a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C1a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C1a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l170;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l56;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel lc;
    private javax.swing.JLabel ld;
    private javax.swing.JLabel le;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JComboBox<String> t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables

    String getVar1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
