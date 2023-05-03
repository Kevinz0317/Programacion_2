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
public class Naves {
    protected int tipo;
    protected int numPersonas;
    protected int cantNaves;
    protected int nave;
    protected double combustible;
    

    public Naves() {
    }

    public Naves(int tipo, int numPersonas, int cantNaves, int nave, double combustible) {
        this.tipo = tipo;
        this.numPersonas = numPersonas;
        this.cantNaves = cantNaves;
        this.combustible = combustible;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }
    
    public int getNave() {
        return nave;
    }

    public void setNave(int nave) {
        this.nave = nave;
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
    
    public void pedirDatos(){
        int a, b, c;
        double d;
        
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             Digite el numero que corresponda al tipo de nave: 
                                                             1. Aerea
                                                             2. Terrestre
                                                             """));
            setTipo(a);
        }while(a <= 0 || a >= 3);
        
        do{
            b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas de la nave"));
            setNumPersonas(b);
        }while(b <= 0);
        
        do{
            c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de naves"));
            setCantNaves(c); 
        }while(c <= 0);
        
        do{
           d = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el consumo de combustible (En Litros por Parsec)"));
           setCombustible(d); 
        }while(d <= 0);
    }
    
    public void seleccionNave(){
        do{
            tipo = Integer.parseInt(JOptionPane.showInputDialog("""
                                                             Digite el numero que corresponda a la nave que desee conocer el combustible necesario para enfrentar al Imperio: 
                                                             1. Halcon Milenario
                                                             2. Destructor Estelar
                                                             3. Lanzadera Imperial
                                                             4. Supremacy
                                                             5. At-At
                                                             """));
            setNave(a);
        }while(a <= 0 || a >= 6);
    }
    
    public void imprimir(){
        if(getTipo() == 1){
            JOptionPane.showMessageDialog(null, "La nave escogida es Aerea");
        }else{
            JOptionPane.showMessageDialog(null, "La nave escogida es Terrestre");
        }
    JOptionPane.showMessageDialog(null, "La Cantidad de personas por nave son: "+getNumPersonas());
    JOptionPane.showMessageDialog(null, "El Consumo de combustible en litros por Parsec por nave son: "+getCombustible());
    JOptionPane.showMessageDialog(null, "La cantidad de Naves son: "+getCantNaves());
    }
}
