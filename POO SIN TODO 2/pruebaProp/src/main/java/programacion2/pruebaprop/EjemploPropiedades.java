/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2.pruebaprop;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/**
*
* @author Sang
*/
public class EjemploPropiedades {
/**
* metodo menuOpcion
* @throws IOException
*/
public void leerPropiedades() throws IOException{
 //declara el archivo de propiedades
FileReader archivo = null;
Properties p = new Properties();
//ruta relativa al archivo propiedades.txt
 String ruta = this.getClass().getResource("/programacion2.pruebaProp/propiedades.txt").getFile();
archivo = new FileReader(ruta);
p.load(archivo);
 //busca por nombre e imprime los valores del archivo de propiedades
 System.out.println(p.getProperty("JON"));
System.out.println(p.getProperty("ARYA"));
System.out.println(p.getProperty("KHAL"));
}
public static void main(String[] args) throws IOException {
EjemploPropiedades obj =new EjemploPropiedades();
obj.leerPropiedades();
}
}