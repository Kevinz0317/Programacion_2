/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.evaluacion1;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Evaluacion1 {
    
    private static void carroAntiguo(){
        
        int cantCarros, anioCarro, a, i;
        
        Scanner sc = new Scanner(System.in);
        
        cantCarros = sc.nextInt();
        
        while(cantCarros < 1 || cantCarros > 30){
            cantCarros = sc.nextInt();
        }
        
        for(i = 0; i <= cantCarros; i++){
            
            anioCarro = sc.nextInt();
            a = anioCarro;
            
            if(anioCarro < a){
                System.out.print(anioCarro);
            }else{
                System.out.print(a);
            }
        }
        
    }
    
    public static void main(String[] args) {
        carroAntiguo();
    }
}
