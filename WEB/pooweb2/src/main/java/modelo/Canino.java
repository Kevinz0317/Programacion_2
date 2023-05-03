package modelo;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jdcan
 */
public class Canino extends Animal{
    
    int nivelEntrenamiento;
    
    public Canino() {
    }

    public Canino(String raza, String nombre, String color, int edad) {
        super(raza, nombre, color, edad);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
}
