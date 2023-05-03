/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.encapsulamiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class ObjetoCalculadora{
    //Se declaran las variables
    private double numero1;
    private double numero2;
    private double resultado;
    //Se crea el constructor
    public ObjetoCalculadora() {
        super();
    }

    public void setNumero1(double numero1) {
        if (numero1 > 1)this.numero1 = numero1;
    }
    public double getNumero1() {
        return numero1;
    }

    public void setNumero2(double numero2) {
        if(numero2 > 1)this.numero2 = numero2;
    }

    public double getNumero2() {
        return numero2;
    }
    
    //Se crean los metodos para calcular opercaciones (Suma, Resta, Multiplicacion y Division)
    public double calcularSuma (){
        return (numero1 + numero2);
    }
    public double calcularResta (){
        return (numero1 - numero2);
    }
    public double calcularMultiplicacion (){
        return (numero1 * numero2);
    }
    public double calcularDivision (){
        resultado = 0;
        if (numero2 != 0){
            resultado = numero1 / numero2;
        }else{
            JOptionPane.showMessageDialog(null, "Error, no se puede dividir por 0. ");
        }
        return (resultado);
    }
    public void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}