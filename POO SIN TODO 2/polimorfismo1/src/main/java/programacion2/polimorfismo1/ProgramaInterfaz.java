/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.polimorfismo1;

/**
 *
 * @author Kevin
 */
public class ProgramaInterfaz {

    public static void main(String[] args) {
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin);   
        
        Burro burrito = new Burro();
        hacerCantar(burrito);
    } 

    public static void hacerCantar(IPuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}