/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.starwars;

import javax.swing.JOptionPane;

public class AlianzaRebelde {

    public static void main(String[] args) {
        
        double combTotal;
        
        Naves nav = new Naves();
        nav.pedirParsecs();
        
        HalconMilenario hm = new HalconMilenario();
        
        hm.pedirDatos();
        hm.imprimir();
        hm.consumoCombustibleParsec();
            
        DestructorEstelar de = new DestructorEstelar();
        
        de.pedirDatos();
        de.imprimir();
        de.consumoCombustibleParsec();
           
        LanzaderaImperial li = new LanzaderaImperial();
                
        li.pedirDatos();
        li.imprimir();
        li.consumoCombustibleParsec();
            
        Supremacy su = new Supremacy();
        
        su.pedirDatos();
        su.imprimir();
        su.consumoCombustibleParsec();
       
        AtAt at = new AtAt();
       
        at.pedirDatos();
        at.imprimir();
        at.consumoCombustibleParsec();
        
        combTotal = hm.getCantNaves() * hm.getCombustible() * nav.getParsecs() + de.getCantNaves() * de.getCombustible() * nav.getParsecs() + li.getCantNaves() * li.getCombustible() * nav.getParsecs();
        combTotal += su.getCantNaves() * (su.getCombustible() + (su.getNavesTrans() * su.getCombustible() * 0.1) * nav.getParsecs());
        combTotal += at.getCantNaves() * (at.getCombustible() - at.getCombustible() * 0.25) * nav.getParsecs();
        
        JOptionPane.showMessageDialog(null, "El combustible Total destinado para la guerra es: "+combTotal+" Litros");
       
    }   
}