/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.herencia1;

/**
 *
 * @author Kevin
 */

public class Hijito1 extends Papito{
    
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = "Caterine";
    }
    
    @Override
    public void imprimir() {
        System.out.println("El nombre es: "+getNombre()+" "+apellido);
        super.imprimir(); 
    }
    
    public Hijito1() {
        apellido = "Parra";
        super.imprimir();
    }
}
