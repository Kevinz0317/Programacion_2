/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarConversor;

/**
 *
 * @author Kevin
 */
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mvc3.Controlador;
import mvc1.Modelo;
import mvc2.Vista;
public class PruebaConversor {
public static void main(String arf[]) {
 try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
 }
 catch (UnsupportedLookAndFeelException e) {
 }
 catch (ClassNotFoundException e) {
 }
 catch (InstantiationException e) {
 }
 catch (IllegalAccessException e) {
 }
Modelo modelo = new Modelo();
Vista vista = new Vista();
Controlador controlador = new Controlador(modelo, vista);
controlador.iniciarVista();
}
}