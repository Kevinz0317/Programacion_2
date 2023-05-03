/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
5. Método que lea un valor y muestre los números desde 0 hasta el valor ingresado de 3 en 3, para esto reemplace en el for  el unario   i++   por   i= i+3. 
*/

package programacion2.ejerciciosrepaso;

import java.util.Scanner;

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
        
        int i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un valor: ");
        int valIngresado = sc.nextInt();
        
        if(valIngresado < 0){
            System.out.print("El valor ingresado es menor a 0. ");
        }else{
            System.out.print("Los numeros de 0 hasta "+valIngresado+" de 3 en 3 son: ");
            for(i = 0; i <= valIngresado; i = i + 3){
                System.out.print(i + " ");
            }
        }
    }
}
