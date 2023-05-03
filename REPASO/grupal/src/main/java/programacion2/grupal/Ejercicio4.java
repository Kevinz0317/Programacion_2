/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2.grupal;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, """
                                                                Regla de 3 simple:
                                                                
                                                                Dato 1 ---> Dato 2
                                                                Dato 3 ---> x
                                                
                                                                      Dato 2 * Dato 3
                                                                x =  ------------------
                                                                               Dato 1""");
        
        double dato1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer dato"));
        double dato2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo dato"));
        double dato3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer dato"));
        double resultado;
        
        resultado = dato2 * dato3/dato1;
        
        JOptionPane.showMessageDialog(null, "El resultado de la regla de 3 es: "+resultado);
    }   
}