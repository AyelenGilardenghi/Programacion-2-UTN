/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8.guia1;

/**
 *
 * @author Gilar
 */
public class Test {
    public static void main(String[] args) {
        Password pass1 = new Password("125adadasdadasda");
        Password pass2 = new Password();
        
        System.out.println("La Password es fuerte?: "+ pass1.esFuerte());
        System.out.println("Se asigno la nueva Password?: "+pass1.nuevoValor("afs"));
        
        String nuevoPass=pass1.generarAleatorio(5);
        pass1.nuevoValor(nuevoPass);
        System.out.println("Generar nueva Password : "+ pass1.getPassword());
        
        
        System.out.println("PASSWORD 2: "+ pass2.getPassword());
    }
            
}
