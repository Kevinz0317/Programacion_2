/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*
Un viajero intergaláctico requiere controlar su peso,para mantenerse en forma, pero su peso en la tierra 
es diferente al peso en el planeta que visite, haga un programa que lea un planeta del sistema solar 
y lea el peso del viajero en la tierra y muéstrele el peso que tendría en el planeta leído.
*/

package programacion2.grupal;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
        int opc = Integer.parseInt(JOptionPane.showInputDialog("""
                                                               Escoja el planeta en el que desea conocer su peso: 
                                                               1. Mercurio.
                                                               2. Venus.
                                                               3. Marte.
                                                               4. Jupiter.
                                                               5. Saturno.
                                                               6. Urano.
                                                               7. Neptuno"""));
        
        switch(opc){
            case 1: peso = peso * 0.37728153359845; 
                    JOptionPane.showMessageDialog(null, "Su peso en Mercurio es: "+peso);break;
            case 2: peso = peso * 0.90445600081574;
                    JOptionPane.showMessageDialog(null, "Su peso en Venus es: "+peso);break;
            case 3: peso = peso * 0.37840318140104;
                    JOptionPane.showMessageDialog(null, "Su peso en Marte es: "+peso);break;
            case 4: peso = peso * 2.5277862751096;
                    JOptionPane.showMessageDialog(null, "Su peso en Jupiter es: "+peso);break;
            case 5: peso = peso * 1.06454573264; 
                    JOptionPane.showMessageDialog(null, "Su peso en Saturno es: "+peso);break;
            case 6: peso = peso * 0.88610176404609;
                    JOptionPane.showMessageDialog(null, "Su peso en Urano es: "+peso);break;
            case 7: peso = peso * 1.136942999898; 
                    JOptionPane.showMessageDialog(null, "Su peso en Neptuno es: "+peso);break;
            default: JOptionPane.showMessageDialog(null, "Opción Incorrecta");break;
        }
    }
    
}
