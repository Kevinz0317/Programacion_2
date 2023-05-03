/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Estudiante extends Persona{
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {
    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public void leerNotas(){
        double sumita = 0.0;
        for(int i = 0; i <= numeroMaterias; i++){
            sumita = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la nota de la materia "+(i+1)));
            sumita += sumita;
        }
        
    }
    
    public void calcularDatos(){
        
    }
}
