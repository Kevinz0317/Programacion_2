/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Desarrolle un programa que permita adivinar una clave secreta, este consiste en intentar adivinar un número en tres oportunidades, 
para esto se deben declarar dos valores del mismo tipo, el primero constante e inicializado en el número a adivinar, 
el segundo leído y comparado con el primero, se debe poder intentar tres veces, en cada uno de los intentos se debe generar un mensaje 
que diga: “Acceso permitido”, si los números son iguales. “Acceso denegado” si los números son diferentes,  
si al finalizar los tres intentos no se acierta debe decir “Clave Bloqueada”.     ( for – if -break) 
*/

package programacion2.ejerciciosrepaso;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 73, i;
        
        for(i = 0; i < 3; i++){
            int clave = Integer.parseInt(JOptionPane.showInputDialog("Intente adivinar la clave secreta en "+(3-i)+" intento(s)"));
            if(num == clave){
                JOptionPane.showMessageDialog(null, "Acceso Permitido");
                break;
            }else{  
               JOptionPane.showMessageDialog(null, "Acceso Denegado"); 
            }
        }
    }  
}
