package com.mk.jsms;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class FocusForTextbox implements FocusListener
{
    public void focusGained(FocusEvent e)
    {
        JTextField t=(JTextField)e.getComponent();
        t.setBorder(new LineBorder(new Color(254,137,0)));
    }
    public void focusLost(FocusEvent e)
    {
        JTextField t=(JTextField)e.getComponent();
        t.setBorder(new LineBorder(new Color(122,138,153)));
    }
 }