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
public final class HalconMilenario extends Naves implements INaves{

    public HalconMilenario() {
        setTipo("Halcon Milenario");
    }
    
    @Override
    public void pedirDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la nave 'Halcon Milenario'");
        super.pedirDatos(); 
    }

    @Override
    public void imprimir() {   
        JOptionPane.showMessageDialog(null, "Su nave es 'Halcon Milenario'");
        super.imprimir();
    }

    @Override
    public double consumoCombustibleParsec() {
        double a;
      
        a = getCantNaves() * getCombustible();
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario para las naves 'Halcon Milenario' es: "+a+" Litros por Parsec");

        return a;
    }
}
