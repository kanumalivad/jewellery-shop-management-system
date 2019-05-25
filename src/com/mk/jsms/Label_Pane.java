package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Label_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alllblop = new javax.swing.JLabel();
        addlblop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        alllblop.setBackground(new java.awt.Color(245, 245, 245));
        alllblop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        alllblop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alllblop.setText("All Labels");
        alllblop.setOpaque(true);

        addlblop.setBackground(new java.awt.Color(245, 245, 245));
        addlblop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        addlblop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addlblop.setText("Add Label");
        addlblop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(alllblop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(addlblop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alllblop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addlblop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addlblop;
    private javax.swing.JLabel alllblop;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Label_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe = frm;
        setBounds(0, 180, 230, 420);  
        
        alllblop.addMouseListener(this);
        addlblop.addMouseListener(this);
     
        
    }
    public void uncheck()
    {
        alllblop.setBackground(new Color(245,245,245));
        alllblop.setForeground(Color.BLACK);
        addlblop.setBackground(new Color(245,245,245));
        addlblop.setForeground(Color.BLACK);
    }
    public void Off()
    {
        alllblop.setBackground(new Color(245,245,245));
        alllblop.setForeground(Color.BLACK);
        addlblop.setBackground(new Color(245,245,245));
        addlblop.setForeground(Color.BLACK);
        
        mainframe.dsplblpen.setVisible(false);
        mainframe.addlblpen.setVisible(false);
        addlblop.setText("Add Label");
        
        
    }
    public void changeEdittoAdd()
    {
        addlblop.setText("Add Label");
    }
    public void clickEditMenu()
    {
        Off();
        addlblop.setBackground(Color.WHITE);
        addlblop.setForeground(new Color(254,137,0));  
        addlblop.setText("Edit Label");
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==alllblop)
        {
            alllblop.setBackground(Color.WHITE);
            alllblop.setForeground(new Color(254,137,0));
            mainframe.dsplblpen.displayData();
            mainframe.dsplblpen.setVisible(true);
        }
        else if(me.getSource()==addlblop)
        {
            addlblop.setBackground(Color.WHITE);
            addlblop.setForeground(new Color(254,137,0));
            mainframe.addlblpen.setVisible(true);
            mainframe.addlblpen.clearAll();
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
