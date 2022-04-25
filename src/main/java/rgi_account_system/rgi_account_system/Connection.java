/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rgi_account_system.rgi_account_system;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Mritunjay Singh
 */
public class Connection {
    java.sql.Connection con;
    Statement stm;   
     ResultSet rs;
 public Connection()
 {
 try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rgi_system","root", "");
            stm=con.createStatement(); //DDl
           
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String arg[])
            {
                Connection ob = new Connection();
            }
    
}

