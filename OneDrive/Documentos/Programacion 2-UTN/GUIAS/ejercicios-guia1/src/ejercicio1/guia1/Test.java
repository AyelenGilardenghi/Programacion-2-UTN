/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.guia1;

/**
 *
 * @author Gilar
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona ("Ayelen", "Gilarednghi", 1991);
        p1.mostrarEstado();
        
        p1.getNombreCompleto();
        p1.mostrarEstado();
        p1.getEdadActual();
        p1.esMayorQue(50);
        p1.setNombre("CArla");
        p1.setApellido("Perez");
        p1.mostrarEstado();
        p1.setNombreYApellido("Julia", "Gimenez");
        p1.mostrarEstado();
    }
    
}
