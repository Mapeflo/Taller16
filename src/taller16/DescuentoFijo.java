/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author marya
 */
public class DescuentoFijo extends Descuento {
    
    double montoFijo;
    double precioOriginal;

    public DescuentoFijo(double montoFijo, double precioOriginal) {
        this.montoFijo = montoFijo;
        this.precioOriginal = precioOriginal;
    }
    
    @Override
    public void procesarDescuento(){
        double montoAplicado = Math.min(montoFijo, precioOriginal);
        System.out.println("Descuento fijo: $" + montoAplicado);
    }
}
