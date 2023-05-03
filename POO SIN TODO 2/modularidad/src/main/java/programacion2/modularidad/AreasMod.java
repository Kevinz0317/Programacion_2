/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.modularidad;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class AreasMod {
    private double base;
    private double altura;
    private double radio;
    private double areaCuadrado;
    private double areaCirculo;
    private double PI = 3.1416;

    public AreasMod() {
    }

    public AreasMod(double base, double altura, double radio, double areaCuadrado, double areaCirculo, double PI) {
        this.base = 0.0;
        this.altura = 0.0;
        this.radio = 0.0;
        this.areaCuadrado = 0.0;
        this.areaCirculo = 0.0;
        this.PI = PI;
    }
    
    public void pedirDatos(){
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        altura = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite la altura "));
        radio = Double.parseDouble (JOptionPane.showInputDialog(null, "Digite el radio"));
    }
    
    public void calcularArea() {
        areaCuadrado = base * altura;
        areaCirculo = PI * (radio * radio);
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: "+ areaCuadrado);
        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: "+ areaCirculo);
    }
}
