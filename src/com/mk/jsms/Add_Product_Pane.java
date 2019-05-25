package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;
import java.text.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class Add_Product_Pane extends javax.swing.JPanel implements MouseListener, ActionListener,DocumentListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        btnreset = new javax.swing.JButton();
        txtlblno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtpcs = new javax.swing.JTextField();
        txtsize = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtgrweight = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtdiff = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtnetweight = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtlbl = new javax.swing.JComboBox<>();
        txttype = new javax.swing.JComboBox<>();
        txtdate = new com.michaelbaranov.microba.calendar.DatePicker();

        jTextField1.setText("jTextField1");

        jTextField8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Label");

        btnadd.setBackground(new java.awt.Color(254, 137, 0));
        btnadd.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnadd.setContentAreaFilled(false);
        btnadd.setEnabled(false);
        btnadd.setOpaque(true);

        txtdesc.setColumns(20);
        txtdesc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtdesc.setLineWrap(true);
        txtdesc.setRows(5);
        txtdesc.setAutoscrolls(false);
        txtdesc.setMinimumSize(new java.awt.Dimension(104, 50));
        txtdesc.setNextFocusableComponent(btnadd);
        jScrollPane1.setViewportView(txtdesc);

        btnreset.setBackground(new java.awt.Color(254, 137, 0));
        btnreset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnreset.setContentAreaFilled(false);
        btnreset.setOpaque(true);
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        txtlblno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtlblno.setEnabled(false);
        txtlblno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlblnoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel12.setText("Type");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel13.setText("Pieces");

        txtpcs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtpcs.setNextFocusableComponent(txtsize);

        txtsize.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtsize.setNextFocusableComponent(txtgrweight);

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel14.setText("Size");

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel15.setText("Gr weight");

        txtgrweight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtgrweight.setNextFocusableComponent(txtdiff);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel16.setText("Difference");

        txtdiff.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtdiff.setNextFocusableComponent(txtnetweight);

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel17.setText("Net weight");

        txtnetweight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnetweight.setNextFocusableComponent(txtdesc);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel18.setText("Description");

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel19.setText("Date");

        txtlbl.setEditable(true);
        txtlbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtlbl.setBorder(null);
        txtlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlbl.setNextFocusableComponent(txttype);
        txtlbl.setOpaque(false);

        txttype.setEditable(true);
        txttype.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        txttype.setNextFocusableComponent(txtpcs);
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtlblno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txttype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsize)
                            .addComponent(txtpcs))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiff, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgrweight, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnetweight, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlblno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtgrweight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16)
                    .addComponent(txtdiff, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpcs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtnetweight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtlblnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlblnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlblnoActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField8;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtdiff;
    private javax.swing.JTextField txtgrweight;
    private javax.swing.JComboBox<String> txtlbl;
    private javax.swing.JTextField txtlblno;
    private javax.swing.JTextField txtnetweight;
    private javax.swing.JTextField txtpcs;
    private javax.swing.JTextField txtsize;
    private javax.swing.JComboBox<String> txttype;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    public Add_Product_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 720, 370);
        setVisible(false);
        btnadd.addMouseListener(this);
        btnreset.addMouseListener(this);
        btnreset.addMouseListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        jTextField1.addFocusListener(f);
        txtlblno.addFocusListener(f);       
        txtpcs.addFocusListener(f);
        txtsize.addFocusListener(f);
        txtgrweight.addFocusListener(f);
        txtdiff.addFocusListener(f);    
        txtnetweight.addFocusListener(f);
     
        txtlblno.getDocument().addDocumentListener(this);
        txtpcs.getDocument().addDocumentListener(this);
        txtsize.getDocument().addDocumentListener(this);
        txtgrweight.getDocument().addDocumentListener(this);
        txtdiff.getDocument().addDocumentListener(this);
        txtnetweight.getDocument().addDocumentListener(this);
        txtdesc.getDocument().addDocumentListener(this);
        
        
        onlyNumbersnDot keylistener=new onlyNumbersnDot();
        txtpcs.addKeyListener(new KeyAdapter() 
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
        txtsize.addKeyListener(keylistener);
        txtgrweight.addKeyListener(keylistener);
        txtdiff.addKeyListener(keylistener);
        txtnetweight.addKeyListener(keylistener);
        
        //this method is use to fetch labels from the db and add in combo box
        addLabel();

        txtlbl.addActionListener(this);
        txtdate.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        btnadd.addActionListener(this);
        btnreset.addActionListener(this);    
    }
    public void CheckNotNull()
    {     
        if(!txtlblno.getText().equals("") &&!txtpcs.getText().equals("") && !txtsize.getText().equals("") && !txtgrweight.getText().equals("") && !txtdiff.getText().equals("") && !txtnetweight.getText().equals("") && !txtdesc.getText().equals(""))
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
    public void addLabel()
    {
        txtlbl.removeAllItems();
        try
        {
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select distinct Label from Product_List");                      
   
            while(rs.next())
            {
                txtlbl.addItem(rs.getString(1));
            }           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    // this metod get appropriate items from the db
    public void getItems(String label)
    {
        txttype.removeAllItems();
        try
        {
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            
            ResultSet rs=st.executeQuery("select * from Product_List where Label='"+label+"'");
                    
            while(rs.next())
            {
                txttype.addItem(rs.getString(2));
            }
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
            if(ae.getSource()==txtlbl)
            {
                String label=(String)txtlbl.getSelectedItem();  
                getLabelNo(label);     
                getItems(label);
            }
            else if(ae.getSource()==btnadd)
            {
                String label=txtlbl.getSelectedItem().toString()+txtlblno.getText();
                String type=txttype.getSelectedItem().toString();
                int pcs=Integer.parseInt(txtpcs.getText());
                Double size=Double.parseDouble(txtsize.getText());
            
                SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
                String strDate = sm.format(txtdate.getDate());
                              
                Double grweight=Double.parseDouble(txtgrweight.getText());
                Double diff=Double.parseDouble(txtdiff.getText());
                Double netweight=Double.parseDouble(txtnetweight.getText());
                String desc=txtdesc.getText();
                        
                Connection con=DBConnection.getDBConnection();
                PreparedStatement st = con.prepareStatement("insert into Products(Label,Type,Pieces,Size,Gr_weight,Difference,Net_weight,Description,dt) values(?,?,?,?,?,?,?,?,?)");
                
                st.setString(1,label);
                st.setString(2,type);
                st.setInt(3,pcs);
                st.setDouble(4,size);
                st.setDouble(5,grweight);
                st.setDouble(6,diff);
                st.setDouble(7,netweight);
                st.setString(8,desc);
                st.setString(9,strDate);
                
                st.executeUpdate();                 
                                
                MessageBox msg=new MessageBox(mainframe,true);
                msg.addOneButton("OK");
                msg.setMessage("Product saved...",2);
                msg.setVisible(true);
                clearAll();
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
        txtlblno.setText("");
        txtpcs.setText("");
        txtsize.setText("");
        txtgrweight.setText("");
        txtdiff.setText("");
        txtnetweight.setText("");
        txtdesc.setText("");
        
    }
    // this method use to fetch the label no from the db
    public String getLabelNo(String str)
    {
        String no=new String();
        try
        {
            
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("select * from Products");

            while(rs.next())
            {
                String sts=rs.getString(2);
                
                if(sts.substring(0,3).equals(str))
                {
                    no=sts.substring(3,6);                
                }    
            }   
            int a=Integer.parseInt(no);
            a++;
            if(a<10)
                no="00"+a;
            else if(a<100)
                no="0"+a;
            else
                no=a+"";
            txtlblno.setText(no);
  
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
        return no;       
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
        }else if(me.getSource()==btnreset)
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
class onlyNumbersnDot extends KeyAdapter
{
    public void keyTyped(KeyEvent e) 
    {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || c =='.')) 
        {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }
}