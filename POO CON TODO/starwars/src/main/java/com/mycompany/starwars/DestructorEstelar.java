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
public final class DestructorEstelar extends Naves implements INaves{

    public DestructorEstelar() {
        setTipo("Desttructor Estelar");
    }
    
    @Override
    public void pedirDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la nave 'Destructor Estelar'");
        super.pedirDatos(); 
    }

    @Override
    public void imprimir() {
        
        JOptionPane.showMessageDialog(null, "Su nave es 'Destructor Estelar'");
        super.imprimir();
    }

    @Override
    public double consumoCombustibleParsec() {
        double a;
        
        a = getCantNaves() * getCombustible();
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario para las naves 'Destructor Estelar' es: "+a+" Litros por Parsec");

        return a;
    }
}
