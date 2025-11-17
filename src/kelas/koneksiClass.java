/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class koneksiClass {

    private Connection mysqlConfig;
    
    public Connection configDB(){
        
        try {
            String url = "jdbc:mysql://localhost:3306/crudoop_202457201015";
            String user = "servercrudoop";
            String pass = "terusbelajar";
            mysqlConfig = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Error : " + sQLException.getMessage());
        }
        return mysqlConfig;
    }

}
