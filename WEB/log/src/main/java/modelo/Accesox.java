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
public class Accesox extends Conectorx implements IConexiones{
    private ResultSet res;
    PreparedStatement st=null;

    public Accesox() {
    }       
    
    @Override
    public ResultSet consultarDatos(int id){
        try{           
            getStatement();
            res = stat.executeQuery ("SELECT * FROM CLIENTE WHERE CEDULA="+id); 
            return res;
        }
        catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    @Override
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
    
    @Override
    public void eliminar(int id) {
        try{
            st= (PreparedStatement) con.prepareStatement("DELETE FROM cliente WHERE cedula=?");
            st.setInt(1, id);
            st.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    
}
