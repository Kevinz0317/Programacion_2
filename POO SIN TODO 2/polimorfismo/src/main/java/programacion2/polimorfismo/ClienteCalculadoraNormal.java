/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class ClienteCalculadoraNormal {
   
    public int capturarNumero1(){
       int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
       return num1;
    }
    
    public int capturarNumero2(){
       int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
       return num2;
    }
    
    public void imprimir(String mensaje){
       JOptionPane.showMessageDialog(null, mensaje);
    }
}
