package com.mk.jsms;
import java.sql.*;

public class DBConnection 
{
    public static Connection getDBConnection()
    {
        Connection con;
        try
        {
        	Class.forName("com.mysql.jdbc.Driver"); 
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dj?useSSL=false&relaxAutoCommit=true","kanu","kanu@123"); 
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}