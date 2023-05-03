package modelo;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jdcan
 */
public class Animal {
    String raza, nombre, color;
    int edad, nivelEntrenamiento;
    Boolean toxoplasmosis;

    public Animal() {
    }

    public Animal(String raza, String nombre, String color, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public Boolean gettoxoplasmosis() {
        return toxoplasmosis;
    }

    public void settoxoplasmasis(Boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
}
