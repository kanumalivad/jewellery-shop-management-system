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

public class Display_Label_Pane extends javax.swing.JPanel implements ActionListener,DocumentListener
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
        txtsearchlabel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsearchname = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Search  #Label ");
        jLabel3.setToolTipText("");

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Label", "Item_Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
            data.getColumnModel().getColumn(0).setPreferredWidth(200);
            data.getColumnModel().getColumn(1).setResizable(false);
            data.getColumnModel().getColumn(1).setPreferredWidth(610);
        }

        txtsearchlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Search  #Name");
        jLabel4.setToolTipText("");

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
                        .addComponent(txtsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
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
                    .addComponent(txtsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsearchlabel;
    private javax.swing.JTextField txtsearchname;
    // End of variables declaration//GEN-END:variables
   
    DefaultTableModel dtm;
    JPopupMenu pmenu;
    JMenuItem edit;
    JMenuItem delete;
    MDI_Frame mainframe;
    public Display_Label_Pane(MDI_Frame frm) 
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
        txtsearchlabel.getDocument().addDocumentListener(this);
        txtsearchname.getDocument().addDocumentListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        txtsearchname.addFocusListener(f);
        txtsearchlabel.addFocusListener(f);
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        if(txtsearchlabel.isFocusOwner())
            displaySearchDatabyLabel();     
        else if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();
    }
    public void removeUpdate(DocumentEvent e)
    {
         displaySearchDatabyLabel();
    }
    public void displaySearchDatabyLabel()
    {
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchlabel.getText();
                ResultSet rs=st.executeQuery("select * from Product_List where Label like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));     
                    dtm.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    public void displaySearchDatabyName()
    {
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchname.getText();
                ResultSet rs=st.executeQuery("select * from Product_List where Item_name like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(1));
                    rowData.addElement(rs.getString(2));     
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
            mainframe.lblpen.clickEditMenu();
            mainframe.addlblpen.setVisible(true);
            mainframe.addlblpen.loadData(cid);
            
        }    
        else if(ae.getSource()==delete)
        {
            int row=data.getSelectedRow();
            String lbl=data.getModel().getValueAt(row,0).toString();
            
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
                    st.execute("delete from Product_List where Label='"+lbl+"'");
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
            ResultSet rs=st.executeQuery("select * from Product_List");    

            while(rs.next())
            {
                Vector<String> rowData=new Vector<String>();
                rowData.addElement(rs.getString(1));
                rowData.addElement(rs.getString(2));                    
                dtm.addRow(rowData);              
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
