package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
public class Add_Label_Pane extends javax.swing.JPanel implements MouseListener, DocumentListener,ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtlbl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        lblerr2 = new javax.swing.JLabel();
        txtdate = new com.michaelbaranov.microba.calendar.DatePicker();

        setBackground(new java.awt.Color(255, 255, 255));

        btnadd.setBackground(new java.awt.Color(254, 137, 0));
        btnadd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnadd.setContentAreaFilled(false);
        btnadd.setEnabled(false);
        btnadd.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Label");

        txtlbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtlbl.setNextFocusableComponent(txtitemname);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("Item_Name");

        txtitemname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemnameActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(254, 137, 0));
        btnreset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnreset.setContentAreaFilled(false);
        btnreset.setOpaque(true);

        lblerr2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblerr2.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblerr2)
                                .addComponent(txtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(lblerr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemnameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblerr2;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextField txtlbl;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    String lbl; 
    public Add_Label_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
         this.setBounds(220, 180, 865, 420);
        setVisible(false);
        btnadd.addMouseListener(this);
        btnreset.addMouseListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        
        txtlbl.addFocusListener(f);
        txtitemname.addFocusListener(f);
       
        
        
        btnadd.addActionListener(this);
        btnreset.addActionListener(this);
        
        
        
        
        
        txtlbl.getDocument().addDocumentListener(this);
        txtitemname.getDocument().addDocumentListener(this);
        
        
        txtdate.setVisible(false);
              
       
    }
    public void loadData(String lbl)
    {
        clearAll();
        this.lbl=lbl;
        btnadd.setText("Update");
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Product_List where Label='"+lbl+"'");    
            
            rs.next();
            
            txtlbl.setText(rs.getString(1));
            txtitemname.setText(rs.getString(2));
            
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            if(ae.getSource()==btnadd)
            {
                if(btnadd.getText().equals("Add"))
                {
                    
                    String lbl=txtlbl.getText();
                    String item=txtitemname.getText();                   
                
                    Connection con=DBConnection.getDBConnection();
                    PreparedStatement st = con.prepareStatement("insert into Product_List(Label,Item_name) values(?,?)");
                    
                    st.setString(1,lbl);
                    st.setString(2,item);
                    
                    st.execute();
                                                   
                    Thread.sleep(500);                    
                    
                    MessageBox msg=new MessageBox(mainframe,true);
                    msg.addOneButton("OK");
                    msg.setMessage("Label saved...",2);
                    msg.setVisible(true);
                    clearAll();
                    
                }
                else
                {
                    try
                    {
                        String name=txtlbl.getText();
                        String city=txtitemname.getText();
                        
                       
                        Connection con=DBConnection.getDBConnection();
                        PreparedStatement st = con.prepareStatement("update Product_List set Label=?,Item_name=? where Label='"+lbl+"'");

                        st.setString(1,name);
                        st.setString(2,city);
                        
                        
                        st.execute();
                        
                        MessageBox msg=new MessageBox(mainframe,true);
                        msg.addOneButton("OK");
                        msg.setMessage("Label updated...",2);
                        msg.setVisible(true);
                        
                        clearAll();
                        mainframe.lblpen.changeEdittoAdd();
                        
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
                
            }              
            else if(ae.getSource()==btnreset)
            {
                clearAll();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void clearAll()
    {
        txtlbl.setText("");
        txtitemname.setText("");
             
        if(btnadd.getText().equals("Update"))
        {
            btnadd.setText("Add");
        }
        
    }
    public void CheckNotNull()
    {
        
       lblerr2.setText("");
       
        if(!txtlbl.getText().equals("") && !txtitemname.getText().equals(""))
        {
            btnadd.setEnabled(true);       
        }
        else 
        {
            btnadd.setEnabled(false);
        }
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
     public void mouseClicked(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
   
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==btnadd)
        {
            btnadd.setContentAreaFilled(true);
            btnadd.setForeground(new Color(255,152,0)); 
            btnadd.setContentAreaFilled(false);        
        }
        else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(new Color(255,152,0)); 
            btnreset.setContentAreaFilled(false);        
        }
        
    }
  
    public void mouseReleased(MouseEvent me)
    {
        if(me.getSource()==btnadd)
        {
            btnadd.setContentAreaFilled(true);
            btnadd.setForeground(Color.white);   
            btnadd.setBackground(new Color(254,137,0));
        }
        else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(Color.white);   
            btnreset.setBackground(new Color(254,137,0));
        }
 
    }
}
