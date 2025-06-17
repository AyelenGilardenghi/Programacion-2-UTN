/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video32.AtributosTipoColeccion;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Gilar
 */
public class Concesionaria {
    private String nombre;
    private ArrayList <Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    
    public void mostrarAutos(){
        if(autos.isEmpty()){
            System.out.println("no hay autos");
        }else
        {
            for (int i = 0; i < autos.size(); i++) {
                System.out.println(autos.get(i));
                
            }
        }
    }
                                                                                                                                                       public void agregarAutos(Auto a){
                                                                                  this.autos.add(a);
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
    
    
    
}
