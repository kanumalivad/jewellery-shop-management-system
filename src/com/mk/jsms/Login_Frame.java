package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.LineBorder;
public class Login_Frame extends javax.swing.JFrame implements ActionListener,MouseListener
{   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pen = new javax.swing.JPanel();
        btnclose = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setUndecorated(true);

        pen.setBackground(new java.awt.Color(250, 250, 250));
        pen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N

        lblpass.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 27)); // NOI18N
        lblpass.setText("Password");

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        txtpass.setHighlighter(null);

        btnlogin.setBackground(new java.awt.Color(254, 137, 0));
        btnlogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnlogin.setContentAreaFilled(false);
        btnlogin.setOpaque(true);

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_icon.png"))); // NOI18N

        javax.swing.GroupLayout penLayout = new javax.swing.GroupLayout(pen);
        pen.setLayout(penLayout);
        penLayout.setHorizontalGroup(
            penLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(penLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(penLayout.createSequentialGroup()
                        .addComponent(lblpass)
                        .addGap(18, 18, 18)
                        .addComponent(txtpass))
                    .addComponent(lbllogo)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnclose))
        );
        penLayout.setVerticalGroup(
            penLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penLayout.createSequentialGroup()
                .addGroup(penLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclose)
                    .addComponent(lbllogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(penLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pen, javax.swing.GroupLayout.PREFERRED_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnclose;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblpass;
    private javax.swing.JPanel pen;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
    
    Dimension screen_size;
    Connection con;
    MDI_Frame mainframe;
    public Login_Frame(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        screen_size=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen_size.width/2-230),(screen_size.height/2-155));
        
        btnlogin.setContentAreaFilled(true);
        btnlogin.addMouseListener(this);
        btnlogin.addActionListener(this);
        btnclose.addMouseListener(this);
        
        txtpass.addFocusListener(new FocusForTextbox());
        
    } 
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Password");
            boolean flag=false;
            while(rs.next())
            {    
                if(rs.getString(1).equals(txtpass.getText()))
                {
                    
                    mainframe.setVisible(true);
                    flag=true;
                    this.dispose();                  
                }
            }
            if(flag == false)
            {
                MessageBox msg=new MessageBox(mainframe,true);
                msg.addOneButton("OK");
                msg.setMessage("Incorrect password...",1);
                msg.setVisible(true);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void mouseClicked(MouseEvent me)
    {  
        if(me.getSource()==btnclose)
        {
            System.exit(0);
        }
    }
    public void mouseEntered(MouseEvent me)
    {}
   
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==btnlogin)
        {
            btnlogin.setForeground(new Color(255,152,0)); 
            btnlogin.setContentAreaFilled(false);
           
        }
    }
  
    public void mouseReleased(MouseEvent me)
    {
        if(me.getSource()==btnlogin)
        {
            btnlogin.setContentAreaFilled(true);
            btnlogin.setForeground(Color.white);   
            btnlogin.setBackground(new Color(254,137,0));
        }
    }
}

