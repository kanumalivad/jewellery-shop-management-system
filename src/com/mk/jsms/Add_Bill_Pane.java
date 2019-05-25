package com.mk.jsms;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;
import java.text.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;


import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
public class Add_Bill_Pane extends javax.swing.JPanel implements MouseListener, ActionListener,DocumentListener
{
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtdate = new com.michaelbaranov.microba.calendar.DatePicker();
        txtcity = new javax.swing.JTextField();
        btnreset = new javax.swing.JButton();
        txtname = new javax.swing.JComboBox<>();
        btn = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtbillno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtsearchlabel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        productdata = new javax.swing.JTable();
        txtsearchname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txttax = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtcredit = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtkasar = new javax.swing.JTextField();
        txtgtotal = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnote = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        txtreceive = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTextField8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel14.setText("Name");

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel19.setText("City");

        txtcity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnreset.setBackground(new java.awt.Color(254, 137, 0));
        btnreset.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("Reset");
        btnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btnreset.setContentAreaFilled(false);
        btnreset.setOpaque(true);
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        txtname.setEditable(true);
        txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel21.setText("Bill No");

        txtbillno.setEditable(false);
        txtbillno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtbillno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbillnoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel22.setText("Date");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setText("Label");

        txtsearchlabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        productdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Label", "Item_Name", "Pieces", "Gr_weight", "Difference", "Net_weight"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productdata.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        productdata.setAutoscrolls(false);
        jScrollPane2.setViewportView(productdata);
        if (productdata.getColumnModel().getColumnCount() > 0) {
            productdata.getColumnModel().getColumn(0).setResizable(false);
            productdata.getColumnModel().getColumn(1).setResizable(false);
            productdata.getColumnModel().getColumn(1).setPreferredWidth(115);
            productdata.getColumnModel().getColumn(2).setResizable(false);
            productdata.getColumnModel().getColumn(3).setResizable(false);
            productdata.getColumnModel().getColumn(4).setResizable(false);
        }

