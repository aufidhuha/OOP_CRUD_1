/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class category {

    private int categoryId;
    private String categoryName;
 
    private Connection cnVar;
    private PreparedStatement psVar;
    private Statement stVar;
    private ResultSet rsVar;
    private String query;
    
    public category() {
        koneksi koneksiDB = new koneksi();
        cnVar = koneksiDB.configDB();
    }    
    
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
    public ResultSet loadData(){
        
        try {
            query = "SELECT * FROM category";
            
            stVar = cnVar.createStatement();
            rsVar = stVar.executeQuery(query);
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Error : " + sQLException.getMessage());
        }
        return rsVar;
    }
    
    
    public void saveData(){
        
        try {
            query = "INSERT INTO category VALUES (?, ?)";
            
            psVar = cnVar.prepareStatement(query);
            psVar.setInt(1, this.categoryId);
            psVar.setString(2, this.categoryName);
            psVar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Error : " + sQLException.getMessage());
        }
    }
    
    
    public void updateData(){
        
        try {
            query = "UPDATE category SET categoryName = ? WHERE categoryId = ?";
            
            psVar = cnVar.prepareStatement(query);
            psVar.setString(1, this.categoryName);
            psVar.setInt(2, this.categoryId);
            
            psVar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Error : " + sQLException.getMessage());
        }
    }
        
    
    public void deleteData(){
        
        try {
            query = "DELETE FROM category WHERE categoryId = ?";
            
            psVar = cnVar.prepareStatement(query);
            psVar.setInt(1, this.categoryId);
            
            psVar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Error : " + sQLException.getMessage());
        }
    }
    
    
    
}
