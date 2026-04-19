/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9.guia1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Gilar
 */
public class Test {
    public static void main(String[] args) {
        Domicilio dom1 = new Domicilio("Av. Rivadavia", 4500, "Caballito");
        LocalDate fechaNacimiento = LocalDate.of(1991, Month.MARCH, 7);
        Persona p1= new Persona("ayelen", "gilardenghi", fechaNacimiento,dom1);
        
        System.out.println( p1.getNombreCompleto());
        p1.mostrarEstado();
        System.out.println("Edad actual: "+ p1.getEdadActual());
        System.out.println("Edad actual con Paroid: "+ p1.getEdadActual2());
        p1.esMayorQue(34);
        
    }
 
   
}
