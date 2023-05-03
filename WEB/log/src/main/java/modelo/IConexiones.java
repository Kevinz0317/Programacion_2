/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author oscar
 */
public interface IConexiones {
    public void eliminar(int id);
    public void añadir(String nombre, String apellido, int telefono, int cedula)throws SQLException;
    public ResultSet consultarDatos(int id);
}
