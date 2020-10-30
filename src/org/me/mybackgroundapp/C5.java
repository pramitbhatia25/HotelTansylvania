package org.me.mybackgroundapp;
import java.awt.Color;
public class C5 extends javax.swing.JFrame {
int a  = 0;
int b = 0;
int ml;
int mp;
Color color1;
Color color2;
    public C5() {
this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        t2 = new javax.swing.JButton();
        t100 = new javax.swing.JLabel();
        t0 = new javax.swing.JLabel();
        t1 = new javax.swing.JButton();
        t101 = new javax.swing.JLabel();
        t102 = new javax.swing.JLabel();
        t103 = new javax.swing.JLabel();
        t104 = new javax.swing.JLabel();
        t105 = new javax.swing.JLabel();
        t106 = new javax.swing.JLabel();
        t107 = new javax.swing.JLabel();
        Jcb2 = new javax.swing.JComboBox<>();
        Jcb1 = new javax.swing.JComboBox<>();
        t3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(290, 140, 250, 200);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(580, 140, 250, 200);

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(10, 580, 250, 200);

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(290, 580, 250, 200);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(10, 140, 250, 200);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(10, 360, 250, 200);

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(580, 580, 250, 200);

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(290, 360, 250, 200);

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(580, 360, 250, 200);

        jButton10.setText("PLAY!!");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(1050, 460, 80, 25);

        t2.setBackground(new java.awt.Color(255, 0, 0));
        t2.setText("PLAYER 2");
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(280, 30, 150, 70);

        t100.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t100.setForeground(new java.awt.Color(255, 255, 255));
        t100.setText("And Play Your Turn");
        jPanel1.add(t100);
        t100.setBounds(1000, 530, 180, 50);

        t0.setBackground(new java.awt.Color(51, 255, 0));
        t0.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        t0.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(t0);
        t0.setBounds(1090, 710, 160, 50);

        t1.setBackground(new java.awt.Color(255, 0, 0));
        t1.setText("PLAYER 1");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(90, 30, 150, 70);

        t101.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        t101.setForeground(new java.awt.Color(255, 255, 255));
        t101.setText("Instructions");
        jPanel1.add(t101);
        t101.setBounds(970, 130, 220, 50);

        t102.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t102.setForeground(new java.awt.Color(255, 255, 255));
        t102.setText("PLAYER 1");
        jPanel1.add(t102);
        t102.setBounds(920, 250, 110, 50);

        t103.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t103.setForeground(new java.awt.Color(255, 255, 255));
        t103.setText("RESULT");
        jPanel1.add(t103);
        t103.setBounds(950, 710, 110, 50);

        t104.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t104.setForeground(new java.awt.Color(255, 255, 255));
        t104.setText("STEP 3: Click On Your Player Number ");
        jPanel1.add(t104);
        t104.setBounds(930, 500, 350, 50);

        t105.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t105.setForeground(new java.awt.Color(255, 255, 255));
        t105.setText("STEP 2: Click Play To Start The Game");
        jPanel1.add(t105);
        t105.setBounds(930, 400, 350, 50);

        t106.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t106.setForeground(new java.awt.Color(255, 255, 255));
        t106.setText("STEP 1: Select Your Player Color");
        jPanel1.add(t106);
        t106.setBounds(930, 190, 350, 50);

        t107.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t107.setForeground(new java.awt.Color(255, 255, 255));
        t107.setText("PLAYER 2");
        jPanel1.add(t107);
        t107.setBounds(920, 290, 110, 50);

        Jcb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE COLOR HERE", "RED", "BLUE", "GREEN", "YELLOW", "PINK", "ORANGE" }));
        jPanel1.add(Jcb2);
        Jcb2.setBounds(1070, 300, 170, 22);

        Jcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE COLOR HERE", "RED", "BLUE", "GREEN", "YELLOW", "PINK", "ORANGE" }));
        Jcb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcb1ActionPerformed(evt);
            }
        });
        jPanel1.add(Jcb1);
        Jcb1.setBounds(1070, 260, 170, 22);

        t3.setBackground(new java.awt.Color(255, 0, 0));
        t3.setText("BACK");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(730, 30, 150, 70);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(1380, -10, 650, 830);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1390, 800);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2030, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 760, 2030, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
