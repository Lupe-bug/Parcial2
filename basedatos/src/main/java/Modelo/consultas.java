/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author barah
 */
public class consultas extends conexion { //heredamos
    
    public boolean modificar (Comision pro){
       
        PreparedStatement ps = null;
        Connection con = getConexion(); //aqui llamamos a la clase conexion, para realizar la coneccion
        
        String sql ="UPDATE consultas  SET nomvendedor=? WHERE Num=? "; //aqui esta la consulta
        
        //ahora enviamos los datos 
        try{
            
            ps= con.prepareStatement(sql);
            
            ps.setInt(1, pro.getNum());
            ps.setString(2, pro.getNomvendedor());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
        }
            
        
        
    }
    
    
    
            public boolean eliminar (Comision pro){
       
        PreparedStatement ps = null;
        Connection con = getConexion(); //aqui llamamos a la clase conexion, para realizar la coneccion
        
        String sql ="DELETE FROM consultas WHERE IDvendedor=? "; //aqui esta la consulta
        
        //ahora enviamos los datos 
        try{
            
            ps= con.prepareStatement(sql);
            ps.setInt(1, pro.getIDvendedor());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
        }
            
        
        
    }
    
    
      public boolean buscar (Comision pro){
       
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion(); //aqui llamamos a la clase conexion, para realizar la coneccion
        String sql ="SELECT * FROM consultas WHERE IDvendedores=? "; //aqui esta la consulta
        
        //ahora enviamos los datos 
        try{
            
            ps= con.prepareStatement(sql);
           ps.setInt(1, pro.getIDvendedor());
           rs = ps.executeQuery();
           
           
           if(rs.next())//aqui colocaremos los datos, tenienddo en cuenta que solo sacara una fila.
           {            // ya que hayamos obtenido una fila la vamos a agregar a Modelo.
               
           
               pro.setNum(Integer.parseInt(rs.getString("num")));
               pro.setIDvendedor(Integer.parseInt(rs.getString("IDvendedor")));
               pro.setNomvendedor(rs.getString("nombrevendedor"));
               pro.setEnero(Integer.parseInt(rs.getString("Enero")));
               pro.setFebrero(Integer.parseInt(rs.getString("Febrero")));           //aqui agregamoss los datos y los colocamos en columna
               pro.setMarzo(Integer.parseInt(rs.getString("Marzo")));               //asi como también parciamos los de dato entero.
               pro.setAbril(Integer.parseInt(rs.getString("Abril")));     
               pro.setMayo(Integer.parseInt(rs.getString("Mayo")));
               pro.setJunio(Integer.parseInt(rs.getString("Junio")));
               return true; // al retornar tru se va a salir de IF
           }
           // en caso que no encuentre ningun resultado se saldrá del if y retornará falso
            return false;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                 System.err.println(e);
            }
        }
      }
}
