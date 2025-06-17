/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video27.UsooDepndencia;

/**
 *
 * @author Gilar
 */
public class Principal {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Prueba", "Este es un\ntexto de prueba");
        Impresora imp= new Impresora();
        
        imp.encender();
        imp.imprimir(doc1);
    }
}
