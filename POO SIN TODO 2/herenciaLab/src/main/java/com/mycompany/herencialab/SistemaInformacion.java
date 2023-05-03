/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencialab;

import javax.swing.JOptionPane;

public class SistemaInformacion {

    public static void main(String[] args) {
        int opcion = 0;
        Persona sistemaInformacion = new Persona();
        try{
            do{
                opcion =sistemaInformacion.leerDatoTipoEntero("Ingrese la opción \n1. Para procesar los datos del empleado \n2. Para procesar datos del estudiante\n3. Para salir ");
                if (opcion == 1){
                    JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
                    Empleado manejadorEmpleado = new Empleado();
                    manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();
                }
                else 
                if (opcion == 2){
                    JOptionPane.showMessageDialog(null,"Procesando datos del estudiante");
                    Estudiante manejadorEstudiante = new Estudiante();
                    manejadorEstudiante = manejadorEstudiante.ingresarDatosEstudiante();
                    manejadorEstudiante.leerNotasEstudiante();
                    manejadorEstudiante.imprimirReporteNotasEstudiante();
                }
                else
                if (opcion == 3){
                    JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
                    break;
                }else{JOptionPane.showMessageDialog(null,"Opción inválida");} 
            }while (opcion <= 1 || opcion >= 3);
        }
        catch (Exception errorMain){
            JOptionPane.showMessageDialog(null,"Error en la digitación: ");
            errorMain.printStackTrace();}
    }
}
