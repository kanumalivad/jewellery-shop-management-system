package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;
import javax.swing.*;
public class MessageBox extends javax.swing.JDialog implements MouseListener, ActionListener
{   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblmsg = new javax.swing.JLabel();
        btnclose = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        lblimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblmsg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblmsg.setText("msg");

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N

        btn2.setBackground(new java.awt.Color(254, 137, 0));
        btn2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Cancel");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btn2.setContentAreaFilled(false);
        btn2.setOpaque(true);

        btn1.setBackground(new java.awt.Color(254, 137, 0));
        btn1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Ok");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btn1.setContentAreaFilled(false);
        btn1.setOpaque(true);

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wrong_Sign.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblimg)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 245, Short.MAX_VALUE)
                        .addComponent(btnclose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblmsg)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnclose)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblimg)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblmsg)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel btnclose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblmsg;
    // End of variables declaration//GEN-END:variables
    Dimension size;
    MDI_Frame mainframe;
    String clicked_btn_value;
    public MessageBox(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        mainframe=(MDI_Frame)parent;
        
        size=mainframe.getBounds().getSize();
        setLocation((size.width/2),(size.height/2));
        
        btn1.setVisible(false);
        btn2.setVisible(false);
        
        btnclose.addMouseListener(this);
        btn1.addMouseListener(this);
        btn2.addMouseListener(this);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
    }
    public String getClickedButton()
    {
        return clicked_btn_value;
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn1)
        {
            clicked_btn_value=btn1.getText();
            this.dispose();
        }
        else if(ae.getSource()==btn2)
        {
            clicked_btn_value=btn2.getText();
            this.dispose();
        }
    }
    public void setMessage(String msg,int msgType)
    {
        lblmsg.setText(msg);
       
            
        if(msgType==0)
        {
            ImageIcon icon= new ImageIcon(getClass().getResource("\\images\\Info_Sign.png"));
            lblimg.setIcon(icon);
            lblmsg.setForeground(new Color(65,105,255));
        }
        else if(msgType==1)
        {
            ImageIcon icon= new ImageIcon(getClass().getResource("\\images\\Wrong_Sign.png"));
            lblimg.setIcon(icon);
            lblmsg.setForeground(new Color(255,19,13));
        }
        else if(msgType==2)
        {
            ImageIcon icon= new ImageIcon(getClass().getResource("\\images\\Right_Sign.png"));
            lblimg.setIcon(icon);
            lblmsg.setForeground(new Color(63,144,24));
        }
    }
    public void addOneButton(String nm)
    {
        btn1.setText(nm);       
        btn1.setVisible(true);
    }
    public void addTwoButton(String nm1,String nm2)
    {
        btn2.setText(nm2);       
        btn2.setVisible(true);
        btn1.setText(nm1);       
        btn1.setVisible(true);
    }
    public void mouseClicked(MouseEvent me)
    {  
       if(me.getSource()==btnclose)
       {
           clicked_btn_value=btn1.getText();
           this.dispose();
       }
    }
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==btn1)
        {
            btn1.setContentAreaFilled(true);
            btn1.setForeground(new Color(255,152,0)); 
            btn1.setContentAreaFilled(false);           
        }
        else if(me.getSource()==btn2)
        {
            btn2.setContentAreaFilled(true);
            btn2.setForeground(new Color(255,152,0)); 
            btn2.setContentAreaFilled(false);        
        }
    }
    public void mouseReleased(MouseEvent me)
    {
        if(me.getSource()==btn1)
        {
            btn1.setContentAreaFilled(true);
            btn1.setForeground(Color.white);   
            btn1.setBackground(new Color(254,137,0));
        }
        else if(me.getSource()==btn2)
        {
            btn2.setContentAreaFilled(true);
            btn2.setForeground(Color.white);   
            btn2.setBackground(new Color(254,137,0));
        }
    }   
}
