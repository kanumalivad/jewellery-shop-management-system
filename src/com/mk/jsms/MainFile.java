package com.mk.jsms;
public class MainFile 
{
    public static void main(String arg[])
    {
        MDI_Frame frm=new MDI_Frame();
        new Login_Frame(frm).setVisible(true);              
    }
}
