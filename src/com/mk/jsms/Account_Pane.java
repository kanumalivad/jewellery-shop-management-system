package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Account_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dspop.setBackground(new java.awt.Color(245, 245, 245));
        dspop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        dspop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dspop.setText("View");
        dspop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dspop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dspop;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Account_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe = frm;
        setBounds(0, 180, 230, 420);         
        dspop.addMouseListener(this);
 
        
    }
    public void uncheck()
    {
        dspop.setBackground(new Color(245,245,245));
        dspop.setForeground(Color.BLACK);
        
    }
    public void Off()
    {
        dspop.setBackground(new Color(245,245,245));
        dspop.setForeground(Color.BLACK);
       
        
        mainframe.dspaccpen.setVisible(false);
        mainframe.addcustpen.setVisible(false);
   
        
        
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==dspop)
        {
            dspop.setBackground(Color.WHITE);
            dspop.setForeground(new Color(254,137,0));
            mainframe.dspaccpen.displayData();
            mainframe.dspaccpen.setVisible(true);
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
