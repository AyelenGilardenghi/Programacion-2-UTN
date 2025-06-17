
package video37.Enum;

public class Persona {
     private String nombre;
     private String apellido;
     //AL ser un enum ahora cambio el tipo del objeto 
    // private String nivelEstudio;
     private NivelEstudio nivelEstudio;
// ACA CAMBIO EL TIPO YA NO ES STRING , PONGO COMO SE LLAMA LA MNUEVA CLASE ENUM
   /* public Persona(String nombre, String apellido, String nivelEstudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelEstudio = nivelEstudio;
    }*/
    public Persona(String nombre, String apellido, NivelEstudio nivelEstudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelEstudio = nivelEstudio;
    }
//ACA AHORA EL GETER DEVUELVE UN TIPO NIVELESTUDIO
    //public String getNivelEstudio() {
    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    
    
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nivelEstudio=" + nivelEstudio + '}';
    }
     
    
    
    
     
}
