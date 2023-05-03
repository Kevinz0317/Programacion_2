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
public final class Supremacy extends Naves implements INaves{
    private int navesTrans;
    
    public Supremacy() {
        setTipo("Supremacy");
    }

    public Supremacy(int navesTrans, String tipo, int numPersonas, int cantNaves, double combustible, double parsecs) {
        super(tipo, numPersonas, cantNaves, combustible, parsecs);
        this.navesTrans = navesTrans;
    }
    
    public int getNavesTrans() {
        return navesTrans;
    }

    public void setNavesTrans(int navesTrans) {
        this.navesTrans = navesTrans;
    }
    @Override
    public void pedirDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la nave 'Supremacy'");
        super.pedirDatos(); 
        do{
            navesTrans = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las naves transportadas: "));
            setNavesTrans(navesTrans); 
        }while(navesTrans <= 0);
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Su nave es 'Supremacy'");
        JOptionPane.showMessageDialog(null, "La Cantidad de personas por nave son: "+getNumPersonas()+"\nEl Consumo de combustible en litros por Parsec por nave son: "+getCombustible()+"\nLa cantidad de Naves son: "+getCantNaves()+"\nLa cantidad de naves transportadas por Supremacy son: "+getNavesTrans());
    }

    @Override
    public double consumoCombustibleParsec() {
        double a;
        
        a = getCantNaves() * (getCombustible() + (getCombustible() * getNavesTrans() * 0.1));
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario para las naves 'Supremacy' es: "+a+" Litros por Parsec");

        return a;
    }
}