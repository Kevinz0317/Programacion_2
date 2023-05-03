/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Desarrolle un programa que lea un número de 1 a 7, muestre la nota musical correspondiente de repetirse 
y salir cuando el número ingresado sea cero.  (do_while - Switch case) 
*/

package programacion2.ejerciciosrepaso;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opc = 0;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               Ingrese un numero del 1 al 7:
                                                               
                                                                Notas Musicales: 
                                                               
                                                                1. Nota musical #1
                                                                2. Nota musical #2
                                                                3. Nota musical #3
                                                                4. Nota musical #4
                                                                5. Nota musical #5
                                                                6. Nota musical #6
                                                                7. Nota musical #7
                                                                0. Salir"""));
            
            switch(opc){
                case 1: JOptionPane.showMessageDialog(null, "La nota musical #1 es Do."); break;
                case 2: JOptionPane.showMessageDialog(null, "La nota musical #2 es Re."); break;
                case 3: JOptionPane.showMessageDialog(null, "La nota musical #3 es Mi."); break;
                case 4: JOptionPane.showMessageDialog(null, "La nota musical #4 es Fa."); break;
                case 5: JOptionPane.showMessageDialog(null, "La nota musical #5 es Sol."); break;
                case 6: JOptionPane.showMessageDialog(null, "La nota musical #6 es La."); break;
                case 7: JOptionPane.showMessageDialog(null, "La nota musical #7 es Si."); break;
                case 0: JOptionPane.showMessageDialog(null, "Gracias."); break;
            }
            
        }while(opc != 0);
    }
    
    
}
