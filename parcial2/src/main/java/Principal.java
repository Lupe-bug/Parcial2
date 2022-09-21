
import java.sql.*;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author barah
 */
public class Principal {
    
    public static void ej1(int id ){
       
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        
         Scanner t = new Scanner(System.in);
        System.out.println("ingresar IDvendedor");
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            
            id = t.nextInt();
                         
   
            
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM consultas  where IDvendedor =  "+id;
            
            //String sql = "select nota1 + nota2 from db_alumnos where codigo = 1";
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            
            
            
            
            
            
            while(resultado.next()){
                System.out.println("num ="+resultado.getInt(1));
                 System.out.println("ID ="+resultado.getInt(2));
                System.out.println("Nombre = "+resultado.getString(3));
                System.out.println("E  ="+resultado.getInt(4));
                System.out.println("F ="+resultado.getInt(5));
                System.out.println("M ="+resultado.getInt(6));
                System.out.println("A ="+resultado.getInt(7));
                System.out.println("M ="+resultado.getInt(8));
                System.out.println("J ="+resultado.getInt(9));
          
                
            }
          
            //sum = resultado.getInt(3)+resultado.getInt(4);
            //System.out.println("dfs2 ="+sum);
            
            
            
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
       
}
    public static void lista(int id ){
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            
          
         
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM consultas";
            
            //String sql = "select nota1 + nota2 from db_alumnos where codigo = 1";
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            
            
            System.out.println("## LISTA ##");
            
            
            
            while(resultado.next()){
                System.out.println("num ="+resultado.getInt(1));
                 System.out.println("ID ="+resultado.getInt(2));
                System.out.println("Nombre = "+resultado.getString(3));
                System.out.println("E  ="+resultado.getInt(4));
                System.out.println("F ="+resultado.getInt(5));
                System.out.println("M ="+resultado.getInt(6));
                System.out.println("A ="+resultado.getInt(7));
                System.out.println("M ="+resultado.getInt(8));
                System.out.println("J ="+resultado.getInt(9));
          
                
            }
          
            //sum = resultado.getInt(3)+resultado.getInt(4);
            //System.out.println("dfs2 ="+sum);
            
            
            
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
       
}
    

    public static void main(String[] args) {
        
        ej1(4);
        lista (4);
    }
    
    
}
