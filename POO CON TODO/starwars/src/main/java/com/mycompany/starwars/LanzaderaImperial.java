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
public final class LanzaderaImperial extends Naves implements INaves{

    public LanzaderaImperial() {
        setTipo("Lanzadera Imperial");
    }
    
    @Override
    public void pedirDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la nave 'Lanzadera Imperial'");
        super.pedirDatos(); 
    }

    @Override
    public void imprimir() {
        
        JOptionPane.showMessageDialog(null, "Su nave es 'Lanzadera Imperial'");
        super.imprimir();
    }

    @Override
    public double consumoCombustibleParsec() {
        double a;
      
        a = getCantNaves() * getCombustible();
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario para las naves 'Lanzadera Imperial' es: "+a+" Litros por Parsec");

        return a;
    }
}
