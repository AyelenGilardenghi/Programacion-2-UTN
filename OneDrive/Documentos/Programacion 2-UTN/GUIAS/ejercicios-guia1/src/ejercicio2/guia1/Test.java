package ejercicio2.guia1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Gilar
 */
public class Test {
    public static void main(String[] args) {
      Empleado emp1= new Empleado("35902160", "Ayelen", "Apellido", 800000, EstadoCivil.SOLTERO, 4);
   
        System.out.println("El salario final es: $" + emp1.getSalarioFinal());
    }
    
}
