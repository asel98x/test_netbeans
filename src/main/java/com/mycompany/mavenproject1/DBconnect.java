/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author asel
 */
public class DBconnect {
    public static Connection connect(){
     Connection conn = null;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("","","");
        } catch (Exception e) {
        }
     
     return conn;
    }
}
