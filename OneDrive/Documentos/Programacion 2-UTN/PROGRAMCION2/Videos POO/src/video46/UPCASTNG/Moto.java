/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video46.UPCASTNG;

import video45.ConstructorNoSeHereda.*;
import video43.HerenciayPrivate.*;
import video42.HerenciaExtends.*;

/**
 *
 * @author Gilar
 */
public class Moto extends Vehiculo{
    private int anchoDeManubrio;

    public Moto(int anchoDeManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }
    
    
    public void hacerWheelie(){
        
        System.out.println("haciendo wheelie");
    }
    
}