t2.setBackground(Color.green);
t1.setBackground(Color.red);
b = 1;
a = 0;
    }//GEN-LAST:event_t2ActionPerformed
    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
t1.setBackground(Color.green);
t2.setBackground(Color.red);
b = 0;
a = 1;
    }//GEN-LAST:event_t1ActionPerformed
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
b1.setBackground(Color.gray);
b2.setBackground(Color.gray);
b3.setBackground(Color.gray);
b4.setBackground(Color.gray);
b5.setBackground(Color.gray);
b6.setBackground(Color.gray);
b7.setBackground(Color.gray);
b8.setBackground(Color.gray);
b9.setBackground(Color.gray);
t0.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
this.ml = Jcb1.getSelectedIndex();
this.mp = Jcb2.getSelectedIndex();
switch(ml)
{
    case 1 : color1 = Color.RED; break;
    case 2 : color1 = Color.BLUE; break;
    case 3 : color1 = Color.GREEN; break;
    case 4 : color1 = Color.YELLOW; break;
    case 5 : color1 = Color.PINK; break;
    case 6 : color1 = Color.ORANGE;
}
switch(mp)
{
    case 1 : color2 = Color.RED; break;
    case 2 : color2 = Color.BLUE; break;
    case 3 : color2 = Color.GREEN; break;
    case 4 : color2 = Color.YELLOW; break;
    case 5 : color2 = Color.PINK; break;
    case 6 : color2 = Color.ORANGE;
}
if (a == 1)
{
    b1.setBackground(color1);

}
if (b == 1)
{
    b1.setBackground(color2);
    
}
Color selected = b1.getBackground();
Color g = b2.getBackground();
Color h = b3.getBackground();
Color i = b4.getBackground();
Color j = b5.getBackground();
Color k = b7.getBackground();
Color l = b9.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
    }
}
if ( selected == j )
{
    if (selected == l)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
    }
}
    }//GEN-LAST:event_b1ActionPerformed
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
this.ml = Jcb1.getSelectedIndex();
this.mp = Jcb2.getSelectedIndex();
switch(ml)
{
    case 1 : color1 = Color.RED; break;
    case 2 : color1 = Color.BLUE; break;
    case 3 : color1 = Color.GREEN; break;
    case 4 : color1 = Color.YELLOW; break;
    case 5 : color1 = Color.PINK; break;
    case 6 : color1 = Color.ORANGE;
}
switch(mp)
{
    case 1 : color2 = Color.RED; break;
    case 2 : color2 = Color.BLUE; break;
    case 3 : color2 = Color.GREEN; break;
    case 4 : color2 = Color.YELLOW; break;
    case 5 : color2 = Color.PINK; break;
    case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b2.setBackground(color1);
}
if (b == 1)
{
    b2.setBackground(color2);
   
}
Color selected = b2.getBackground();
Color g = b1.getBackground();
Color h = b3.getBackground();
Color i = b5.getBackground();
Color k = b8.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b2ActionPerformed
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b3.setBackground(color1);
}
if (b == 1)
{
    b3.setBackground(color2);
    
}
Color selected = b3.getBackground();
Color g = b1.getBackground();
Color h = b2.getBackground();
Color i = b5.getBackground();
Color j = b6.getBackground();
Color k = b7.getBackground();
Color l = b9.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == j )
{
    if (selected == l)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b3ActionPerformed
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b4.setBackground(color1);
    

}
if (b == 1)
{
    b4.setBackground(color2);
}
Color selected = b4.getBackground();
Color g = b1.getBackground();
Color h = b7.getBackground();
Color i = b5.getBackground();
Color k = b6.getBackground();
if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
    }
}
    }//GEN-LAST:event_b4ActionPerformed
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b5.setBackground(color1);
}
if (b == 1)
{
    b5.setBackground(color2);
    
}
Color selected = b5.getBackground();
Color g = b1.getBackground();
Color h = b9.getBackground();
Color i = b2.getBackground();
Color j = b3.getBackground();
Color k = b8.getBackground();
Color l = b7.getBackground();
Color q = b4.getBackground();
Color w = b6.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == j )
{
    if (selected == l)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == q )
{
    if (selected == w)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b5ActionPerformed
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b6.setBackground(color1);
}
if (b == 1)
{
    b6.setBackground(color2);
   
}
Color selected = b6.getBackground();
Color g = b3.getBackground();
Color h = b9.getBackground();
Color i = b4.getBackground();
Color k = b5.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b7.setBackground(color1);
}
if (b == 1)
{
    b7.setBackground(color2);
   
}
Color selected = b7.getBackground();
Color g = b1.getBackground();
Color h = b4.getBackground();
Color i = b3.getBackground();
Color j = b9.getBackground();
Color k = b5.getBackground();
Color l = b8.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == j )
{
    if (selected == l)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b7ActionPerformed
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed

        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }
