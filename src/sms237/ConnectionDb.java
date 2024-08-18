/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sms237.entities.Classes;

/**
 *
 * @author idrice24
 */
public class ConnectionDb {
    
    public static Connection getConnection(){
        Connection conn = null;
        try{
            //JDBC
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","idrice");
            JOptionPane.showMessageDialog(null,"Connected!!");
            return conn;
            
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, "not connected!!");
            
            return null;
        }
        
    }
    
   public static Connection getConnections(){
       Connection con = null;
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","idrice");
           return con;
       }catch(SQLException ex){
           
           return null;
       }
   }
            
}
