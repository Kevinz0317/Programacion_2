/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencialab;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {

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
    
    public double calcularPromedio(double notas, int materias){
        notas=notas/materias;
        return notas;
    }
    
    public void leerNotasEstudiante(){     
        double sumaNotas=0;
        double notai=0;
        double promedio=0;
        int materias;
        do{
            materias = leerDatoTipoEntero("Ingrese la cantidad de materias: ");
            if(materias<=0)JOptionPane.showMessageDialog(null,"Error de digitación, debe insertar un valor positivo entero");            
        }while(materias<=0);
      

        for(int i=0; i<materias; i++){
            do{
                notai=leerDatoTipoReal("Ingrese la nota de la materia "+(i+1)+": ");
                if(notai<0)JOptionPane.showMessageDialog(null, "Nota no válida, digite de nuevo");
            }while(notai<0);
            sumaNotas+=notai;
        }
    
        promedio=calcularPromedio(sumaNotas, materias); 
        setPromedioNotas(promedio);
        setNumeroMaterias(materias);
    }
    
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        String carnet = "";
        int edad = 0;
        double peso = 0.0;
        
        carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante: ");
        nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
        
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        
        return (nuevoEstudiante);
    }
    
    public void imprimirReporteNotasEstudiante (){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null,"Carnet estudiantil: " + carnet + "\nNúmero de materias: " + numeroMaterias + "\nPromedio: "+ promedioNotas);
    }
    
}
