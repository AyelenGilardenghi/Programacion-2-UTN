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
    private  String password;
    
   

    public Password(String password) {
        this.password = password;
    }
    
    public Password() {
        this.password= generarAleatorio(MIN_LARGO_PASS_FUERTE);
    }
    public void setPassword(String password) {
        if(password!= null){
        this.password = password;
        }
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean esFuerte(){
        return  this.password.length()>= MIN_LARGO_PASS_FUERTE;
    }
    //¿ACA DEBERIA VALIDAR QUE SEA !=NULL TAMBIEN?CREO QUE NO PORQUE YA SEA EN SET O NUEVO VALOR ESTOY DICEINDO QUE NO SEA NULL
    
    public boolean nuevoValor(String nuevo){
        boolean nuevoValido= (nuevo != null && nuevo.length() >= MIN_NUEVO_PASS);
        if(nuevoValido){
            this.password = nuevo;
        }      
        return nuevoValido ;
    }
    /* 1)Llamaste a generarAleatorio(5).
       2) Como 5 es menor que 6, tu método hizo lo que le pediste: devolvió null.
       3)Ese null se lo pasaste directamente al método nuevoValor.
       4)Dentro de nuevoValor, Java intentó hacer nuevo.length(). Pero como nuevo es null (la nada misma), Java dice: "Che, no puedo medirle el largo a la nada" y ¡PUM!, tira el error.*/
    
    public String generarAleatorio(int cant){
        String passGenerado="";
        Random random =new Random();
        if(cant>= MIN_NUEVO_PASS){
            for(int i=0; i<cant;i++){
                passGenerado += random.nextInt(10);
            }
        }else{
            passGenerado= null;
        }
      return passGenerado;
    }
    // PODRIA HACER QUE LO QUE GENERA ALEATORIAMENTE SE GUARDE EN NUEVO VALOR PERO NO ES LO QUE PIDE EL EJER
}
