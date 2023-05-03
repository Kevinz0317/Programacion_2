/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.poo2;

/**
 *
 * @author Kevin
 */
public class Princi {

    public static void main(String[] args) {
        
        Avioncito a1 = new Avioncito();
        Avioncito a2 = new Avioncito("HK159");
        Avioncito a3 = new Avioncito("HK170", "GRIS", "BOING", 30);
        
        a1.setId("AJ222");
        a1.setColor("Blanco");
        a1.setMarca("Viva Air");
        a1.setCapacidad(200);
       
        a1.imprimir();
        
    }
}
