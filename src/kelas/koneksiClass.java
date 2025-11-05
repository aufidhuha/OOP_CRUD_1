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

//    private Connection cnVar;
//
//    private String host = "localhost";
//    private String dbName = "crudoop_202457201015";
//    private String port = "3306";
//    private String user = "root";
//    private String password = "";
//    private String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;
//
//    public Connection getConnection() {
//
//        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            cnVar = DriverManager.getConnection(url, user, password);
//        } catch (SQLException sQLException) {
//            JOptionPane.showMessageDialog(null, "Error, gagal terkoneksi ke Database : " + sQLException.getMessage());
//        }
//        return cnVar;
    
    
    private Connection mysqlConfig;
    
    public Connection configDB(){
        
        try {
            String url = "jdbc:mysql://localhost:3306/crudoop_202457201015";
            String user = "root";
            String pass = "";
            mysqlConfig = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Error : " + sQLException.getMessage());
        }
        return mysqlConfig;
    }

}
