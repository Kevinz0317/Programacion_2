/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.alianzarebelde;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public final class HalconMilenario extends Naves implements INaves{
    
    @Override
    public void pedirDatos() {
        super.pedirDatos(); 
    }

    @Override
    public void imprimir() {
        
        JOptionPane.showMessageDialog(null, "Su nave es 'Halcon Milenario'");
        super.imprimir();
    }

    @Override
    public double consumoCombustibleParsec() {
        int a, b, d;
        double c, e;
        
        a = getNumPersonas();
        b = getCantNaves();
        c = getCombustible();
        
        d = a*b;
        JOptionPane.showMessageDialog(null, "La Cantidad de personas totales son: "+d);
        
        e = b * c;
        JOptionPane.showMessageDialog(null, "La Cantidad de combustible total necesario es: "+e);

        return e;
    }
}