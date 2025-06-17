/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video34.PromedioySumatoria;


import java.util.ArrayList;


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
    
    public void agregarAutos(Auto a){

        this.autos.add(a);
    }
    
    public int sumatoriaKmsRecoridos(){
        int acu=0;
        for (Auto a : autos) {
            acu += a.getKms();
        }
        return acu;
    }

    public int cantAutos(){
        return autos.size();
    }
    /*
    public double promedioKmsRecorrido(){
       // return sumatoriaKmsRecorridos/autos.size();
        return (double)sumatoriaKmsRecoridos() /cantAutos();
    }*/
    //MEJORADO POR SI NO HAY ELEMENTO EN LA LISTA LO VALIDO
    /*public double promedioKmsRecorrido(){
        double promedio =0;
        if(cantAutos()> 0){
            promedio= (double)sumatoriaKmsRecoridos()/cantAutos();
        }
        return promedio;
    }    
  */
    //REESCRITO PPOR EL OPREADOR TERNARIO
    public double promedioKmsRecorrido(){
        return (cantAutos()>0 ?(double)sumatoriaKmsRecoridos()/cantAutos():0);
    }

    
    
                                                                         
                                                                         
}