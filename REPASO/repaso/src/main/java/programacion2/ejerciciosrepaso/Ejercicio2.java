/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
2. Cree un programa “Generador de series” que lea el número inicial, el número final 
y el valor que se incrementará, para mostrar la serie de números generado con los anteriores datos. 
*/

package programacion2.ejerciciosrepaso;

import java.util.Scanner;

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
        int i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero inicial de la serie: ");
        int numInicial = sc.nextInt();
        
        System.out.print("Ingrese el numero final de la serie: ");
        int numFinal = sc.nextInt();
        
        System.out.print("Ingrese el incremento de la serie: ");
        int incremento = sc.nextInt();
        
        if(numFinal < numInicial){
            System.out.print("El numero final no puede ser menor al numero inicial de la serie.");
        }else{
            System.out.print("La serie es: ");
            for(i = numInicial; i <= numFinal; i = i + incremento){
                System.out.print(i + " ");
            }
        }    
    }
}