/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.herencia1;

/**
 *
 * @author Kevin
 */
public class Herencia1 {

    public static void main(String[] args) {
        Papito p = new Papito();
        Hijito1 h1 = new Hijito1();
        
        p.setApellido("Diaz");
        p.imprimir();
        
        h1.setApellido("Parra");
        h1.imprimir();
    }
}
