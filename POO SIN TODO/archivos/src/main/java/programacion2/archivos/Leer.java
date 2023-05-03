/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2.archivos;

import java.io.*;
class Leer {
public static void main(String [] arg) {
File archivo = null;
 FileReader fr = null;
try {
 archivo = new File ("C:\\Users\\Kevin\\prueba2.txt");
String linea;
fr = new FileReader (archivo);
BufferedReader br = new BufferedReader(fr);
while((linea=br.readLine
())!=null)
System.out.println(linea);
}
catch(IOException e){
 System.out.println(e);
 }finally{
 try{
 if( fr != null){
 fr.close();
 }
 }catch (IOException e){
 System.out.println(e);
 }
 }
}
}

