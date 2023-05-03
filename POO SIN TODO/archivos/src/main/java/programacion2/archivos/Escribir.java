    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion2.archivos;
import java.io.*;
public class Escribir
{
 public static void main(String[] args)
 {
 try
 {
 FileWriter Archivo = new FileWriter("C:\\Users\\Kevin\\prueba.txt");
 PrintWriter pw = new PrintWriter(Archivo);
 pw.println("Prueba de escritura de archivos de texto en java, no sea sapo Cano");
 pw.close();
 } catch (Exception e)
 {
 e.printStackTrace();
 }
 }
}