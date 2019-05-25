package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Help_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abtop = new javax.swing.JLabel();
        contactmeop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        abtop.setBackground(new java.awt.Color(245, 245, 245));
        abtop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        abtop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        abtop.setText("About");
        abtop.setOpaque(true);

        contactmeop.setBackground(new java.awt.Color(245, 245, 245));
        contactmeop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        contactmeop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactmeop.setText("Contact me");
        contactmeop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abtop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(contactmeop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abtop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactmeop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abtop;
    private javax.swing.JLabel contactmeop;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Help_Pane(MDI_Frame frm) 
    {
        initComponents();
        this.mainframe=frm;
        setBounds(0, 180, 230, 420);  
        
        abtop.addMouseListener(this);
        contactmeop.addMouseListener(this);     
    }
    public void uncheck()
    {
        abtop.setBackground(new Color(245,245,245));
        abtop.setForeground(Color.BLACK);
        contactmeop.setBackground(new Color(245,245,245));
        contactmeop.setForeground(Color.BLACK);
    }
    public void Off()
    {
        abtop.setBackground(new Color(245,245,245));
        abtop.setForeground(Color.BLACK);
        contactmeop.setBackground(new Color(245,245,245));
        contactmeop.setForeground(Color.BLACK);
        
        mainframe.abtpen.setVisible(false);
        mainframe.contactpen.setVisible(false);
        
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==abtop)
        {
            abtop.setBackground(Color.WHITE);
            abtop.setForeground(new Color(254,137,0));
            mainframe.abtpen.setVisible(true);
        }
        else if(me.getSource()==contactmeop)
        {
            contactmeop.setBackground(Color.WHITE);
            contactmeop.setForeground(new Color(254,137,0));
            mainframe.contactpen.setVisible(true);
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
