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
import java.io.File;
import javax.swing.table.*;
public class Display_Account_Pane extends javax.swing.JPanel implements ActionListener,DocumentListener
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
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JComboBox<>();
        btn = new javax.swing.JButton();
        txtcid = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_No", "Customer_ID", "Grand_Total", "Credit ", "Kasar", "Receivable", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            data.getColumnModel().getColumn(0).setPreferredWidth(70);
            data.getColumnModel().getColumn(1).setResizable(false);
            data.getColumnModel().getColumn(1).setPreferredWidth(118);
            data.getColumnModel().getColumn(2).setResizable(false);
            data.getColumnModel().getColumn(2).setPreferredWidth(130);
            data.getColumnModel().getColumn(3).setResizable(false);
            data.getColumnModel().getColumn(3).setPreferredWidth(130);
            data.getColumnModel().getColumn(4).setResizable(false);
            data.getColumnModel().getColumn(4).setPreferredWidth(130);
            data.getColumnModel().getColumn(5).setResizable(false);
            data.getColumnModel().getColumn(5).setPreferredWidth(130);
            data.getColumnModel().getColumn(6).setResizable(false);
            data.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Customer Name");

        txtname.setEditable(true);
        txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        txtcid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtcid;
    private javax.swing.JComboBox<String> txtname;
    // End of variables declaration//GEN-END:variables
   
    DefaultTableModel dtm;
    JPopupMenu pmenu;
    JMenuItem view;
    
    MDI_Frame mainframe;
    public Display_Account_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        this.setBounds(220, 180, 865, 420);
        setVisible(false);
        
        
        dtm=(DefaultTableModel)data.getModel();
        displayData();
        
        pmenu=new JPopupMenu();
       
        view=new JMenuItem("View Bill");
        pmenu.setBackground(Color.WHITE);
        pmenu.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        view.setBackground(Color.WHITE);
        
        pmenu.add(view);
        
        view.addActionListener(this);
        
       
        data.setComponentPopupMenu(pmenu);
        data.addMouseListener(new MouseListenerForJTable(data));
        data.setSelectionBackground(Color.GREEN);
        
        
        FocusForTextbox f=new FocusForTextbox();
        txtname.addActionListener(this);
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
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
            
    }
    public void removeUpdate(DocumentEvent e)
    {
         
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==view)
        {
            int row=data.getSelectedRow();
            String billno=data.getModel().getValueAt(row,0).toString();
            System.out.println(billno);
            if(Desktop.isDesktopSupported())
            {
                try
                {
                    File myFile=new File("Bills\\"+billno+".pdf");
                    Desktop.getDesktop().open(myFile);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            
            
            
        }           
        else if(ae.getSource()==btn)
        {
            autoSuggesion(txtname.getSelectedItem().toString());
            
        }
        else if(ae.getSource()==txtname)
        {
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String text=txtname.getSelectedItem().toString();
                ResultSet rs=st.executeQuery("select * from Customers_Details where Name='"+text+"'" );
           
                if(rs.next())
                {                    
                    txtcid.setText(rs.getString(1)); 
                    displaySearchDatabyID();
                }
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
        long billno;
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select distinct Bill_no  from Customer_Account");

            while(rs.next())
            {
                Vector<String> rowData=new Vector<String>();
                Double b=rs.getDouble(1);                                    
                getBillData(rowData,b);   
                dtm.addRow(rowData);         
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void getBillData(Vector v,Double b)
    {
        try
        {
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Customer_Account");
            
            while(rs.next())
            {
                if(rs.getDouble(2)==b)
                {
                    Long billno=Math.round(b);
                    v.addElement(billno+"");
                    v.addElement(rs.getString(1));
                    v.addElement(rs.getString(8));
                    v.addElement(rs.getString(9));
                    v.addElement(rs.getString(10));
                    v.addElement(rs.getString(11));
                    v.addElement(rs.getString(12));
                    break;
                }
            }
        }
        catch(Exception e)
        {
        
        }
    }
    public void displaySearchDatabyID()
    {
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtcid.getText();
                ResultSet rs=st.executeQuery("select distinct Bill_no from Customer_Account where Customer_id like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    Double b=rs.getDouble(1);                                    
                    getBillData(rowData,b);   
                    dtm.addRow(rowData);                       
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
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
}
