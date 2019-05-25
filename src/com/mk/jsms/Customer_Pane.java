package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Customer_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspop = new javax.swing.JLabel();
        addcustop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dspop.setBackground(new java.awt.Color(245, 245, 245));
        dspop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        dspop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dspop.setText("All Customer");
        dspop.setOpaque(true);

        addcustop.setBackground(new java.awt.Color(245, 245, 245));
        addcustop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        addcustop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addcustop.setText("Add Customer");
        addcustop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(addcustop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dspop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addcustop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addcustop;
    private javax.swing.JLabel dspop;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Customer_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe = frm;
        setBounds(0, 180, 230, 420);  
        
        dspop.addMouseListener(this);
        addcustop.addMouseListener(this);
     
        
    }
    public void uncheck()
    {
        dspop.setBackground(new Color(245,245,245));
        dspop.setForeground(Color.BLACK);
        addcustop.setBackground(new Color(245,245,245));
        addcustop.setForeground(Color.BLACK);
    }
    public void Off()
    {
        dspop.setBackground(new Color(245,245,245));
        dspop.setForeground(Color.BLACK);
        addcustop.setBackground(new Color(245,245,245));
        addcustop.setForeground(Color.BLACK);
        
        mainframe.dspcustpen.setVisible(false);
        mainframe.addcustpen.setVisible(false);
        addcustop.setText("Add Customer");
        
        
    }
    public void changeEdittoAdd()
    {
        addcustop.setText("Add Customer");
    }
    public void clickEditMenu()
    {
        Off();
        addcustop.setBackground(Color.WHITE);
        addcustop.setForeground(new Color(254,137,0));  
        addcustop.setText("Edit Customer");
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==dspop)
        {
            dspop.setBackground(Color.WHITE);
            dspop.setForeground(new Color(254,137,0));
            mainframe.dspcustpen.displayData();
            mainframe.dspcustpen.setVisible(true);
        }
        else if(me.getSource()==addcustop)
        {
            addcustop.setBackground(Color.WHITE);
            addcustop.setForeground(new Color(254,137,0));
            mainframe.addcustpen.setVisible(true);
            mainframe.addcustpen.clearAll();
            mainframe.addcustpen.getLastID();
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
