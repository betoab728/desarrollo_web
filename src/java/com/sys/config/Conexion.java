/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ELIAS
 */

    public class Conexion {
    private Connection con;
    private static final String db="allqvet";
    private static final String url="jdbc:mysql://localhost:3306/"+db;
    private static final String user="root";
    private static final  String pass="root";
 
    public Conexion() {
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection(this.url,this.user,this.pass);
             
        } catch (Exception e) {
           System.out.println("error de conexion:"+e.getMessage());
        }
    }
    public Connection getConnection(){
    
        return con; 
        
}
    
}
