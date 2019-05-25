package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Stock_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        product = new javax.swing.JLabel();
        addproduct = new javax.swing.JLabel();
        editproduct = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        product.setBackground(new java.awt.Color(245, 245, 245));
        product.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product.setText("Products");
        product.setOpaque(true);

        addproduct.setBackground(new java.awt.Color(245, 245, 245));
        addproduct.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        addproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addproduct.setText("Add Product");
        addproduct.setOpaque(true);

        editproduct.setBackground(new java.awt.Color(245, 245, 245));
        editproduct.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        editproduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editproduct.setText("Edit Product");
        editproduct.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(editproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addproduct;
    private javax.swing.JLabel editproduct;
    private javax.swing.JLabel product;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    Stock_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;
        setBounds(0, 180, 230, 420);
        
        product.addMouseListener(this);
        addproduct.addMouseListener(this);
        editproduct.addMouseListener(this);
    }  
    public void clickEditMenu()
    {
        Off();
        editproduct.setBackground(Color.WHITE);
        editproduct.setForeground(new Color(254,137,0));   
    }
    public void uncheck()
    {
        product.setBackground(new Color(245,245,245));
        product.setForeground(Color.BLACK);
        addproduct.setBackground(new Color(245,245,245));
        addproduct.setForeground(Color.BLACK);
        editproduct.setBackground(new Color(245,245,245));
        editproduct.setForeground(Color.BLACK);
    }
    public void Off()
    {
        product.setBackground(new Color(245,245,245));
        product.setForeground(Color.BLACK);
        addproduct.setBackground(new Color(245,245,245));
        addproduct.setForeground(Color.BLACK);
        editproduct.setBackground(new Color(245,245,245));
        editproduct.setForeground(Color.BLACK);
        mainframe.dsppen.setVisible(false);
        mainframe.adppen.setVisible(false);
        mainframe.edtppen.setVisible(false);
        mainframe.edtppen.disableAll();
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==product)
        {
            product.setBackground(Color.WHITE);
            product.setForeground(new Color(254,137,0));
            mainframe.dsppen.displayData();
            mainframe.dsppen.setVisible(true);
        }
        else if(me.getSource()==addproduct)
        {
            addproduct.setBackground(Color.WHITE);
            addproduct.setForeground(new Color(254,137,0));
            mainframe.adppen.clearAll();
            mainframe.adppen.addLabel();
            mainframe.adppen.setVisible(true);                     
        }
        else if(me.getSource()==editproduct)
        {
            editproduct.setBackground(Color.WHITE);
            editproduct.setForeground(new Color(254,137,0));
            mainframe.edtppen.setVisible(true);
            mainframe.edtppen.clearAll();       
        }
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
