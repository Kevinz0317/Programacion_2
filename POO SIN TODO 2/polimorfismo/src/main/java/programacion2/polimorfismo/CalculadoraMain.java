/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class CalculadoraMain {

    public static void main(String[] args) {
        
        int opc = 0;
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               Ingrese una opcion: 
                                                               1. Calculadora Normal.
                                                               2. Calculadora Especial. 
                                                               3. Salir"""));
            if (opc == 1){
                int a,b;
                
                ClienteCalculadoraNormal ccn = new ClienteCalculadoraNormal();
                CalculadoraNormal cn = new CalculadoraNormal();
                
                a = ccn.capturarNumero1();
                b = ccn.capturarNumero2();
                
                ccn.imprimir("La Suma es: "+cn.sumarEnteros(a, b));
                ccn.imprimir("La Resta es: "+cn.restarEnteros(a, b));
                ccn.imprimir("La Multiplicacion es: "+cn.multiplicarEnteros(a, b));
                ccn.imprimir("La Division es: "+cn.dividirEnteros(a, b));
                ccn.imprimir("La Raiz Cuadrada es (Del numero 1): "+cn.calcularRaizCuadrada(a));
                break;
            }else{
                if(opc == 2){
                    int a,b;
                
                    ClienteCalculadoraEspecial cce = new ClienteCalculadoraEspecial();
                    CalculadoraEspecial ce = new CalculadoraEspecial();
                
                    a = cce.capturarNumero1();
                    b = cce.capturarNumero2();
                
                    cce.imprimir("La Suma es: "+ce.sumarEnteros(a, b));
                    cce.imprimir("La Resta es: "+ce.restarEnteros(a, b));
                    cce.imprimir("La Multiplicacion es: "+ce.multiplicarEnteros(a, b));
                    cce.imprimir("La Division es: "+ce.dividirEnteros(a, b));
                    cce.imprimir("La Raiz Cuadrada es (Del numero 1): "+ce.calcularRaizCuadrada(a));
                    break;
                }else{
                    if(opc == 3){
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion Invalida, Error en la digitacion. ");
                    }
                }
            }
        }while (opc <= 1 || opc >= 3);
        
        
    }
}
