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
public class Search_Products_Pane extends javax.swing.JPanel implements ActionListener,DocumentListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtsearchname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsearchlabel = new javax.swing.JTextField();
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

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel3.setText("Item_Name");

        txtsearchname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("Label");

        txtsearchlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Label", "Item_Name", "Pieces", "Size", "Gr_weight", "Difference", "Net_weight", "Description", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
            data.getColumnModel().getColumn(0).setPreferredWidth(70);
            data.getColumnModel().getColumn(1).setPreferredWidth(190);
            data.getColumnModel().getColumn(2).setPreferredWidth(60);
            data.getColumnModel().getColumn(3).setPreferredWidth(60);
            data.getColumnModel().getColumn(4).setPreferredWidth(70);
            data.getColumnModel().getColumn(5).setPreferredWidth(70);
            data.getColumnModel().getColumn(6).setPreferredWidth(70);
            data.getColumnModel().getColumn(7).setPreferredWidth(147);
            data.getColumnModel().getColumn(8).setPreferredWidth(90);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(txtsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable data;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsearchlabel;
    private javax.swing.JTextField txtsearchname;
    // End of variables declaration//GEN-END:variables
   
    DefaultTableModel dtm;
    JPopupMenu pmenu;
    JMenuItem edit;
    JMenuItem delete;
    MDI_Frame mainframe;
    public Search_Products_Pane(MDI_Frame frm) 
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
        txtsearchlabel.getDocument().addDocumentListener(this);
        
        FocusForTextbox f=new FocusForTextbox();
        txtsearchname.addFocusListener(f);
        txtsearchlabel.addFocusListener(f);
        
    }
    public void clearAll()
    {
        txtsearchname.setText("");
        txtsearchlabel.setText("");
        
        dtm.getDataVector().removeAllElements();
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();  
        else if(txtsearchlabel.isFocusOwner())
            displaySearchDatabyID();
        
        
    }
    public void removeUpdate(DocumentEvent e)
    {
        if(txtsearchname.isFocusOwner())
            displaySearchDatabyName();
        else if(txtsearchlabel.isFocusOwner())
            displaySearchDatabyID();
        
    }
    public void displaySearchDatabyName()
    {           
       
        txtsearchlabel.setText("");
        
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchname.getText();
                ResultSet rs=st.executeQuery("select * from Products where Type like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    rowData.addElement(rs.getString(4));
                    rowData.addElement(rs.getString(5));
                    rowData.addElement(rs.getString(6));
                    rowData.addElement(rs.getString(7));
                    rowData.addElement(rs.getString(8));
                    rowData.addElement(rs.getString(9));
                    rowData.addElement(rs.getString(10));
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
                String searchString=txtsearchlabel.getText();
                ResultSet rs=st.executeQuery("select * from Products where Label like '%"+searchString+ "%'" );
                
                dtm.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    rowData.addElement(rs.getString(4));
                    rowData.addElement(rs.getString(5));
                    rowData.addElement(rs.getString(6));
                    rowData.addElement(rs.getString(7));
                    rowData.addElement(rs.getString(8));
                    rowData.addElement(rs.getString(9));
                    rowData.addElement(rs.getString(10));
                    dtm.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(txtsearchlabel.getText().equals(""))
            dtm.getDataVector().removeAllElements();
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==edit)
        {
            int row=data.getSelectedRow();
            String pid=data.getModel().getValueAt(row,0).toString();
            this.setVisible(false);  
            
            mainframe.stockpen.clickEditMenu();
            mainframe.edtppen.loadData(pid);            
            
            
            mainframe.checkProductIcon();
            mainframe.stockpen.clickEditMenu();
            mainframe.edtppen.setVisible(true);
            mainframe.edtppen.enableAll();
        }
        else if(ae.getSource()==delete)
        {
           
            int row=data.getSelectedRow();
            String pid=data.getModel().getValueAt(row,0).toString();
            
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
                    st.execute("delete from Products where Label='"+pid+"'");
                    con.commit();
                    Thread.sleep(500);
                    changeLabelAfterDelete(pid);
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
    public void changeLabelAfterDelete(String pid)
    {
        try
        {
            Connection con=DBConnection.getDBConnection();
            Connection con2=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Products");
            String lbl=pid.substring(0,3);
            String lblno=pid.substring(3,6);
            int no=Integer.parseInt(lblno);
            
            while(rs.next())
            {
                String fulllbl=rs.getString(2);
                if(fulllbl.subSequence(0,3).equals(lbl))
                {
                    int dblblno=Integer.parseInt(fulllbl.substring(3,6));
                    if(dblblno>no)
                    {
                        int n=dblblno;
                        String str,newlbl;
                        n--;
                        if(n<10)
                            str="00"+n;
                        else if(n<100)
                            str="0"+n;
                        else
                        str=n+"";
                        newlbl=lbl+str;
                        PreparedStatement st2 = con2.prepareStatement("update Products set Label=? where Label='"+fulllbl+"'");
                        st2.setString(1, newlbl);
                        st2.execute();
                        con2.commit();
                    }
                    
                    
                }
                
            }    
            
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }
    public void displayData()
    {
        dtm.getDataVector().removeAllElements();
       try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Products");    
            
            while(rs.next())
            {
                Vector<String> rowData=new Vector<String>();
                rowData.addElement(rs.getString(2));
                rowData.addElement(rs.getString(3));
                rowData.addElement(rs.getString(4));
                rowData.addElement(rs.getString(5));
                rowData.addElement(rs.getString(6));
                rowData.addElement(rs.getString(7));
                rowData.addElement(rs.getString(8));
                rowData.addElement(rs.getString(9));
                rowData.addElement(rs.getString(10));
                dtm.addRow(rowData);              
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
