/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video62.Interfaces;

/**
 *
 * @author Gilar
 */
public class Persona implements EnviadorDeMensaje{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Yendo casa por casa  tocar tiembre para decir:  " +mensaje );
    }
    
}
