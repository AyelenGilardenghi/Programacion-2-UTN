/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8.guia1;

import java.util.Random;

/**
 *
 * @author Gilar
 */
public class Password {
    private static final int MIN_LARGO_PASS_FUERTE=8;
    private static final int MIN_NUEVO_PASS=6;
    private  String valor;
    
     public Password(int longuitud) {
        this.valor= generarAleatorio(longuitud);
    }

    public Password(String password) {
        this.valor = password;
    }
 
  
    
    public void setPassword(String password) {
        if(password!= null){
        this.valor = password;
        }
    }
    
    public String getPassword() {
        return valor;
    }
    
    public boolean esFuerte(){
        return  this.valor.length()>= MIN_LARGO_PASS_FUERTE;
    }
    
    
    public boolean nuevoValor(String nuevo){
        boolean nuevoValido= (nuevo != null && nuevo.length() >= MIN_NUEVO_PASS);
        if(nuevoValido){
            this.valor = nuevo;
        }      
        return nuevoValido ;
    }
  
    
    private String generarAleatorio(int cant){
        String passGenerado="";
        Random random =new Random();
        if( cant>= MIN_NUEVO_PASS){
            for(int i=0; i<cant;i++){
                //passGenerado += random.nextInt(10);
                 char caracter=( char)random.nextInt(32,125);
                passGenerado += caracter;
            }
        }else{
            passGenerado= null;
        }
      return passGenerado;
    }
} 
