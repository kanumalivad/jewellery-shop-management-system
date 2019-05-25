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
public class Edit_Product_Pane extends javax.swing.JPanel implements MouseListener, ActionListener,DocumentListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
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
        lblerr2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Label");

        btnupdate.setBackground(new java.awt.Color(254, 137, 0));
        btnupdate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnupdate.setContentAreaFilled(false);
        btnupdate.setEnabled(false);
        btnupdate.setOpaque(true);

        txtdesc.setColumns(20);
        txtdesc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtdesc.setLineWrap(true);
        txtdesc.setRows(5);
        txtdesc.setAutoscrolls(false);
        txtdesc.setMinimumSize(new java.awt.Dimension(104, 50));
        txtdesc.setNextFocusableComponent(btnupdate);
        jScrollPane1.setViewportView(txtdesc);

        btnreset.setBackground(new java.awt.Color(254, 137, 0));
        btnreset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnreset.setContentAreaFilled(false);
        btnreset.setOpaque(true);

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
        txtlbl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RJD", "KDL", "CHN", "MST", "PND", "RNG", "BST", "ERG", "OMK", "NTH", "NCK" }));
        txtlbl.setBorder(null);
        txtlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtlbl.setNextFocusableComponent(txttype);
        txtlbl.setOpaque(false);

        txttype.setEditable(true);
        txttype.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold Rajwadi Set", "Gold Copper Kadali", "Gold Nakor Kadali", "Gold Mangalsutra", "Gold Ladies Chain", "Gold Gents Chain", "Gold Ladies Ring", "Gold Gents Ring", "Gold Pandle Set", "Gold Gents Braslet", "Gold Ladies Braslet", "Gold Earings", "Gold Nath", "Gold Omakar", "Gold Necklace", "", "" }));
        txttype.setNextFocusableComponent(txtpcs);
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        lblerr2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblerr2.setForeground(new java.awt.Color(0, 153, 51));
        lblerr2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblerr2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)))
                .addContainerGap(188, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtsize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(lblerr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtlblnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlblnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlblnoActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnupdate;
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
    private javax.swing.JLabel lblerr2;
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
    String productID;
    public Edit_Product_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 865, 420);
        setVisible(false);
        btnupdate.addMouseListener(this);
        btnreset.addMouseListener(this);
        btnreset.addMouseListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        jTextField1.addFocusListener(f);
        txtlblno.addFocusListener(f);
        
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
        txtpcs.addKeyListener(keylistener);
        txtsize.addKeyListener(keylistener);
        txtgrweight.addKeyListener(keylistener);
        txtdiff.addKeyListener(keylistener);
        txtnetweight.addKeyListener(keylistener);
  
        
        txtlbl.addActionListener(this);
        txtdate.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        btnupdate.addActionListener(this);
        btnreset.addActionListener(this);  
        disableAll();
    }
    
    public void enableAll()
    {
        txtlbl.setEnabled(true);
        txttype.setEnabled(true);
        txtpcs.setEnabled(true);
        txtsize.setEnabled(true);
        txtdate.setEnabled(true);
        txtgrweight.setEnabled(true);
        txtdiff.setEnabled(true);
        txtnetweight.setEnabled(true);
        txtdesc.setEnabled(true);
        btnreset.setEnabled(true);
    }
    public void disableAll()
    {
        txtlbl.setEnabled(false);
        txttype.setEnabled(false);
        txtpcs.setEnabled(false);
        txtsize.setEnabled(false);
        txtdate.setEnabled(false);
        txtgrweight.setEnabled(false);
        txtdiff.setEnabled(false);
        txtnetweight.setEnabled(false);
        txtdesc.setEnabled(false);
        btnreset.setEnabled(false);
    }
    
    public void loadData(String productID)
    {
        clearAll();
        this.productID=productID;
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Products where Label='"+productID+"'");    
            
            rs.next();
            
            String lbl=productID.substring(0,3);
            txtlbl.removeAllItems();
            txtlbl.addItem(lbl);         
            
            String type=rs.getString(3);
            getItems(lbl);
            for(int i=0;i<txttype.getItemCount();i++)
            { 
                if(txttype.getItemAt(i).equals(type))
                {
                    txttype.setSelectedIndex(i);
                }
            }
            txtpcs.setText(rs.getString(4));
            txtsize.setText(rs.getString(5));
            txtgrweight.setText(rs.getString(6));
            txtdiff.setText(rs.getString(7));
            txtnetweight.setText(rs.getString(8));
            txtdesc.setText(rs.getString(9));
            
            
            txtlblno.setText(productID.substring(3,6));           
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
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
    public void CheckNotNull()
    {
        
        if(!txtlblno.getText().equals("") &&!txtpcs.getText().equals("") && !txtsize.getText().equals("") && !txtgrweight.getText().equals("") && !txtdiff.getText().equals("") && !txtnetweight.getText().equals("") && !txtdesc.getText().equals(""))
        {         
            btnupdate.setEnabled(true);          
        }
        else 
        {
            btnupdate.setEnabled(false);
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
    public void actionPerformed(ActionEvent ae)
    { 
        
        try
        {         
            if(ae.getSource()==btnreset)
            {
                clearAll();
            }   
            else if(ae.getSource()==btnupdate)
            {
                try
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
                    PreparedStatement st = con.prepareStatement("update Products set Label=?,Type=?,Pieces=?,Size=?,Gr_weight=?,Difference=?,Net_weight=?,Description=?,dt=? where Label='"+productID+"'");
                    
                    st.setString(1,label);
                    st.setString(2,type);
                    st.setInt(3,pcs);
                    st.setDouble(4,size);
                    st.setDouble(5,grweight);
                    st.setDouble(6,diff);
                    st.setDouble(7,netweight);
                    st.setString(8,desc);
                    st.setString(9,strDate);
                
                    st.execute();
                    
                    MessageBox msg=new MessageBox(mainframe,true);
                    msg.addOneButton("OK");
                    msg.setMessage("Product updated...",2);
                    msg.setVisible(true);
                    
                    clearAll();
                   
                    
                    disableAll();
                }
                catch(Exception e )
                {
                    System.out.println(e);
                }
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
        lblerr2.setText("");
    }
    
    public void mouseClicked(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==btnupdate)
        {
            btnupdate.setContentAreaFilled(true);
            btnupdate.setForeground(new Color(255,152,0)); 
            btnupdate.setContentAreaFilled(false);        
        }else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(new Color(255,152,0)); 
            btnreset.setContentAreaFilled(false);        
        }
        if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(new Color(255,152,0)); 
            btnreset.setContentAreaFilled(false);        
        }
    }
  
    public void mouseReleased(MouseEvent me)
    {
        if(me.getSource()==btnupdate)
        {
            btnupdate.setContentAreaFilled(true);
            btnupdate.setForeground(Color.white);   
            btnupdate.setBackground(new Color(254,137,0));
        }
        else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(Color.white);   
            btnreset.setBackground(new Color(254,137,0));
        }
        else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(Color.white);   
            btnreset.setBackground(new Color(254,137,0));
        }
 
    }
}