package ejercicio2.guia1;


import ejercicio2.guia1.EstadoCivil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gilar
 */
public class Empleado {
   private static final double PLUS_HIJO = 0.03; 
   private static final double PORC_SOLTERO= 0.04; 
   private static final double PORC_TOPE = 0.1;
  
   
           
   private String DNI;
   private String nombre;
   private String apellido;
   private double salarioBase;
   private EstadoCivil estadoCivil;
   private int cant_hijos;

    public Empleado(String DNI, String nombre, String apellido, double salarioBase, EstadoCivil estadoCivil, int cant_hijos) {
        setDNI(DNI);
        setNombre(nombre);
        setApellido(apellido);
        setSalarioBase(salarioBase);
        setEstadoCivil(estadoCivil);
        setCant_hijos(cant_hijos);
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null){
        this.apellido = apellido;
 
        }
    }
    
    public void setSalarioBase(double salarioBase) {
       
        this.salarioBase = salarioBase;
    
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        if(estadoCivil != null){
            this.estadoCivil = estadoCivil;
        }
        
    }

    public void setCant_hijos(int cant_hijos) {
        if(cant_hijos>= 0){
        this.cant_hijos = cant_hijos;
        }
    }
   
   private double porcentajePorHijos(){
       double porcentaje;
       if(cant_hijos * PLUS_HIJO <= PORC_TOPE ){
           porcentaje=cant_hijos * PLUS_HIJO;
       }else
       {
           porcentaje= PORC_TOPE;
       }
       return porcentaje;
   } 
    
   private double salarioConPlus(){
    return salarioBase + salarioBase *porcentajePorHijos();
   }
    
   private double salarioSoltero(){
       return salarioConPlus()- salarioConPlus()* PORC_SOLTERO;
   }
    
    
    
   public  double getSalarioFinal(){
       double salarioFinal;
       if(estadoCivil == EstadoCivil.SOLTERO){
            salarioFinal=salarioSoltero();
        }else{
            salarioFinal=salarioConPlus();
        }
       return salarioFinal;
    }
  
   
   
}