if (a == 1)
{
    b8.setBackground(color1);
}
if (b == 1)
{
    b8.setBackground(color2);
}
Color selected = b8.getBackground();
Color g = b2.getBackground();
Color h = b5.getBackground();
Color i = b7.getBackground();
Color k = b9.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b8ActionPerformed
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed

        this.ml = Jcb1.getSelectedIndex();
        this.mp = Jcb2.getSelectedIndex();
        switch(ml)
        {
            case 1 : color1 = Color.RED; break;
            case 2 : color1 = Color.BLUE; break;
            case 3 : color1 = Color.GREEN; break;
            case 4 : color1 = Color.YELLOW; break;
            case 5 : color1 = Color.PINK; break;
            case 6 : color1 = Color.ORANGE;
        }
        switch(mp)
        {
            case 1 : color2 = Color.RED; break;
            case 2 : color2 = Color.BLUE; break;
            case 3 : color2 = Color.GREEN; break;
            case 4 : color2 = Color.YELLOW; break;
            case 5 : color2 = Color.PINK; break;
            case 6 : color2 = Color.ORANGE;
        }if (a == 1)
{
    b9.setBackground(color1);
}
if (b == 1)
{
    b9.setBackground(color2);

}
Color selected = b9.getBackground();
Color g = b1.getBackground();
Color h = b5.getBackground();
Color i = b3.getBackground();
Color j = b7.getBackground();
Color k = b6.getBackground();
Color l = b8.getBackground();

if ( selected == g )
{
    if (selected == h)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == i )
{
    if (selected == k)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
if ( selected == j )
{
    if (selected == l)
    {
        if (a == 1)
        {
            t0.setText("Player1Wins");
        }
        if (b == 1)
        {
            t0.setText("Player2Wins");
        }
        
    }
}
    }//GEN-LAST:event_b9ActionPerformed
    private void Jcb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcb1ActionPerformed
    }//GEN-LAST:event_Jcb1ActionPerformed
    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
            C obj = new C();
            this.dispose();
            obj.setVisible(true);
    }//GEN-LAST:event_t3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new C5().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcb1;
    private javax.swing.JComboBox<String> Jcb2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel t0;
    private javax.swing.JButton t1;
    private javax.swing.JLabel t100;
    private javax.swing.JLabel t101;
    private javax.swing.JLabel t102;
    private javax.swing.JLabel t103;
    private javax.swing.JLabel t104;
    private javax.swing.JLabel t105;
    private javax.swing.JLabel t106;
    private javax.swing.JLabel t107;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    // End of variables declaration//GEN-END:variables
}
