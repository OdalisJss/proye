/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DR Admin
 */
public class Conexion {
    Connection con;
    
    public Conexion() throws ClassNotFoundException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RedSocial", "root", "educare2016.");
        } catch (Exception e) {
            System.err.println("No se pudo establecer conexion: " + e);
        }
    }

    public Connection getConnector() {
        return con;
    }
}

