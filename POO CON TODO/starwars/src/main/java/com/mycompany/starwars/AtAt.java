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
public final class AtAt extends Naves implements INaves{

    public AtAt() {
        setTipo("At-At");
    }
    
    @Override
    public void pedirDatos() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos de la nave 'At-At'");
        super.pedirDatos(); 
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Su nave es 'At-At'");
        super.imprimir();
    }

    @Override
    public double consumoCombustibleParsec() {
        double a;
      
        a = getCantNaves() * (getCombustible() - getCombustible() * 0.25);
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario para las naves 'At-At' es: "+a+" Litros por Parsec");

        return a;
    }
}