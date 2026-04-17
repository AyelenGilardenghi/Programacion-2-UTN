
package intro;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int legajo;
    private LocalDate fechaDeNacimiento;
    private double altura;
    private char genero;
    private boolean vivo;
    private Domicilio domicilio;
    private Persona padre;
    private Persona madre;
    
    // Constructor: Se llama igual que la clase.
    // No lleva tipo de retorno
    // Se ejecuta una vez por cada objeto (cuando se instancia)
    public Persona(String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }      

    public void mostrarDatos() {
        System.out.println( nombreCompleto() );
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public void setApellido(String apellido) {
        if (apellido.length() >= 3) {
            this.apellido = apellido;
        }        
    }

    public void setNombre(String nombre) {
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        }        
    }

    public String getNombre() {
        return nombre;
    }        

    private int autoDeterminarLegajo() {
        // Busque la manera de autoincrementar legajos ;)
        return 0;
    }
}
