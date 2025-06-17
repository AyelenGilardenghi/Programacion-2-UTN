/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video18.SobrecargadeMetodos;

/**
 *
 * @author Gilar
 */
public class Robot {
    private String nombre;

    public Robot(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        if(nombre !=null){
        this.nombre = nombre;
        }
    }
    
    public void saludar( String nombrePersona){
        System.out.println("Hola "+ nombrePersona+ ", soy "+ nombre);
    }
    //SOBRECARGA DE METODOS
  
    /*
    public void saludar(){
        System.out.println("Hola extraño, soy "+ nombre);
    }
    para no repetir codigo es practicamente igual al anterior
    delego llamando al anterior, ojo con no invocar al mismo y hacerlo recursivo
        */
    
    
    public void saludar(){
        saludar("extraño");
    }
    
    
}
