/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video37.Enum;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Persona> listaPersonas;
    
    public Empresa(){
        this.listaPersonas = new ArrayList<>();              
    }
    
    public void agregarPersona(Persona p){
        this.listaPersonas.add(p);
        
    }
    
    public void mostrarPorNivel(NivelEstudio nivel){
        for(Persona p :  listaPersonas){
            if (p.getNivelEstudio() == nivel){
                System.out.println(p);
            }
        }
    }
   /* antes
    public void mostrarPorNivel(String nivel){
        for(Persona p :  listaPersonas){
            if (p.getNivelEstudio().equalsIgnoreCase (nivel){
                System.out.println(p);
            }
        }
    }*/
}
