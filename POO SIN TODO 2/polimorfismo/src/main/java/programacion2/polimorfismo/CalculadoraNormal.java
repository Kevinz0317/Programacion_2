/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.polimorfismo;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class CalculadoraNormal implements InterfazCalculadora{

    @Override
    public int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2;
   }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    @Override
    public int dividirEnteros(int numero1, int numero2) {
        int resultado = 0;
        if(numero2 != 0){
            resultado = numero1 / numero2;
        }else{
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0. ");
        }
        return resultado;
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        return sqrt(numero1);
    }
}
