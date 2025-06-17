/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video64.MetodosDefault.ejemplo1;

/**
 *
 * @author Gilar
 */
public class Principal {
        public static void main(String[] args) {
        Persona p = new Persona("1234");
        Reserva r = new Reserva();
        Automovil a = new Automovil();

        p.mostrarIdentificacion();
        r.mostrarIdentificacion();
        a.mostrarIdentificacion();
    }
}
