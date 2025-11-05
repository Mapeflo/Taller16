/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author marya
 */
public class SMS extends Mensajero {
    
    @Override
    public void enviar(String mensaje, String destinatario){
        System.out.println("Enviando SMS");
        System.out.println("Para: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }  
}
