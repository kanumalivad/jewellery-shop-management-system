package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.*;
public class Add_Order_Pane extends javax.swing.JPanel implements MouseListener, DocumentListener, ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblerr2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtew = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtdd = new javax.swing.JLabel();
        txtdate = new com.michaelbaranov.microba.calendar.DatePicker();
        txtdate1 = new com.michaelbaranov.microba.calendar.DatePicker();
        lblerr = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsta = new javax.swing.JComboBox<>();
        btn = new javax.swing.JButton();
        txtname = new javax.swing.JComboBox<>();

        lblerr2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblerr2.setForeground(new java.awt.Color(0, 153, 51));

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Order ID");

        btnadd.setBackground(new java.awt.Color(254, 137, 0));
        btnadd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnadd.setContentAreaFilled(false);
        btnadd.setEnabled(false);
        btnadd.setNextFocusableComponent(btnreset);
        btnadd.setOpaque(true);

        txtid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtid.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Customer Name");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("Item");

        txttype.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txttype.setNextFocusableComponent(txtew);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel6.setText("Excepted weight");

        txtew.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtew.setNextFocusableComponent(txtprice);

        btnreset.setBackground(new java.awt.Color(254, 137, 0));
        btnreset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnreset.setContentAreaFilled(false);
        btnreset.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel7.setText("Price");

        txtprice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtprice.setNextFocusableComponent(txtdate);

        txtdd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        txtdd.setText("Delievery date");

        txtdate.setNextFocusableComponent(btnadd);

        txtdate1.setEnabled(false);

        lblerr.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblerr.setForeground(new java.awt.Color(0, 153, 51));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel8.setText("Status");

        txtsta.setEditable(true);
        txtsta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtsta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incomplete", "Complete", " " }));
        txtsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstaActionPerformed(evt);
            }
        });

        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        txtname.setEditable(true);
        txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtname.setNextFocusableComponent(txttype);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtdd))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblerr)
                        .addGap(18, 18, 18)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txttype, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(txtdate1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtdd))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblerr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstaActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblerr;
    private javax.swing.JLabel lblerr2;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate1;
    private javax.swing.JLabel txtdd;
    private javax.swing.JTextField txtew;
    private javax.swing.JTextField txtid;
    private javax.swing.JComboBox<String> txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JComboBox<String> txtsta;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
    String oid;
    MDI_Frame mainframe;
    public Add_Order_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 865, 420);
        setVisible(false);
        btnadd.addMouseListener(this);
        btnreset.addMouseListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        txtid.addFocusListener(f);
        txttype.addFocusListener(f);
        txtew.addFocusListener(f);
        txtprice.addFocusListener(f);
   
        txtid.getDocument().addDocumentListener(this);
        txttype.getDocument().addDocumentListener(this);
        txtew.getDocument().addDocumentListener(this);
        txtprice.getDocument().addDocumentListener(this);
        
        btnadd.addActionListener(this);
        btnreset.addActionListener(this);
        
        onlyNumbersDot listener=new onlyNumbersDot();
        txtew.addKeyListener(listener);
        txtprice.addKeyListener(listener);
        txtdate1.setVisible(false);
        txtname.getEditor().getEditorComponent().addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent ke)
            {               
                btn.requestFocus();
                txtname.showPopup();
            }
            
        });
        txtname.getEditor().getEditorComponent().addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent fe)
            {   txtname.showPopup();   }
        });
        
        getLastID();
        
        btn.setBounds(50,25,870,100);
        btn.addActionListener(this);
        btn.addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                
                btn.doClick();
                txtname.requestFocus();
                txtname.showPopup();
            }           
        });
        
       
    }
    public void loadData(String oid)
    {
        clearAll();
        this.oid=oid;
        btnadd.setText("Update");
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Orders where Order_id='"+oid+"'");    
            
            rs.next();
            txtid.setText(rs.getString(1));
            txtname.addItem(rs.getString(2));
            txttype.setText(rs.getString(3));
            txtew.setText(rs.getString(4));
            txtprice.setText(rs.getString(5));
            String  date=rs.getString(6);
            int day=Integer.parseInt(date.substring(0,2));
            int month=Integer.parseInt(date.substring(3,5));
            int year=Integer.parseInt(date.substring(6,10));
            
           
             
            txtdate.setDate(new Date(year,month,day));
            txtdate.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }       
    }
    public void clearAll()
    {
        txtname.removeAllItems();
        txttype.setText("");
        txtew.setText("");
        txtprice.setText("");
        lblerr.setText("");
        if(btnadd.getText().equals("Update"))
        {
            btnadd.setText("Add");
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
            ResultSet rs=st.executeQuery("select * from Orders");
            
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
            st.close();
            con.close();
            txtid.setText(s);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btnadd)
        {
            if(btnadd.getText().equals("Add"))
            {
                try
                {
                    String id=txtid.getText();
                    String name=txtname.getSelectedItem().toString();
                    String item=txttype.getText();
                    Double ew=Double.parseDouble(txtew.getText());
                    Double price=Double.parseDouble(txtprice.getText());
                    SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
                    String delieverydate = sm.format(txtdate.getDate());
                    String issuedate=sm.format(txtdate1.getDate());
                    String sta=txtsta.getSelectedItem().toString();

                    Connection con=DBConnection.getDBConnection();
                    PreparedStatement st = con.prepareStatement("insert into Orders(Order_id,Customer_name,Item_name,Expected_weight,Price,Issue_date,Delievery_date,Status) values(?,?,?,?,?,?,?,?)");

                    st.setString(1,id);
                    st.setString(2,name);
                    st.setString(3,item);
                    st.setDouble(4,ew);
                    st.setDouble(5,price);
                    st.setString(6,delieverydate);
                    st.setString(7,issuedate);
                    st.setString(8,sta);

                    st.execute();
                    clearAll();

                    Thread.sleep(500);
                    getLastID();
                    MessageBox msg=new MessageBox(mainframe,true);
                    msg.addOneButton("OK");
                    msg.setMessage("Order saved...",2);
                    msg.setVisible(true);        
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
                {
                    try
                    {
                        String id=txtid.getText();
                        String name=txtname.getSelectedItem().toString();
                        String item=txttype.getText();
                        Double ew=Double.parseDouble(txtew.getText());
                        Double price=Double.parseDouble(txtprice.getText());
                        SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
                        String delieverydate = sm.format(txtdate.getDate());
                        String issuedate=sm.format(txtdate1.getDate());
                        String sta=txtsta.getSelectedItem().toString();
                        
                        Connection con=DBConnection.getDBConnection();
                        PreparedStatement st = con.prepareStatement("update Orders set Order_id=?,Customer_name=?,Item_name=?, Expected_weight=?, Price=?, Issue_date=?, Delievery_date=?, Status=? where Order_id='"+oid+"'");

                        st.setString(1,id);
                        st.setString(2,name);
                        st.setString(3,item);
                        st.setDouble(4,ew);
                        st.setDouble(5,price);
                        st.setString(6,delieverydate);
                        st.setString(7,issuedate);
                        st.setString(8,sta);

                        
                        st.execute();
                        
                        MessageBox msg=new MessageBox(mainframe,true);
                        msg.addOneButton("OK");
                        msg.setMessage("Order updated...",2);
                        msg.setVisible(true);
                        clearAll();                      
                        getLastID();
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
        else if(ae.getSource()==btn)
        {
            autoSuggesion(txtname.getSelectedItem().toString());
            
        }
    }
    public void autoSuggesion(String text)
    {
        try
        {
            if(!text.equals(""))
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
               
                ResultSet rs=st.executeQuery("select * from Customers_Details where Name like '%"+text+ "%'" );
                
                txtname.removeAllItems();
                
                txtname.addItem(text);
                while(rs.next())
                {
                    txtname.addItem(rs.getString(2));
                }                    
            }
            else 
            {
                txtname.removeAllItems();
            }
            
        }
        catch(Exception e)
            {
                System.out.println(e);
            }
    }
    public void CheckNotNull()
    {
       lblerr.setText("");
        if(!txtid.getText().equals("") &&  !txttype.getText().equals("")&& !txtew.getText().equals("")&& !txtprice.getText().equals(""))
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
