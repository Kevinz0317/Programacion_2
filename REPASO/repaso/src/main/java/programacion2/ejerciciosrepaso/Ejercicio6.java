/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
6. Programa que lea un ser vivo y muestre el reino al cual pertenece.  Programar 5 posibilidades.  ( if ) 
*/

package programacion2.ejerciciosrepaso;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ser = JOptionPane.showInputDialog("Ingrese un ser vivo: ");
        ser = ser.toLowerCase();
        if("gato".equals(ser)||"perro".equals(ser)||"vaca".equals(ser)||"cerdo".equals(ser)||"caballlo".equals(ser)){
            JOptionPane.showMessageDialog(null, "El ser vivo "+ser+" pertenece al reino animal.");
        }else if("musgo".equals(ser)||"helecho".equals(ser)||"magnolia".equals(ser)||"palmera".equals(ser)||"tulipan".equals(ser)){
            JOptionPane.showMessageDialog(null, "El ser vivo "+ser+" pertenece al reino vegetal.");
        }else if("matamoscas".equals(ser)||"hongo estrella".equals(ser)||"hongo de pino".equals(ser)||"cigarro del diablo".equals(ser)||"crepidotus".equals(ser)){
            JOptionPane.showMessageDialog(null, "El ser vivo "+ser+" pertenece al reino fungi.");
        }else if("protozoos".equals(ser)||"amoeba".equals(ser)||"laurencia".equals(ser)||"volvox".equals(ser)||"nuclearia".equals(ser)){
            JOptionPane.showMessageDialog(null, "El ser vivo "+ser+" pertenece al reino protista.");
        }else{
            JOptionPane.showMessageDialog(null, "El ser vivo "+ser+" no pertenece a algun reino o no se encuentra dentro las 5 posibilidades.");
        }
    }
    
}
