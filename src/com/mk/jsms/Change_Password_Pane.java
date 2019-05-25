package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
public class Change_Password_Pane extends javax.swing.JPanel implements MouseListener, ActionListener, DocumentListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblop = new javax.swing.JLabel();
        lblnewp = new javax.swing.JLabel();
        lblnewrp = new javax.swing.JLabel();
        txtoldp = new javax.swing.JPasswordField();
        txtnewp = new javax.swing.JPasswordField();
        txtnewrp = new javax.swing.JPasswordField();
        btnok = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblop.setText("Old Password");

        lblnewp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblnewp.setText("New Password");

        lblnewrp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblnewrp.setText("Retype Password");

        txtoldp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        txtnewp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        txtnewrp.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        btnok.setBackground(new java.awt.Color(254, 137, 0));
        btnok.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setText("Ok");
        btnok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnok.setContentAreaFilled(false);
        btnok.setEnabled(false);
        btnok.setOpaque(true);

        btncancel.setBackground(new java.awt.Color(254, 137, 0));
        btncancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btncancel.setContentAreaFilled(false);
        btncancel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblop)
                    .addComponent(lblnewp)
                    .addComponent(lblnewrp))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addComponent(txtoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txtnewp)
                    .addComponent(txtnewrp))
                .addContainerGap(451, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblop)
                    .addComponent(txtoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnewp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnewp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnewrp)
                    .addComponent(txtnewrp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel lblnewp;
    private javax.swing.JLabel lblnewrp;
    private javax.swing.JLabel lblop;
    private javax.swing.JPasswordField txtnewp;
    private javax.swing.JPasswordField txtnewrp;
    private javax.swing.JPasswordField txtoldp;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    public Change_Password_Pane(MDI_Frame frm) 
    {
        initComponents();
        setBounds(220, 180, 865, 420);
        mainframe=frm;
        setVisible(false);
        btnok.addMouseListener(this);
        btncancel.addMouseListener(this);
        btnok.addActionListener(this);
        btncancel.addActionListener(this);
        
        txtoldp.getDocument().addDocumentListener(this);
        txtnewp.getDocument().addDocumentListener(this);
        txtnewrp.getDocument().addDocumentListener(this);
        
        FocusForTextbox f =new FocusForTextbox();
        txtoldp.addFocusListener(f);
        txtnewp.addFocusListener(f);
        txtnewrp.addFocusListener(f);
        
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        CheckNotNull();      
    }
    public void removeUpdate(DocumentEvent e)
    {
        CheckNotNull();
    }    
    public  void  clearAll()
    {
        txtnewp.setText("");
        txtoldp.setText("");
        txtnewrp.setText("");
    }
    public void CheckNotNull()
    {  
        if(!txtoldp.getText().equals("") && !txtnewp.getText().equals("") && !txtnewrp.getText().equals(""))
        {
            btnok.setEnabled(true);       
        }
        else 
        {
            btnok.setEnabled(false);
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String oldp=new String();  
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Password");
            if(ae.getSource()==btnok)
            {        
                boolean flag=false;
                while(rs.next())
                {    
                    if(rs.getString(1).equals(txtoldp.getText()))
                    {
                        flag=true;
                        oldp=txtoldp.getText();
                    }
                }
                if(flag == false)
                {         
                    MessageBox msg=new MessageBox(mainframe,true);
                    msg.addOneButton("OK");
                    msg.setMessage("Wrong password...",1);
                    msg.setVisible(true);
                    txtoldp.setText("");
                    txtoldp.requestFocus();                 
                }
                else
                {
                    if(!txtnewrp.getText().equals(txtnewp.getText()))
                    {       
                        MessageBox msg=new MessageBox(mainframe,true);
                        msg.addOneButton("OK");
                        msg.setMessage("Password not matched...",1);
                        msg.setVisible(true);
                        txtnewrp.setText("");
                        txtnewrp.requestFocus();
                    } 
                    else
                    {
                        st.execute("insert into Password values('"+txtnewp.getText()+"')");
                       
                         MessageBox msg=new MessageBox(mainframe,true);
                         msg.addOneButton("OK");
                         msg.setMessage("password changed successfully...",2);
                         msg.setVisible(true);
                        st.execute("delete  from Password where password='"+oldp+"'");
                        clearAll();          
                    }
                }
            }
            else if(ae.getSource()==btncancel)
            {
                this.setVisible(false);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }      
    }
     public void mouseClicked(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==btnok)
        {
            btnok.setContentAreaFilled(true);
            btnok.setForeground(new Color(255,152,0)); 
            btnok.setContentAreaFilled(false);        
        }
        else if(me.getSource()==btncancel)
        {
            btncancel.setContentAreaFilled(true);
            btncancel.setForeground(new Color(255,152,0)); 
            btncancel.setContentAreaFilled(false);        
        }
    }
    public void mouseReleased(MouseEvent me)
    {
        if(me.getSource()==btnok)
        {
            btnok.setContentAreaFilled(true);
            btnok.setForeground(Color.white);   
            btnok.setBackground(new Color(254,137,0));
        }
        else if(me.getSource()==btncancel)
        {
            btncancel.setContentAreaFilled(true);
            btncancel.setForeground(Color.white);   
            btncancel.setBackground(new Color(254,137,0));
        }
    }
}

