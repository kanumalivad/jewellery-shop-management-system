package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class Search_Order_Pane extends javax.swing.JPanel implements DocumentListener,ActionListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtsearchid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_ID", "Customer_Name", "Item_Name", "Expected_weight", "Price", "Issue_Date", "Delievery_Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            data.getColumnModel().getColumn(1).setResizable(false);
            data.getColumnModel().getColumn(1).setPreferredWidth(190);
            data.getColumnModel().getColumn(2).setResizable(false);
            data.getColumnModel().getColumn(2).setPreferredWidth(153);
            data.getColumnModel().getColumn(3).setResizable(false);
            data.getColumnModel().getColumn(3).setPreferredWidth(100);
            data.getColumnModel().getColumn(4).setResizable(false);
            data.getColumnModel().getColumn(4).setPreferredWidth(60);
            data.getColumnModel().getColumn(5).setResizable(false);
            data.getColumnModel().getColumn(6).setResizable(false);
            data.getColumnModel().getColumn(6).setPreferredWidth(100);
            data.getColumnModel().getColumn(7).setResizable(false);
        }

        txtsearchname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Search  #Customer_Name");
        jLabel4.setToolTipText("");

        txtsearchid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("Search  #Order_ID");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsearchid;
    private javax.swing.JTextField txtsearchname;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel dtm;
    JPopupMenu pmenu;
    JMenuItem edit;
    JMenuItem delete;
    MDI_Frame mainframe;
    public Search_Order_Pane(MDI_Frame frm) 
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
        
        FocusForTextbox f=new FocusForTextbox();
        txtsearchname.addFocusListener(f);
        txtsearchid.addFocusListener(f);
       
    }
    public void clearAll()
    {
        txtsearchname.setText("");
        txtsearchid.setText("");
        dtm.getDataVector().removeAllElements();
    }
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==edit)
        {
            int row=data.getSelectedRow();
            String cid=data.getModel().getValueAt(row,0).toString();
            this.setVisible(false);          
            mainframe.orderpen.clickEditMenu();           
            mainframe.adopen.loadData(cid);
            mainframe.adopen.setVisible(true);           
        }    
        else if(ae.getSource()==delete)
        {
            int row=data.getSelectedRow();
            String oid=data.getModel().getValueAt(row,0).toString();
            
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
                    st.execute("delete from Orders where Order_id='"+oid+"'");
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
            ResultSet rs=st.executeQuery("select * from Orders");    
           
            while(rs.next())
            {
                Vector<String> rowData=new Vector<String>();
                
                rowData.addElement(rs.getString(1));
                rowData.addElement(rs.getString(2));
                rowData.addElement(rs.getString(3));
                rowData.addElement(rs.getString(4));
                rowData.addElement(rs.getString(5));    
                rowData.addElement(rs.getString(6));
                rowData.addElement(rs.getString(7));
                rowData.addElement(rs.getString(8));
                dtm.addRow(rowData);              
            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();  
        else if(txtsearchid.isFocusOwner())
            displaySearchDatabyID();     
    }
    public void removeUpdate(DocumentEvent e)
    {
         if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();  
        else if(txtsearchid.isFocusOwner())
            displaySearchDatabyID();
    }
    public void displaySearchDatabyName()
    {
        txtsearchid.setText("");    
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchname.getText();
                ResultSet rs=st.executeQuery("select * from Orders where Customer_name like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    rowData.addElement(rs.getString(4));
                    rowData.addElement(rs.getString(5));    
                    rowData.addElement(rs.getString(6));
                    rowData.addElement(rs.getString(7));
                    rowData.addElement(rs.getString(8));
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
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchname.getText();
                ResultSet rs=st.executeQuery("select * from Orders where Order_id like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    rowData.addElement(rs.getString(4));
                    rowData.addElement(rs.getString(5));    
                    rowData.addElement(rs.getString(6));
                    rowData.addElement(rs.getString(7));
                    rowData.addElement(rs.getString(8));
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
}
