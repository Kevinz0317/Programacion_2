package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author jdcan
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> ani = new ArrayList<Animal>();
        Animal can = new Animal();
        Animal can2 = new Animal();
        can.setColor("Azul");
        can2.setColor("Verde");
        ani.add(can);
        ani.add(can2);
        System.out.println(ani.get(0).getColor());
        System.out.println(ani.get(1).getColor());
    }
    
}
