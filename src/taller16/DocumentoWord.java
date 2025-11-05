/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author marya
 */
public class DocumentoWord extends Documento {
    
    String contenido;

    public DocumentoWord(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public void exportar(){
        System.out.println("Exportando a Word: " + contenido);   
    } 
}
