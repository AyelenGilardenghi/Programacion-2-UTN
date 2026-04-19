/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerecicio10.guia1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Gilar
 */
public class Test {
    public static void main(String[] args) {
        Domicilio domicilioP1 = new Domicilio("plaza", 818,"illa ortuzar");
        
        LocalDate fechaNacimientoC1 = LocalDate.of(1991, Month.MARCH, 7);
        LocalDate fechaAperturaC1 = LocalDate.of(2026, Month.JANUARY, 5);
        Persona p1= new Persona("Juan", "perez", fechaNacimientoC1, domicilioP1);
        CuentaBancaria c1= new CuentaBancaria(TipoCuentaBancaria.CAJA_DE_AHORRO, p1, fechaAperturaC1);
   
        System.out.println(c1.toString());
    }
}