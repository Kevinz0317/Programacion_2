/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Una fábrica de quesos recibe cada cierto tiempo una caneca cilíndrica de dimensiones variables,
que  debe  llenar  de leche a través  de  un tubo con  cierto caudal  disponible.  Se  desea crear  
un programa que le indique cuánto tiempo transcurrirá hasta el llenado de la caneca. 
El caudal del tubo es constante y se encuentra almacenado en el programaen litros por minuto.
*/
package programacion2.grupal;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double litrosPorMin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de litros que se llena por minutos: "));
        
        // Volumen de un Cilindro: π*r^2*h
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la caneca: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de la caneca: "));
        
        double minutosTot,volumen,litrosTot;
        
        volumen = Math.PI*Math.pow(radio, 2)*altura;
        litrosTot = volumen * 1000;
        minutosTot = litrosTot / litrosPorMin;
        
        JOptionPane.showMessageDialog(null, "El tiempo en minutos en el que se demora en llenar la caneca es: "+minutosTot);
    }   
    
    
}
