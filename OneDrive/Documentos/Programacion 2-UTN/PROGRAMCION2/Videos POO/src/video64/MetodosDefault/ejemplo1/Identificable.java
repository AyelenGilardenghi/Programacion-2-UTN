/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package video64.MetodosDefault.ejemplo1;

/**
 *
 * @author Gilar
 */
public interface Identificable {
    
    public default void mostrarIdentificacion() {
        System.out.println(hashCode());
    }
}
