package modelo;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jdcan
 */
public class Felino extends Animal{
    boolean toxoplasmosis;

    public Felino() {
    }

    public Felino(String raza, String nombre, String color, int edad) {
        super(raza, nombre, color, edad);
        this.toxoplasmosis = toxoplasmosis;
    }

    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    
    
}
