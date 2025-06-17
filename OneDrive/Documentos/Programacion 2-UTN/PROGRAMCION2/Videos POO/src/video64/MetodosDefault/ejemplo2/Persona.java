/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video64.MetodosDefault.ejemplo2;

/**
 *
 * @author Gilar
 */
public class Persona implements Empleado, Estudiante {

    @Override
    public void realizarTarea() {
        Estudiante.super.realizarTarea();
        //Empleado.super.realizarTarea();
    }

   
}
