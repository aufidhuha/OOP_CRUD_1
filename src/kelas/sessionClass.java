/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

/**
 *
 * @author ASUS
 */
public class sessionClass {
    
    private static String userName, nama, email, status;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        sessionClass.userName = userName;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        sessionClass.nama = nama;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        sessionClass.email = email;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        sessionClass.status = status;
    }
    
    
}
