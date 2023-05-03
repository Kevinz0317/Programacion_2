/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
1. Programa que lea dos números  y muestre la suma. (entrada – proceso  - salida) 
*/
package programacion2.ejerciciosrepaso;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        
        int suma;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer sumando: ");
        int sumando1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo sumando: ");
        int sumando2 = sc.nextInt();
        
        suma = sumando1 + sumando2;
        
        System.out.print("El resultado de la suma es: "+suma);
    }
}
