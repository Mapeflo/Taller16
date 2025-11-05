/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

/**
 *
 * @author marya
 */
public class DocumentoPDF extends Documento{
    
    String contenido;

    public DocumentoPDF(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public void exportar(){
        System.out.println("Exportando a PDF: " + contenido); 
    } 
}
