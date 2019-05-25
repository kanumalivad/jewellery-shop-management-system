package com.mk.jsms;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerForJTable extends MouseAdapter 
{
    private JTable table;
    public MouseListenerForJTable(JTable table) 
    {
        this.table = table;
    }
    public void mousePressed(MouseEvent event) 
    {
        Point point = event.getPoint();
	int currentRow = table.rowAtPoint(point);
	table.setRowSelectionInterval(currentRow, currentRow);
    }
}
