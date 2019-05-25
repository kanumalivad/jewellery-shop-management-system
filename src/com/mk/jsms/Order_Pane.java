package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Order_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderlistop = new javax.swing.JLabel();
        addorderop = new javax.swing.JLabel();
        incomoop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        orderlistop.setBackground(new java.awt.Color(245, 245, 245));
        orderlistop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        orderlistop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderlistop.setText("Order List");
        orderlistop.setOpaque(true);

        addorderop.setBackground(new java.awt.Color(245, 245, 245));
        addorderop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        addorderop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addorderop.setText("Add Order");
        addorderop.setOpaque(true);

        incomoop.setBackground(new java.awt.Color(245, 245, 245));
        incomoop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        incomoop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incomoop.setText("Incomplete Orders");
        incomoop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderlistop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(addorderop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(incomoop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderlistop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addorderop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incomoop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addorderop;
    private javax.swing.JLabel incomoop;
    private javax.swing.JLabel orderlistop;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Order_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        setBounds(0, 180, 230, 420);  
        
        orderlistop.addMouseListener(this);
        addorderop.addMouseListener(this);
        incomoop.addMouseListener(this);   
    }
    public void uncheck()
    {
        orderlistop.setBackground(new Color(245,245,245));
        orderlistop.setForeground(Color.BLACK);
        addorderop.setBackground(new Color(245,245,245));
        addorderop.setForeground(Color.BLACK);
        incomoop.setBackground(new Color(245,245,245));
        incomoop.setForeground(Color.BLACK);
        
    }
    public void clickEditMenu()
    {
        Off();
        addorderop.setBackground(Color.WHITE);
        addorderop.setForeground(new Color(254,137,0));  
        addorderop.setText("Edit Order");
    }
    public void Off()
    {
        orderlistop.setBackground(new Color(245,245,245));
        orderlistop.setForeground(Color.BLACK);
        addorderop.setBackground(new Color(245,245,245));
        addorderop.setForeground(Color.BLACK);
        incomoop.setBackground(new Color(245,245,245));
        incomoop.setForeground(Color.BLACK);
        
        mainframe.dspopen.setVisible(false);
        mainframe.adopen.setVisible(false);
        mainframe.dspicomopen.setVisible(false);
        addorderop.setText("Add Order");
        
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==orderlistop)
        {
            orderlistop.setBackground(Color.WHITE);
            orderlistop.setForeground(new Color(254,137,0));
            mainframe.dspopen.displayData();
            mainframe.dspopen.setVisible(true);
            
            
        }
        else if(me.getSource()==addorderop)
        {
            addorderop.setBackground(Color.WHITE);
            addorderop.setForeground(new Color(254,137,0));
            mainframe.adopen.setVisible(true);
            mainframe.adopen.clearAll();
           
        }
         else if(me.getSource()==incomoop)
        {
            incomoop.setBackground(Color.WHITE);
            incomoop.setForeground(new Color(254,137,0));
            mainframe.dspicomopen.displayData();
            mainframe.dspicomopen.setVisible(true);
            
        }
        
        
    }
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
    }
    public void mouseReleased(MouseEvent me)
    {}
}
