/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video64.MetodosDefault.ejemplo2;

/**
 *
 * @author Gilar
 */
public interface Empleado {
      public default void realizarTarea() {
        System.out.println("Realizo tarea porque me pagan por ello");
    }
}
