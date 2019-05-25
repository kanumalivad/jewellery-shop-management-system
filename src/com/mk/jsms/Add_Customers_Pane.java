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
public class Add_Customers_Pane extends javax.swing.JPanel implements MouseListener, DocumentListener,ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmobileno = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        lblerr2 = new javax.swing.JLabel();
        txtdate = new com.michaelbaranov.microba.calendar.DatePicker();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Customer ID");

        btnadd.setBackground(new java.awt.Color(254, 137, 0));
        btnadd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnadd.setContentAreaFilled(false);
        btnadd.setEnabled(false);
        btnadd.setOpaque(true);

        txtid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtid.setEnabled(false);
        txtid.setNextFocusableComponent(txtname);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Name");

        txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtname.setNextFocusableComponent(txtcity);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("City");

        txtcity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtcity.setNextFocusableComponent(txtmobileno);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel6.setText("Mobile No");

        txtmobileno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtmobileno.setNextFocusableComponent(btnadd);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblerr2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11))
                        .addComponent(txtid)
                        .addComponent(txtname)
                        .addComponent(txtcity)
                        .addComponent(txtmobileno)))
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblerr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblerr2;
    private javax.swing.JTextField txtcity;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    String cid; 
    public Add_Customers_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 720, 370);
        setVisible(false);
        btnadd.addMouseListener(this);
        btnreset.addMouseListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        txtid.addFocusListener(f);
        txtname.addFocusListener(f);
        txtcity.addFocusListener(f);
        txtmobileno.addFocusListener(f);
        
        
        btnadd.addActionListener(this);
        btnreset.addActionListener(this);
        
        
        txtmobileno.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e) 
            {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) 
                {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
        
        txtid.getDocument().addDocumentListener(this);
        txtname.getDocument().addDocumentListener(this);
        txtcity.getDocument().addDocumentListener(this);
        txtmobileno.getDocument().addDocumentListener(this);
        
        txtdate.setVisible(false);
        
        getLastID();
       
    }
    public void loadData(String cid)
    {
        clearAll();
        this.cid=cid;
        btnadd.setText("Update");
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Customers_Details where Customer_id='"+cid+"'");    
            
            rs.next();
            txtid.setText(rs.getString(1));
            txtname.setText(rs.getString(2));
            txtcity.setText(rs.getString(3));
            txtmobileno.setText(rs.getString(4));
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
           
             
           
        
        
    }
    public void getLastID()
    {
        String str=new String();
        String str2=new String();
        try
        {
            
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from Customers_Details");
            
            while(rs.next())
            {                
                str=rs.getString(1);
            }   
            String s=str.substring(0,3);
            
            int idno=Integer.parseInt(str.substring(3,6));
            
            idno++;
            if(idno<10)
                str="00"+idno;
            else if(idno<100)
                str="0"+idno;
            else
                str=idno+"";
            s=s+str;
            txtid.setText(s);
     
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
                    String cid=txtid.getText();
                    String cname=txtname.getText();
                    String ct=txtcity.getText();
                    String mn=txtmobileno.getText();
                    SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
                    String strDate = sm.format(txtdate.getDate());
                
                    Connection con=DBConnection.getDBConnection();
                    PreparedStatement st = con.prepareStatement("insert into Customers_Details(Customer_id,Name,City,Mobile_no,dt) values(?,?,?,?,?)");
                    
                    st.setString(1,cid);
                    st.setString(2,cname);
                    st.setString(3,ct);
                    st.setString(4,mn);    
                    st.setString(5,strDate);
                    st.execute();
                    
                    clearAll();            
                    Thread.sleep(500);                    
                    getLastID();
                    MessageBox msg=new MessageBox(mainframe,true);
                    msg.addOneButton("OK");
                    msg.setMessage("Customer saved...",2);
                    msg.setVisible(true);
                    
                }
                else
                {
                    try
                    {
                        String name=txtname.getText();
                        String city=txtcity.getText();
                        String mn=txtmobileno.getText();
                        
                        Connection con=DBConnection.getDBConnection();
                        PreparedStatement st = con.prepareStatement("update Customers_Details set Name=?,City=?,Mobile_no=? where Customer_id='"+cid+"'");

                        st.setString(1,name);
                        st.setString(2,city);
                        st.setString(3,mn);
                        
                        st.execute();
                        
                        MessageBox msg=new MessageBox(mainframe,true);
                        msg.addOneButton("OK");
                        msg.setMessage("Customer updated...",2);
                        msg.setVisible(true);
                        
                        clearAll();
                        getLastID();
                        mainframe.customerpen.changeEdittoAdd();
                        
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
        txtname.setText("");
        txtcity.setText("");
        txtmobileno.setText("");
        lblerr2.setText("");
        if(btnadd.getText().equals("Update"))
        {
            btnadd.setText("Add");
        }
        
    }
    public void CheckNotNull()
    {
        
       lblerr2.setText("");
       
        if(!txtid.getText().equals("") && !txtname.getText().equals("") && !txtcity.getText().equals("")&& !txtmobileno.getText().equals(""))
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
