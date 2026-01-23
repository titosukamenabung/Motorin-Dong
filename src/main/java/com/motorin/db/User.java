/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorin.db;


public class User {

    // 1. Variabel "Loker" (pakai static)
    private static int id;
    private static String nama;
    private static String jabatan;
    private static String username;
    private static String password;
    
    // (Anda bisa tambah variabel lain jika perlu)


    // 2. SETTER (untuk MENYIMPAN data ke loker)
    // Ini akan dipanggil dari LoginPage.java
    
    public static void setId(int id) {
        User.id = id;
    }

    public static void setNama(String nama) {
        User.nama = nama;
    }

    public static void setJabatan(String jabatan) {
        User.jabatan = jabatan;
    }
    
    public static void setUsername(String username) {
        User.username = username;
    }
    
    public static void setPassword(String password) {
        User.password = password;
    }


    // 3. GETTER (untuk MENGAMBIL data dari loker)
    // Ini akan dipanggil dari Profile.java (atau form lain)
    
    public static int getId() {
        return id;
    }

    public static String getNama() {
        return nama;
    }

    public static String getJabatan() {
        return jabatan;
    }
    
    public static String getUsername() {
        return username;
    }
    
    public static String getpassword(){
        return password;
    }
    
}
