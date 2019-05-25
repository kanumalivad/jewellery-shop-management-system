package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentEvent;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
public class Search_Customers_Pane extends javax.swing.JPanel implements ActionListener,DocumentListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable()
        {
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column)
            {
                Component c=super.prepareRenderer(renderer, row, column);

                int modelrow=convertRowIndexToModel(row);
                if(isRowSelected(modelrow))
                c.setBackground(new Color(163,184,204));
                else
                c.setBackground(row%2==0?new Color(238,238,238):Color.WHITE);
                return c;
            }
        }
        ;
        txtsearchname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsearchcity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsearchid = new javax.swing.JTextField();
        txtsearchmn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Name");

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Name", "City", "Mobile No ", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        data.setAutoscrolls(false);
        data.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(data);
        if (data.getColumnModel().getColumnCount() > 0) {
            data.getColumnModel().getColumn(0).setResizable(false);
            data.getColumnModel().getColumn(0).setPreferredWidth(100);
            data.getColumnModel().getColumn(1).setResizable(false);
            data.getColumnModel().getColumn(1).setPreferredWidth(305);
            data.getColumnModel().getColumn(2).setResizable(false);
            data.getColumnModel().getColumn(2).setPreferredWidth(160);
            data.getColumnModel().getColumn(3).setResizable(false);
            data.getColumnModel().getColumn(3).setPreferredWidth(160);
            data.getColumnModel().getColumn(4).setResizable(false);
            data.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        txtsearchname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("CIty");

        txtsearchcity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("ID");

        txtsearchid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtsearchmn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel6.setText("Mobile No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsearchcity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearchmn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsearchcity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearchmn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsearchcity;
    private javax.swing.JTextField txtsearchid;
    private javax.swing.JTextField txtsearchmn;
    private javax.swing.JTextField txtsearchname;
    // End of variables declaration//GEN-END:variables
   
    DefaultTableModel dtm;
    JPopupMenu pmenu;
    JMenuItem edit;
    JMenuItem delete;
    MDI_Frame mainframe;
    public Search_Customers_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 865, 420);
        setVisible(false);
        
        
        dtm=(DefaultTableModel)data.getModel();
        
        
        pmenu=new JPopupMenu();
       
        edit=new JMenuItem("Edit");
        delete=new JMenuItem("Delete"); 
        pmenu.setBackground(Color.WHITE);
        pmenu.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        edit.setBackground(Color.WHITE);
        delete.setBackground(Color.WHITE);
        pmenu.add(edit);
        pmenu.add(delete);
        edit.addActionListener(this);
        delete.addActionListener(this);
       
        data.setComponentPopupMenu(pmenu);
        data.addMouseListener(new MouseListenerForJTable(data));
        txtsearchname.getDocument().addDocumentListener(this);
        txtsearchid.getDocument().addDocumentListener(this);
        txtsearchcity.getDocument().addDocumentListener(this);
        txtsearchmn.getDocument().addDocumentListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        txtsearchname.addFocusListener(f);
        txtsearchid.addFocusListener(f);
        txtsearchcity.addFocusListener(f);
        txtsearchmn.addFocusListener(f);
    }
    public void clearAll()
    {
        txtsearchname.setText("");
        txtsearchid.setText("");
        txtsearchcity.setText("");
        txtsearchmn.setText("");
        dtm.getDataVector().removeAllElements();
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();  
        else if(txtsearchid.isFocusOwner())
            displaySearchDatabyID();
        else if(txtsearchcity.isFocusOwner())
            displaySearchDatabyCity();
        else if(txtsearchmn.isFocusOwner())
            displaySearchDatabyMobileNo();
        
    }
    public void removeUpdate(DocumentEvent e)
    {
        if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();
        else if(txtsearchid.isFocusOwner())
            displaySearchDatabyID();
        else if(txtsearchcity.isFocusOwner())
            displaySearchDatabyCity();
        else if(txtsearchmn.isFocusOwner())
            displaySearchDatabyMobileNo();
    }
    public void displaySearchDatabyName()
    {           
       
        txtsearchid.setText("");
        txtsearchcity.setText("");
        txtsearchmn.setText("");
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchname.getText();
                ResultSet rs=st.executeQuery("select * from Customers_Details where Name like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    Long no=rs.getLong(4);
                    rowData.addElement(no+"");
                    rowData.addElement(rs.getString(5));       
                    dtm.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(txtsearchname.getText().equals(""))
            dtm.getDataVector().removeAllElements();
    }
    public void displaySearchDatabyID()
    {
        txtsearchname.setText("");
        
        txtsearchcity.setText("");
        txtsearchmn.setText("");
        
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchid.getText();
                
                ResultSet rs=st.executeQuery("select * from Customers_Details where Customer_id like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    Long no=rs.getLong(4);
                    rowData.addElement(no+"");
                    rowData.addElement(rs.getString(5));       
                    dtm.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(txtsearchid.getText().equals(""))
            dtm.getDataVector().removeAllElements();
    }
    public void displaySearchDatabyCity()
    {
        txtsearchname.setText("");
        txtsearchid.setText("");
        
        txtsearchmn.setText("");   
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchcity.getText();
                ResultSet rs=st.executeQuery("select * from Customers_Details where City like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    Long no=rs.getLong(4);
                    rowData.addElement(no+"");
                    rowData.addElement(rs.getString(5));       
                    dtm.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(txtsearchcity.getText().equals(""))
            dtm.getDataVector().removeAllElements();
    }
    public void displaySearchDatabyMobileNo()
    {
        txtsearchname.setText("");
        txtsearchid.setText("");
        txtsearchcity.setText("");
           
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchmn.getText();
                ResultSet rs=st.executeQuery("select * from Customers_Details where Mobile_no like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    Long no=rs.getLong(4);
                    rowData.addElement(no+"");
                    rowData.addElement(rs.getString(5));       
                    dtm.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(txtsearchmn.getText().equals(""))
            dtm.getDataVector().removeAllElements();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==edit)
        {
            int row=data.getSelectedRow();
            String cid=data.getModel().getValueAt(row,0).toString();
            this.setVisible(false);          
            
            
            mainframe.addcustpen.loadData(cid);
            mainframe.checkCustomerIcon();
            mainframe.customerpen.clickEditMenu();
            mainframe.addcustpen.setVisible(true);
            
            
        }    
        else if(ae.getSource()==delete)
        {
            int row=data.getSelectedRow();
            String cid=data.getModel().getValueAt(row,0).toString();
            
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                
                MessageBox msg=new MessageBox(mainframe,true);
                msg.addTwoButton("Yes","No");
                msg.setMessage("Do you want to delete...",0);
                msg.setVisible(true);               
                if(msg.getClickedButton().equals("Yes"))
                {
                    st.execute("delete from Customers_Details where Customer_id='"+cid+"'");
                    con.commit();
                    Thread.sleep(500);    
                }
                displayData();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
   
    public void displayData()
    {
        dtm.getDataVector().removeAllElements();
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Customers_Details");    

            while(rs.next())
            {
                Vector<String> rowData=new Vector<String>();
                rowData.addElement(rs.getString(1));
                rowData.addElement(rs.getString(2));
                rowData.addElement(rs.getString(3));
                Long no=rs.getLong(4);
                rowData.addElement(no+"");
                rowData.addElement(rs.getString(5));       
                dtm.addRow(rowData);              
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
