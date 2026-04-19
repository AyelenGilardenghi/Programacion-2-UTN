/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7.guia1;

/**
 *
 * @author Gilar
 */
public class Robot {
    private String nombre;

    public Robot(String nombre) {
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ getNombre()+ "¿En que puedo ayudarte?");
    }
    
     public void saludar(Persona persona){
        System.out.println("Hola " +persona.getNombreCompleto()+", mi nombre es "+ getNombre()+ "¿En que puedo ayudarte?");
    }
}
