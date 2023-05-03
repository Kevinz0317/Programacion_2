/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
/**
 *
 * @author oscar
 */
public class Acceso extends Conector{
    private ResultSet res;
    PreparedStatement st=null;

    public Acceso() {
    }       
    
    public ResultSet consultarDatos(){
        try{           
            getStatement();
            res = stat.executeQuery ("SELECT * FROM CLIENTE"); 
            return res;
        }
        catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public void añadir(String nombre, String apellido, int telefono, int cedula) throws SQLException{ 
        try{
            st= (PreparedStatement) con.prepareStatement("INSERT INTO cliente (nombre,apellido,telefono,cedula) VALUES (?,?,?,?)");  
            st.setString(1,nombre);
            st.setString(2, apellido);
            st.setInt(3, telefono);
            st.setInt(4, cedula);
            st.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public void eliminar(int id) throws SQLException{
        try{
            st= (PreparedStatement) con.prepareStatement("DELETE FROM cliente WHERE cedula=?");
            st.setInt(1, id);
            st.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        
    }
    
}
