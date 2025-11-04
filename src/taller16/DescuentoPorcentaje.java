/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author marya
 */
public class DescuentoPorcentaje extends Descuento {

   double porcentaje;
   double precioOriginal;

    public DescuentoPorcentaje(double porcentaje, double precioOriginal) {
        this.porcentaje = porcentaje;
        this.precioOriginal = precioOriginal;
    }
    
   @Override
  public void procesarDescuento(){
      double monto = precioOriginal * (porcentaje/100);
       System.out.println("Descuento por " +porcentaje+ "%:" +monto+ "$");   
  }   
}
