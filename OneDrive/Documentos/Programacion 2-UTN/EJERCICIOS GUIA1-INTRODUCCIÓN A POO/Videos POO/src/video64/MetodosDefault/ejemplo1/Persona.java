/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video64.MetodosDefault.ejemplo1;

/**
 *
 * @author Gilar
 */
public class  Persona implements Identificable {

    private String DNI;

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public void mostrarIdentificacion() {
        System.out.println(this.DNI);
    }
}
