/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms237;

import static sms237.ConnectionDb.getConnection;

/**
 *
 * @author idrice24
 */
public class Sms237 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        getConnection();
        Welcome wel = new Welcome();
        wel.setVisible(true);  
    }
    
}
