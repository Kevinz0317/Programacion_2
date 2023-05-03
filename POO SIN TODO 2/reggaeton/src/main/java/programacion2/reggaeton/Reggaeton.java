/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.reggaeton;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */

public class Reggaeton {
    
    public static void palabras(){
        
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra de reggaeton: ");
        
        palabra = palabra.toLowerCase();
        
        if("garete".equals(palabra)){
            JOptionPane.showMessageDialog(null, "Palabra que se utiliza en la expresión coloquial irse al garete, que significa ‘fracasar, estropear o malograrse");      
        }else{
            if("corillo".equals(palabra)){
                JOptionPane.showMessageDialog(null, "Grupo de jóvenes alegres y alborotosos.");
            }else{
                if("pichaera".equals(palabra)){
                    JOptionPane.showMessageDialog(null, "Es el término empleado para evadir a alguien o algo, aunque hay casos que significa literalmente no reconocer por completo su existencia. Cuando uno de estos artistas dice “picheo” se está refiriendo a ignorar a todas las chicas que quieren cortejarlo.");
                }else{
                    if("josear".equals(palabra)){
                        JOptionPane.showMessageDialog(null, "Es lo que los adultos llamarian 'trapichear'. La palabra tiene su origen en el ingles hustle (es decir, 'buscarse la vida'");
                    }else{
                        if("maquinear".equals(palabra)){
                            JOptionPane.showMessageDialog(null, "Se refiere a imaginar o pensar. ");
                        }else{
                            if("janguear".equals(palabra)){
                                JOptionPane.showMessageDialog(null, "Viene del termino anglosajon 'hanging out', que se traduce como 'pasar el rato' de forma agradable");
                            }else{
                                if("frontear".equals(palabra)){
                                    JOptionPane.showMessageDialog(null, "Se refiere a la acción de actuar, hablar o tratar a otros con presuncion y con cierta actitud de superioridad.");
                                }else{
                                    if("bicho".equals(palabra)){
                                        JOptionPane.showMessageDialog(null, "Se refiere al aparato reproductor masculino.");
                                    }else{
                                        if("bellaquear".equals(palabra)){
                                            JOptionPane.showMessageDialog(null, "Este termino hace alusión al juego sexual. ");
                                        }else{
                                            if("feca".equals(palabra)){
                                                JOptionPane.showMessageDialog(null, "Feca viene a ser una mentira, y fequero es alguien que alardea lo que no tiene. ");
                                            }else{
                                                JOptionPane.showMessageDialog(null, "La palabra ingresada no se encuentra en el diccionario.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        palabras();
    }
}
