/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc3;

/**
 *
 * @author Kevin
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import mvc1.Modelo;
import mvc2.Vista;
public class Controlador implements ActionListener {
private Modelo modelo;
private Vista vista;
private Double cantidad;
public Controlador(Modelo modelo, Vista vista) {
 this.modelo = modelo;
 this.vista = vista;
 this.vista.pesos.addActionListener(this);
 this.vista.dolares.addActionListener(this);
}
public void iniciarVista() {
vista.setTitle("Conversor");
vista.pack();
vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
vista.setLocationRelativeTo(null);
vista.setVisible(true);
}
public void actionPerformed(ActionEvent evento) {
 if(vista.pesos == evento.getSource()) {
if(!"".equals(vista.campoTexto.getText())) {
 try{
cantidad = Double.parseDouble(vista.campoTexto.getText());
modelo.setCantidad(cantidad);
modelo.setMoneda(13.943);
modelo.convetirDolarAPeso();
vista.lResultado.setText(modelo.getResultado().toString());
 }catch(NumberFormatException e) {
vista.lResultado.setText("Introduzca una cantidad valida...");
 }
}
 }
 else if(vista.dolares == evento.getSource()) {
if(!"".equals(vista.campoTexto.getText())) {
 try{
cantidad = Double.parseDouble(vista.campoTexto.getText());
modelo.setCantidad(cantidad);
modelo.setMoneda(0.072);
modelo.convertirPesoADolar();
vista.lResultado.setText(modelo.getResultado().toString());
 }catch(NumberFormatException e) {
vista.lResultado.setText("Introduzca una cantidad valida...");
 }
}
 }
}
}
