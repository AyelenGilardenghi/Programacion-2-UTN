/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerecicio10.guia1;



import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Gilar
 */
public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Domicilio domicilio;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, Domicilio domicilio) {
        setNombre(nombre);
        setApellido(apellido);
        setFechaNacimiento(fechaNacimiento);
        setDomicilio(domicilio);
    }

    public void setDomicilio(Domicilio domicilio) {
        if(domicilio != null){
            this.domicilio = domicilio;
        }
    }
   

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if(fechaNacimiento != null && fechaNacimiento.isBefore(LocalDate.now())){
            this.fechaNacimiento = fechaNacimiento;
        }
    }
   
    //CAMBIAR NOMBRE
    public void setNombre(String nombre) {
       if( nombre!= null && nombre.length() >= 3){// agregar el largo  y primero valido el null luego el largo
           this.nombre = nombre;
       }
    }
    //CAMBIAR APELLIDO
    public void setApellido(String apellido) {
         if( apellido != null && nombre.length() >= 2){
        this.apellido = apellido;
         }
    }
    
    
    //CAMBIAR NOMBRE Y APELLIDO
    public void setNombreYApellido(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
        //NOOOO REPITAS CODIGOOOOO
        /*if(nombre !=null && apellido != null){
        this.nombre= nombre;
        this.apellido=apellido;*/
    }
    
    //DEVOLVER NOMBRE COMPLETO
    public String getNombreCompleto(){
        return nombre+" "+ apellido;
    }
    //MOSTRAR SU ESTADO EN LA CONSOLA O USAR EL TOTRING?  uso el toString para mostrar estado
    public void mostrarEstado(){
      //  System.out.println(nombre+" "+ apellido+" "+anioNacimiento);
      
        System.out.println(toString());
    }
    //OBTENER SU EDAD ACTUAL
    public int getEdadActual(){
        return LocalDate.now().getYear()- this.fechaNacimiento.getYear(); //bien
    }
    /* EDAD ACTUAL SI YA LA CUMPLI O NO
    import java.time.Period; // Necesitás este import
    public int getEdadActual2() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }*/
public int getEdadActual2() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }
    //SABER SI ES MAYOR QUE UNA EDAD DADA
    private boolean calculoMayorQue(int edad ){
        return getEdadActual()> edad;
    }
   
    public void esMayorQue( int edad){
        if(!calculoMayorQue(edad)){
            System.out.print("NO ");
        }
       System.out.println("ES MAYOR DE " + edad+ " AÑOS.");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + '}';
    }

    
        
    
    
}