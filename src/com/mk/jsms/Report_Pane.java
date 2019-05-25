package com.mk.jsms;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Report_Pane extends javax.swing.JPanel implements MouseListener
{  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saleop = new javax.swing.JLabel();
        stockop = new javax.swing.JLabel();
        customerop = new javax.swing.JLabel();
        balanceop = new javax.swing.JLabel();
        receivableop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        saleop.setBackground(new java.awt.Color(245, 245, 245));
        saleop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        saleop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saleop.setText("Sale Report");
        saleop.setOpaque(true);

        stockop.setBackground(new java.awt.Color(245, 245, 245));
        stockop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        stockop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stockop.setText("Stock Report");
        stockop.setOpaque(true);

        customerop.setBackground(new java.awt.Color(245, 245, 245));
        customerop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        customerop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerop.setText("Customer Report");
        customerop.setOpaque(true);

        balanceop.setBackground(new java.awt.Color(245, 245, 245));
        balanceop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        balanceop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceop.setText("Balance Sheet Report");
        balanceop.setOpaque(true);

        receivableop.setBackground(new java.awt.Color(245, 245, 245));
        receivableop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        receivableop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receivableop.setText("Receivable Cash Report");
        receivableop.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saleop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(stockop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(customerop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(balanceop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(receivableop, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saleop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balanceop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receivableop, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceop;
    private javax.swing.JLabel customerop;
    private javax.swing.JLabel receivableop;
    private javax.swing.JLabel saleop;
    private javax.swing.JLabel stockop;
    // End of variables declaration//GEN-END:variables
    Report_Pane() 
    {
        initComponents();
        setBounds(0, 180, 230, 420);  
        
        saleop.addMouseListener(this);
        stockop.addMouseListener(this);
        customerop.addMouseListener(this);
        balanceop.addMouseListener(this);
        receivableop.addMouseListener(this);
        
    }
     public void uncheck()
    {
        saleop.setBackground(new Color(245,245,245));
        saleop.setForeground(Color.BLACK);
        customerop.setBackground(new Color(245,245,245));
        customerop.setForeground(Color.BLACK);
        balanceop.setBackground(new Color(245,245,245));
        balanceop.setForeground(Color.BLACK);
        receivableop.setBackground(new Color(245,245,245));
        receivableop.setForeground(Color.BLACK);
    }
    public void Off()
    {
        saleop.setBackground(new Color(245,245,245));
        saleop.setForeground(Color.BLACK);
        stockop.setBackground(new Color(245,245,245));
        stockop.setForeground(Color.BLACK);
        customerop.setBackground(new Color(245,245,245));
        customerop.setForeground(Color.BLACK);
        balanceop.setBackground(new Color(245,245,245));
        balanceop.setForeground(Color.BLACK);
        receivableop.setBackground(new Color(245,245,245));
        receivableop.setForeground(Color.BLACK);
    }
    public void mouseClicked(MouseEvent me)
    {    
        Off();
        if(me.getSource()==saleop)
        {
            saleop.setBackground(Color.WHITE);
            saleop.setForeground(new Color(254,137,0));
        }
        else if(me.getSource()==stockop)
        {
            stockop.setBackground(Color.WHITE);
            stockop.setForeground(new Color(254,137,0));
        }
         else if(me.getSource()==customerop)
        {
            customerop.setBackground(Color.WHITE);
            customerop.setForeground(new Color(254,137,0));
        }
        else if(me.getSource()==balanceop)
        {
            balanceop.setBackground(Color.WHITE);
            balanceop.setForeground(new Color(254,137,0));
        }
         else if(me.getSource()==receivableop)
        {
            receivableop.setBackground(Color.WHITE);
            receivableop.setForeground(new Color(254,137,0));
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
