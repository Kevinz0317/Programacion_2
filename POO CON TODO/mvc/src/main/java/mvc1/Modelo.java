/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc1;

/**
 *
 * @author Kevin
 */
public class Modelo {
private Double moneda;
private Double cantidad;
private Double resultado;
public void setMoneda(Double moneda) {
 this.moneda = moneda;
}
public void setCantidad(Double cantidad) {
 this.cantidad = cantidad;
}
public Double getResultado() {
 return resultado;
}
public void convetirDolarAPeso() {
resultado = cantidad * moneda;
}
public void convertirPesoADolar() {
resultado = cantidad * moneda;
}
}
