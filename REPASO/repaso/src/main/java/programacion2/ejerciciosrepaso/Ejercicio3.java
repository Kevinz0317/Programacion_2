/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
3. Programa que muestre usando while los números enteros de 1 al 100. 
*/

package programacion2.ejerciciosrepaso;

/**
 *
 * @author Kevin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numEnteros = 0;
        
        System.out.print("Los numeros enteros del 1 al 100 son: ");
        
        while(numEnteros <= 100){
            System.out.print(numEnteros + " ");
            numEnteros++;
        }
    }
    
}
