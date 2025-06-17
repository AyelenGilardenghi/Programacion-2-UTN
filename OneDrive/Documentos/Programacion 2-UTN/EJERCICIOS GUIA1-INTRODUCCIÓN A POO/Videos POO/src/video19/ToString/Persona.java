/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video19.ToString;

/**
 *
 * @author Gilar
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean tieneHijos;

    public Persona(String nombre, String apellido, int edad, boolean tieneHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tieneHijos = tieneHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public boolean tieneHijos(){
        return tieneHijos;
    }
   /* DE ESTA FOMA ME DEVUELVE ESTE MSJ Y NO SU REFERENCIA 
    @Override
     public String toString(){
         return "Soy una persona";
     }
    
    */
    // CLICK DERECHO INSERT CODE TOSTRING 
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", tieneHijos=" + tieneHijos + '}';
    }
    
}
