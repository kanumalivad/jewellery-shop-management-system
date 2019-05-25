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
import java.awt.*;
import javax.swing.table.*;
public class Display_Customers_Pane extends javax.swing.JPanel implements ActionListener,DocumentListener
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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Search #Name");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsearchname;
    // End of variables declaration//GEN-END:variables
   
    DefaultTableModel dtm;
    JPopupMenu pmenu;
    JMenuItem edit;
    JMenuItem delete;
    MDI_Frame mainframe;
    public Display_Customers_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 865, 420);
        setVisible(false);
        
        
        dtm=(DefaultTableModel)data.getModel();
        displayData();
        
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
        data.setSelectionBackground(Color.GREEN);
        txtsearchname.getDocument().addDocumentListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        txtsearchname.addFocusListener(f);
        
        
         
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        displaySearchDatabyName();     
    }
    public void removeUpdate(DocumentEvent e)
    {
         displaySearchDatabyName();
    }
    public void displaySearchDatabyName()
    {
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
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==edit)
        {
            int row=data.getSelectedRow();
            String cid=data.getModel().getValueAt(row,0).toString();
            this.setVisible(false);          
            mainframe.customerpen.clickEditMenu();
            mainframe.addcustpen.setVisible(true);
            mainframe.addcustpen.loadData(cid);
            
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
