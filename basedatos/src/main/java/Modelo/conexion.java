/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author barah
 */
public class conexion {
    private final String base ="dbvendedores";
  private Connection con = null; 
  
    
   public Connection getConexion()
   {
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC"+ base;
        try {
            //paso 2 creamos el objeto conexion
            Connection con = DriverManager.getConnection(url,"root","admin");
            //paso 3 creamos el objeto statement
             
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
      
      return con;
       
   }
           
    

    
    
    
    
}
