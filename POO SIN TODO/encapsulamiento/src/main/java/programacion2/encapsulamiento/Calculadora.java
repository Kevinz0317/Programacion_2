/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.encapsulamiento;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin
 */

public class Calculadora {
    
    public static void main(String[] args){
        //Se crea un objeto
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        //Se asignan valores a los atributos de la clase
        calculadora.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite el Numero 1")));
        calculadora.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite el Numero 2")));
        if(calculadora.getNumero1() >= 1 && calculadora.getNumero2() >= 1){
            //Se ejecutan las operaciones
            //Suma
            calculadora.imprimir("El resultado de la suma es: " + calculadora.calcularSuma());
            //Resta
            calculadora.imprimir("El resultado de la resta es: " + calculadora.calcularResta());
            //Multiplicacion
            calculadora.imprimir("El resultado de la multiplicacion es: " + calculadora.calcularMultiplicacion());
            //División
            calculadora.imprimir("El resultado de la division es: " + calculadora.calcularDivision());
        }else{
            calculadora.imprimir("Error, solo se pueden ingresar valores mayores a 0. ");
        }     
    }
}