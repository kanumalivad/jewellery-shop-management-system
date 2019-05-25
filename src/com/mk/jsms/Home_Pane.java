package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Home_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pass.setBackground(new java.awt.Color(245, 245, 245));
        pass.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass.setText("Change Password");
        pass.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel pass;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Home_Pane(MDI_Frame frm) 
    {       
        initComponents();
        mainframe=frm;
        setBounds(0, 180, 230, 420);
        pass.addMouseListener(this);
        
    }
    //this methos make unclick effect on the menu
     public void uncheck()
    {
        pass.setBackground(new Color(245,245,245));
        pass.setForeground(Color.BLACK);
    }
    // this method make click effect and open appropriate pane
    public void mouseClicked(MouseEvent me)
    {    
        pass.setBackground(Color.WHITE);
        pass.setForeground(new Color(254,137,0));
        mainframe.chppen.setVisible(true);
        mainframe.chppen.clearAll();
    }
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {}
    public void mouseReleased(MouseEvent me)
    {}
}
