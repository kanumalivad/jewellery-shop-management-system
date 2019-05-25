package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Search_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        srhcustop = new javax.swing.JLabel();
        srhproductop = new javax.swing.JLabel();
        srhorderop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        srhcustop.setBackground(new java.awt.Color(245, 245, 245));
        srhcustop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        srhcustop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        srhcustop.setText("Customer");
        srhcustop.setOpaque(true);

        srhproductop.setBackground(new java.awt.Color(245, 245, 245));
        srhproductop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        srhproductop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        srhproductop.setText("Product");
        srhproductop.setOpaque(true);

        srhorderop.setBackground(new java.awt.Color(245, 245, 245));
        srhorderop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        srhorderop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        srhorderop.setText("Order");
        srhorderop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srhcustop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(srhproductop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(srhorderop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(srhcustop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srhproductop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srhorderop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel srhcustop;
    private javax.swing.JLabel srhorderop;
    private javax.swing.JLabel srhproductop;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Search_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        setBounds(0, 180, 230,420);  
        
        srhcustop.addMouseListener(this);
        srhproductop.addMouseListener(this);
        srhorderop.addMouseListener(this);
        
        
    }
     public void uncheck()
    {
        srhcustop.setBackground(new Color(245,245,245));
        srhcustop.setForeground(Color.BLACK);
        srhproductop.setBackground(new Color(245,245,245));
        srhproductop.setForeground(Color.BLACK);
        srhorderop.setBackground(new Color(245,245,245));
        srhorderop.setForeground(Color.BLACK);
    }
    public void Off()
    {
        srhcustop.setBackground(new Color(245,245,245));
        srhcustop.setForeground(Color.BLACK);
        srhproductop.setBackground(new Color(245,245,245));
        srhproductop.setForeground(Color.BLACK);
        srhorderop.setBackground(new Color(245,245,245));
        srhorderop.setForeground(Color.BLACK);
        
        mainframe.srhcustpen.setVisible(false);
        mainframe.srhcustpen.clearAll();
        mainframe.srhproductpen.setVisible(false);
        mainframe.srhproductpen.clearAll();
        mainframe.srhorderpen.setVisible(false);
        mainframe.srhorderpen.clearAll();
       
        
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==srhcustop)
        {
            srhcustop.setBackground(Color.WHITE);
            srhcustop.setForeground(new Color(254,137,0));
            mainframe.srhcustpen.setVisible(true);
            
        }
        else if(me.getSource()==srhproductop)
        {
            srhproductop.setBackground(Color.WHITE);
            srhproductop.setForeground(new Color(254,137,0));
            mainframe.srhproductpen.setVisible(true);
        }
         else if(me.getSource()==srhorderop)
        {
            srhorderop.setBackground(Color.WHITE);
            srhorderop.setForeground(new Color(254,137,0));
            mainframe.srhorderpen.setVisible(true);
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
