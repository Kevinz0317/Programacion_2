    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Stirling aburrido  de esperarcuando  necesitabacalcular  el  factorial  de  un  número
(recuerden que  se  debe  hacer un recorridomultiplicando todos los enteros desde el número hasta 1),
se inventa una  fórmula  para  calcular  factoriales de  forma  aproximadasin  recorridos,  
ayuda  a Stirling a comprobar su fórmula: n! ≈ n^n*e^-n*√2πn.
*/

package programacion2.grupal;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi = Math.PI;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Calcular Factoriales Aproximados, ingrese un número: "));
        int i;
        
        double a, b, c;
        double factorialAprox, factorial = 1;
        
        a = Math.pow(n, n);
        b = Math.exp(-n);
        c = Math.sqrt(2*Math.PI*n);
        factorialAprox = a * b * c;
        
        JOptionPane.showMessageDialog(null, "El Factorial Aproximado del numero ingresado ("+n+") es: "+factorialAprox);
        
        for(i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        JOptionPane.showMessageDialog(null, "El Factorial Exacto del numero ingresado ("+n+") es: "+factorial);
    }
    
}