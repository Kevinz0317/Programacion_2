/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.poo2;

/**
 *
 * @author Kevin POJO = Plane old Java Object
 */

public class Avioncito {
    
    String id;
    String color;
    String marca;
    int capacidad;

    public Avioncito() {
    }
    
    public Avioncito(String id) {
        this.id = id;
        this.color = "";
        this.marca = "";
        this.capacidad = 0;
    }

    public Avioncito(String id, String color, String marca, int capacidad) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
    }
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void imprimir() {
        System.out.println("id: "+id+" color: "+color+" marca: "+marca+" capacidad: "+capacidad);
    }
}
