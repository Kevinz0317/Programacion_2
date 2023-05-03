/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.arraylist;

/**
 *
 * @author Kevin
 */
//clase que define las características del producto
public class Producto { 
private String nombre; 
private int cantidad; 

//constructor de la clase producto

public Producto(String s, int i) { 
nombre = s; 
cantidad = i; 
                                 } 
//método de la clase object
public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
} 

//métodos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 
} 
