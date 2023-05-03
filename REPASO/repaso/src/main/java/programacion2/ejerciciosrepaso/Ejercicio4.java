/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*

*/

package programacion2.ejerciciosrepaso;

import java.util.Scanner;

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
        
        int i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un valor (mayor a 0): ");
        int valorIngresado = sc.nextInt();
        
        if(valorIngresado < 0){
            System.out.print("El numero ingresado es menor a 0.");
        }else{
            System.out.print("Los numeros desde 0 hasta el numero ingresado("+valorIngresado+") son: ");
            for(i = 0; i <= valorIngresado; i++){
                System.out.print(i + " ");
            }
        }
    }   
}