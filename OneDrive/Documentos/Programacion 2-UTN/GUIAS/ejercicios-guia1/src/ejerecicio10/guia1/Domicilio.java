/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerecicio10.guia1;

import ejercicio9.guia1.*;

/**
 *
 * @author Gilar
 */
public class Domicilio {
    private String calle;
    private int altura;
    private String barrio;

    public Domicilio(String calle, int altura, String barrio) {
        setCalle(calle);
        setAltura(altura);
        setBarrio(barrio);
    }

    public void setCalle(String calle) {
        if( calle != null){
            this.calle = calle;
        }
    }

    public void setAltura(int altura) {
        if(altura >= 0){
            this.altura = altura;
        }
    }

    public void setBarrio(String barrio) {
        if(barrio !=null){
            this.barrio = barrio;
        }
    }

    @Override
    public String toString() {
        return "Domicilio: " +  calle + ", " + altura + ", " + barrio+".";
    }
    
    

}
