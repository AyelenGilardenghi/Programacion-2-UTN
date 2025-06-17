package video60;

import java.time.LocalDate;
import java.time.Year;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private int anioDeIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioDeIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioDeIngreso = anioDeIngreso;
    }
    
    public String nombreCompleto(){
        return nombre+" "+ apellido;
    }
    
    public int antiguedadEnAnios(){
        int anioActual= LocalDate.now().getYear();
        return anioActual- anioDeIngreso;
    }
    public abstract double getSalario();
    
    
}