        txtsearchname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel5.setText("Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsearchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearchname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Item_Name", "Pieces", "Gr_weight", "Difference", "Net_weight", "Rate", "Labour", "Amount"
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
        list.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        list.setAutoscrolls(false);
        jScrollPane3.setViewportView(list);
        if (list.getColumnModel().getColumnCount() > 0) {
            list.getColumnModel().getColumn(0).setResizable(false);
            list.getColumnModel().getColumn(1).setResizable(false);
            list.getColumnModel().getColumn(2).setResizable(false);
            list.getColumnModel().getColumn(3).setResizable(false);
            list.getColumnModel().getColumn(4).setResizable(false);
            list.getColumnModel().getColumn(5).setResizable(false);
            list.getColumnModel().getColumn(6).setResizable(false);
            list.getColumnModel().getColumn(7).setResizable(false);
            list.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel23.setText("Total");

        txttotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel24.setText("Tax");

        txttax.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel25.setText("G. Total");

        txtcredit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel27.setText("Credit");

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel28.setText("Kasar");

        txtkasar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtgtotal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel29.setText("Note");

        txtnote.setColumns(20);
        txtnote.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtnote.setLineWrap(true);
        txtnote.setRows(5);
        txtnote.setAutoscrolls(false);
        txtnote.setMinimumSize(new java.awt.Dimension(104, 50));
        jScrollPane1.setViewportView(txtnote);

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel30.setText("Receivable");

        txtreceive.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btncreate.setBackground(new java.awt.Color(254, 137, 0));
        btncreate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btncreate.setForeground(new java.awt.Color(255, 255, 255));
        btncreate.setText("Create");
        btncreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 137, 0)));
        btncreate.setContentAreaFilled(false);
        btncreate.setEnabled(false);
        btncreate.setOpaque(true);
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19))
                    .addComponent(jLabel14))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtcity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel21)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbillno, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(785, 785, 785)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txttax)
                                    .addComponent(txttotal)
                                    .addComponent(txtgtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtreceive, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkasar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcredit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel21)
                                    .addComponent(txtbillno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22)))
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtgtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcredit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtkasar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtreceive, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addGap(31, 31, 31))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void txtbillnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbillnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbillnoActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncreateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable list;
    private javax.swing.JTable productdata;
    private javax.swing.JTextField txtbillno;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcredit;
    private com.michaelbaranov.microba.calendar.DatePicker txtdate;
    private javax.swing.JTextField txtgtotal;
    private javax.swing.JTextField txtkasar;
    private javax.swing.JComboBox<String> txtname;
    private javax.swing.JTextArea txtnote;
    private javax.swing.JTextField txtreceive;
    private javax.swing.JTextField txtsearchlabel;
    private javax.swing.JTextField txtsearchname;
    private javax.swing.JTextField txttax;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
    MDI_Frame mainframe;
    String cid;
    DefaultTableModel dtmproduct;
    DefaultTableModel dtmproductlist;
    JPopupMenu pmenu,listmenu;
    JMenuItem add,remove;
    String Customer_ID;
    int no;
    int index;
    
    Vector<String> items;
    Vector<String> pcs;
    Vector<String> gw;
    Vector<String> df;
    Vector<String> nw;
    Vector<String> rt;
    Vector<String> lb;
    Vector<String> tot;
 
    Vector<String> Label;
    public Add_Bill_Pane(MDI_Frame frm) 
    {
        initComponents();
        mainframe=frm;  
       
        this.setBounds(0, 180, 1080, 420);
        setVisible(false);
        
        Label =new Vector<String>();
        items=new Vector<String>();
        pcs=new Vector<String>();
        gw=new Vector<String>();
        df=new Vector<String>();
        nw=new Vector<String>();
        rt=new Vector<String>();
        lb=new Vector<String>();
        tot=new Vector<String>();
        
        index=0;
        pmenu=new JPopupMenu();
        listmenu=new JPopupMenu();
       
        add=new JMenuItem("Add to ProductList");
        remove=new JMenuItem("Remove this");
        
        pmenu.setBackground(Color.WHITE);
        pmenu.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        add.setBackground(Color.WHITE);
        
        listmenu.setBackground(Color.WHITE);
        listmenu.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        listmenu.setBackground(Color.WHITE);
       
        pmenu.add(add);     
        listmenu.add(remove);
        add.addActionListener(this);
        remove.addActionListener(this);
                   
        productdata.setComponentPopupMenu(pmenu);
        list.setComponentPopupMenu(listmenu);
        productdata.addMouseListener(new MouseListenerForJTable(productdata));
        list.addMouseListener(new MouseListenerForJTable(list));
             
        dtmproduct=(DefaultTableModel)productdata.getModel();
        dtmproductlist=(DefaultTableModel)list.getModel();
        
        FocusForTextbox f=new FocusForTextbox();
        jTextField1.addFocusListener(f);
        txtcity.addFocusListener(f);
        txtsearchlabel.addFocusListener(f);
        txtsearchname.addFocusListener(f);
        
        txttotal.addFocusListener(f);
        txttax.addFocusListener(f);
        txtgtotal.addFocusListener(f);
        txtcredit.addFocusListener(f);
        txtkasar.addFocusListener(f);
        txtreceive.addFocusListener(f);       
         
        txtcity.getDocument().addDocumentListener(this);
              
        onlyNumbersnDot keylistener=new onlyNumbersnDot();
        txtkasar.addKeyListener(new KeyAdapter()
        {
             public void keyTyped(KeyEvent e) 
            {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) ) || (c == '.')) 
                {
                    getToolkit().beep();
                    e.consume();
                }               
            }
            public void keyReleased(KeyEvent e)
            {
                
                int gtotal=Integer.parseInt(txtgtotal.getText());
                int  credit;
                if(txtcredit.getText().equals(""))
                    credit=0;
                else
                    credit=Integer.parseInt(txtcredit.getText());
                int kasar;
                if(txtkasar.getText().equals(""))
                   kasar=0;
                else
                    kasar=Integer.parseInt(txtkasar.getText());
                int receive=(gtotal-credit)-kasar;
                txtreceive.setText(receive+"");              
            }
        });
        txtcredit.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e) 
            {
                char c = e.getKeyChar();
                if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) ) || (c == '.')) 
                {
                    getToolkit().beep();
                    e.consume();
                }               
            }
            public void keyReleased(KeyEvent e)
            {
                
                int gtotal=Integer.parseInt(txtgtotal.getText());
                int  credit;
                if(txtcredit.getText().equals(""))
                    credit=0;
                else
                    credit=Integer.parseInt(txtcredit.getText());
                int kasar;
                if(txtkasar.getText().equals(""))
                   kasar=0;
                else
                    kasar=Integer.parseInt(txtkasar.getText());
                int receive=(gtotal-credit)-kasar;
                txtreceive.setText(receive+"");
                
            }
        });
        
        txtkasar.addKeyListener(keylistener);
        
        txtname.getEditor().getEditorComponent().addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent ke)
            {               
                btn.requestFocus();
                txtname.showPopup();
            }
            
        });
        txtname.getEditor().getEditorComponent().addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent fe)
            {   txtname.showPopup();   }
        });
        btn.addActionListener(this);
        txtname.addActionListener(this);
        btn.addFocusListener(new FocusAdapter()
        {
            public void focusGained(FocusEvent e)
            {
                
                btn.doClick();
                txtname.requestFocus();
                txtname.showPopup();
            }           
        });
      
        txtdate.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
        btncreate.addActionListener(this);
        btnreset.addActionListener(this);
        
        txtsearchlabel.getDocument().addDocumentListener(this);
        txtsearchname.getDocument().addDocumentListener(this);
        txtcity.getDocument().addDocumentListener(this);
        txttotal.getDocument().addDocumentListener(this);
        txttax.getDocument().addDocumentListener(this);
        txtgtotal.getDocument().addDocumentListener(this);
        txtcredit.getDocument().addDocumentListener(this);
        txtkasar.getDocument().addDocumentListener(this);
        txtreceive.getDocument().addDocumentListener(this);
        txtnote.getDocument().addDocumentListener(this);
           
        getLastBillno();     
    }
    public void CheckNotNull()
    {       
        if(!txtcity.getText().equals("") && !txttotal.getText().equals("") && !txttax.getText().equals("") && !txtgtotal.getText().equals("") && !txtcredit.getText().equals("") && !txtkasar.getText().equals("") && !txtreceive.getText().equals("") && !txtnote.getText().equals("") && (list.getModel().getRowCount()>0))
        {
            btncreate.setEnabled(true);       
        }
        else 
        {
            btncreate.setEnabled(false);
        }
    }
    public void changedUpdate(DocumentEvent e)
    {}
    public void insertUpdate(DocumentEvent e)
    {
        CheckNotNull();
        if(txtsearchname.getText().equals(""))
           displaySearchDatabyLabel();
        else if(txtsearchlabel.getText().equals(""))
           displaySearchDatabyName();
    }
    public void removeUpdate(DocumentEvent e)
    {
        CheckNotNull();
        if(txtsearchname.getText().equals(""))
           displaySearchDatabyLabel();
        else if(txtsearchlabel.getText().equals(""))
           displaySearchDatabyName();
    }    
    public void mouseClicked(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void mousePressed(MouseEvent me)
    {
        if(me.getSource()==btncreate)
        {
            btncreate.setContentAreaFilled(true);
            btncreate.setForeground(new Color(255,152,0)); 
            btncreate.setContentAreaFilled(false);        
        }else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(new Color(255,152,0)); 
            btnreset.setContentAreaFilled(false);        
        }       
    } 
    public void mouseReleased(MouseEvent me)
    {
        if(me.getSource()==btncreate)
        {
            btncreate.setContentAreaFilled(true);
            btncreate.setForeground(Color.white);   
            btncreate.setBackground(new Color(254,137,0));
        }
        else if(me.getSource()==btnreset)
        {
            btnreset.setContentAreaFilled(true);
            btnreset.setForeground(Color.white);   
            btnreset.setBackground(new Color(254,137,0));
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       
        if(ae.getSource()==btn)
        {
            autoSuggesion(txtname.getSelectedItem().toString());           
        }
        else if(ae.getSource()==txtname)
        {
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String text=txtname.getSelectedItem().toString();
                ResultSet rs=st.executeQuery("select * from Customers_Details where Name='"+text+"'" );
           
                if(rs.next())
                {
                    Customer_ID=rs.getString(1);
                    txtcity.setText(rs.getString(3));                   
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==add)
        {
            int row=productdata.getSelectedRow();
            String lbl=productdata.getModel().getValueAt(row,0).toString();
            addToProductList(lbl);
        }
        else if(ae.getSource()==remove)
        {
            int row=list.getSelectedRow();
            int at=Integer.parseInt(list.getModel().getValueAt(row,0).toString());
            --at;
            Label.removeElementAt(at);
            dtmproductlist.removeRow(row); 
            addNo();
            calculateMoney();
            CheckNotNull();
            
        }
        else if(ae.getSource()==btncreate)
        {
           
            Double billno=Double.parseDouble(txtbillno.getText());
            Double total=Double.parseDouble(txttotal.getText());
            Double tax=Double.parseDouble(txttax.getText());
            Double gtotal=Double.parseDouble(txtgtotal.getText());
            Double credit=Double.parseDouble(txtcredit.getText());
            Double kasar=Double.parseDouble(txtkasar.getText());
            Double receive=Double.parseDouble(txtreceive.getText());
            String note=txtnote.getText();
            
            SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
            String strDate = sm.format(txtdate.getDate());
         
            try
            {
                Connection con=DBConnection.getDBConnection();
                PreparedStatement st = con.prepareStatement("insert into Customer_Account(Customer_id,Bill_no,Label,Rate,Labour,Total,Tax,Grand_total,Credit,Kasar,Receivable,dt,n) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
                st.setString(1,Customer_ID);
                st.setDouble(2,billno);              
                st.setDouble(6,total);
                st.setDouble(7,tax);
                st.setDouble(8,gtotal);
                st.setDouble(9,credit);
                st.setDouble(10,kasar);
                st.setDouble(11,receive);
                st.setString(12,strDate); 
                st.setString(13,note);
                               
                int rowCount=dtmproductlist.getRowCount();
                for(int i=0;i<rowCount;i++)
                {
                    String label=list.getModel().getValueAt(i,1).toString();
                    Double rate=Double.parseDouble(list.getModel().getValueAt(i,6).toString());
                    Double labour=Double.parseDouble(list.getModel().getValueAt(i,7).toString());
                    
                    st.setString(3,Label.get(i));
                    st.setDouble(4,rate);
                    st.setDouble(5,labour);
                    st.execute(); 
                    con.commit();
                }
                this.setVisible(false);
                            
       
                Connection con2=DBConnection.getDBConnection(); 

                String ralPath ="src\\report1.jrxml";
                JasperDesign jasperDesign = JRXmlLoader.load(ralPath);
                JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

                Map parameters = new HashMap();        
                for(int i=0;i<rowCount;i++)
                {
                    parameters.put("no"+(i+1),i+1);
                    parameters.put("Item"+(i+1),items.elementAt(i));
                    parameters.put("pcs"+(i+1),pcs.elementAt(i));
                    parameters.put("gw"+(i+1),gw.elementAt(i));
                    parameters.put("df"+(i+1),df.elementAt(i));
                    parameters.put("nw"+(i+1),nw.elementAt(i));
                    parameters.put("rt"+(i+1),rt.elementAt(i));
                    parameters.put("lb"+(i+1),lb.elementAt(i));
                    parameters.put("tot"+(i+1),tot.elementAt(i));             
                }
                for(int i=rowCount;i<=10;i++)
                {
                    parameters.put("no"+(i+1),"");
                    parameters.put("Item"+(i+1),"");
                    parameters.put("pcs"+(i+1),"");
                    parameters.put("gw"+(i+1),"");
                    parameters.put("df"+(i+1),"");
                    parameters.put("nw"+(i+1),"");
                    parameters.put("rt"+(i+1),"");
                    parameters.put("lb"+(i+1),"");
                    parameters.put("tot"+(i+1),"");
                }
 
                parameters.put("name",txtname.getSelectedItem().toString());
                parameters.put("city",txtcity.getText());
                parameters.put("total",txttotal.getText());
                parameters.put("tax",txttax.getText());
                parameters.put("gtotal",txtgtotal.getText());

                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,con2);
                JasperExportManager.exportReportToPdfFile(jasperPrint, "Bills\\"+txtbillno.getText()+".pdf");
                JasperViewer.viewReport(jasperPrint);          
                }
            catch(Exception e)
            {
                System.out.println(e);
            }     
        }
        else if(ae.getSource()==btnreset)
        {
            clearAll();
        }
    }
    public void clearAll()
    {                            
        getLastBillno();
        txtcity.setText("");
        dtmproductlist.getDataVector().removeAllElements();
        dtmproduct.getDataVector().removeAllElements();
                  
        txttotal.setText("");
        txttax.setText("");
        txtgtotal.setText("");
        txtcredit.setText("");
        txtkasar.setText("");
        txtreceive.setText("");
        txtsearchname.setText("");
        txtsearchlabel.setText("");
        txtnote.setText("");
      
    }
    public void addNo()
    {
        int no=0;
        for(int i=0;i<list.getRowCount();i++)
        {
            list.getModel().setValueAt(++no,i,0);
        }
    }
    public void calculateMoney()
    {
        long Total;
        Total=0;
        for(int i=0;i<dtmproductlist.getRowCount();i++)
        {
            long amount=Long.parseLong(list.getModel().getValueAt(i,8).toString());       
            Total=Total+amount;
            txttotal.setText(Total+"");
            Double tot=Double.parseDouble(txttotal.getText());
            Double t=(tot*1)/100;           
            txttax.setText(t+"");
            Double GTotal=Total+t;
            txtgtotal.setText(Math.round(GTotal)+"");           
         
        }
    }
    public void addToProductList(String lbl)
    {
        try
        {       
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Products where Label='"+lbl+"'");    
            
            rs.next();
            
            Label.addElement(lbl);
            String i=rs.getString(3);
            int p=rs.getInt(4);           
            Double g=rs.getDouble(6);
            Double d=rs.getDouble(7);
            
            items.addElement(i);
            pcs.addElement(p+"");
            gw.addElement(g+"");
            df.addElement(d+"");
           
            no++;
            Add_Bill_Details bd=new Add_Bill_Details(mainframe,true);
            bd.setVisible(true);
            Double rate=bd.getRate();
            Double labour=bd.getLabour();
            
            Double net_weight=rs.getDouble(8);    
            Double amount=(net_weight*rate)+(net_weight*labour);           
            long amt=Math.round(amount);       
            nw.addElement(net_weight+"");
            
            Object[] arr=new Object[]{no+"",i,p,g,d,net_weight,(net_weight*rate),(net_weight*labour),amt+""};
             
            rt.addElement((rate*net_weight)+"");
            lb.addElement((labour*net_weight)+"");
            tot.addElement(amt+"");
            dtmproductlist.addRow(arr);
            calculateMoney();       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
     public void displaySearchDatabyName()
    {
            try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchname.getText();
                ResultSet rs=st.executeQuery("select * from Products where Type like '%"+searchString+ "%'" );
                
                dtmproduct.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    rowData.addElement(rs.getString(4));
                    
                    rowData.addElement(rs.getString(6));
                    rowData.addElement(rs.getString(7));
                    rowData.addElement(rs.getString(8));
                    
                    dtmproduct.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            if(txtsearchname.getText().equals(""))
            dtmproduct.getDataVector().removeAllElements();
    }
    public void displaySearchDatabyLabel()
    {
        try
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
                String searchString=txtsearchlabel.getText();
                ResultSet rs=st.executeQuery("select * from Products where Label like '%"+searchString+ "%'" );
                
                dtmproduct.getDataVector().removeAllElements();
                
                while(rs.next())
                {
                    Vector<String> rowData=new Vector<String>();
                    rowData.addElement(rs.getString(2));
                    rowData.addElement(rs.getString(3));
                    rowData.addElement(rs.getString(4));
                    
                    rowData.addElement(rs.getString(6));
                    rowData.addElement(rs.getString(7));
                    rowData.addElement(rs.getString(8));
                   
                    dtmproduct.addRow(rowData);              
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        if(txtsearchlabel.getText().equals(""))
            dtmproduct.getDataVector().removeAllElements();
    }
    public void getLastBillno()
    {
        try
        {
            Connection con=DBConnection.getDBConnection();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=st.executeQuery("select count(Order_id) from Orders");
            rs.last();
            int no=rs.getInt(1);
            ++no;
            txtbillno.setText(no+"");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public void autoSuggesion(String text)
    {
        try
        {
            if(!text.equals(""))
            {
                Connection con=DBConnection.getDBConnection();
                Statement st=con.createStatement();
    
                
                ResultSet rs=st.executeQuery("select * from Customers_Details where Name like '%"+text+ "%'" );
                
                txtname.removeAllItems();
                
                txtname.addItem(text);
                while(rs.next())
                {
                    txtname.addItem(rs.getString(2));
                }                    
            }
            else 
            {
                txtname.removeAllItems();
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}