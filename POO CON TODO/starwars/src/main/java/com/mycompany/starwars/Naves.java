/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.starwars;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Naves {
    private String tipo;
    private int numPersonas;
    private int cantNaves;
    private double combustible;
    private double parsecs;

    public Naves() {
    }

    public Naves(String tipo, int numPersonas, int cantNaves, double combustible,double parsecs) {
        this.tipo = tipo;
        this.numPersonas = numPersonas;
        this.cantNaves = cantNaves;
        this.combustible = combustible;
        this.parsecs = parsecs;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    public int getCantNaves() {
        return cantNaves;
    }
    
    public void setCantNaves(int cantNaves) {
        this.cantNaves = cantNaves;
    }
    
    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public double getParsecs() {
        return parsecs;
    }

    public void setParsecs(double parsecs) {
        this.parsecs = parsecs;
    }

    public void pedirDatos(){
        do{
            numPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas de la nave"));
            setNumPersonas(numPersonas);
        }while(numPersonas <= 0);
        
        do{
            cantNaves = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de naves"));
            setCantNaves(cantNaves); 
        }while(cantNaves <= 0);
        
        do{
           combustible = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el consumo de combustible (En Litros por Parsec)"));
           setCombustible(combustible); 
        }while(combustible <= 0);
    }
    
    public void pedirParsecs(){
        do{
           parsecs = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad aproximada de Parsecs a recorrer en la guerra"));
           setParsecs(parsecs); 
        }while(parsecs <= 0);
        JOptionPane.showMessageDialog(null, "La distancia en Parsecs ingresada es: "+getParsecs());
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "La Cantidad de personas por nave son: "+getNumPersonas()+"\nEl Consumo de combustible en litros por Parsec por nave son: "+getCombustible()+"\nLa cantidad de Naves son: "+getCantNaves());
    }             
}