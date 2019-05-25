package com.mk.jsms;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class onlyNumbersDot extends KeyAdapter
{
    public void keyTyped(KeyEvent e) 
    {
        char c = e.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || c =='.')) 
        {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }
}