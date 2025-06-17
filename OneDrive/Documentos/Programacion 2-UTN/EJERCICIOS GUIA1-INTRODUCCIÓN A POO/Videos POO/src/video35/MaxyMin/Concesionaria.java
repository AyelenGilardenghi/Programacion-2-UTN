/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video35.MaxyMin;


import video34.PromedioySumatoria.*;
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
    
   

    public int cantAutos(){
        return autos.size();
    }
  
    public Auto autoMasKmsRecorridos(){// auto poruqe quir devolver el auto  si solo quisiera ej solo pantente cambio el retorno
        Auto autoMax =null;// null para que vaya guardando quien es el maximo que vamos obteniendo
        int kmsMax=-1;// -1  porque es el valor minimo (no me queda claro porque no cero)
        for (Auto auto : autos) {
            if(auto.getKms()> kmsMax){
                kmsMax=auto.getKms();
                autoMax=auto;
            }
        }
        return autoMax;
    }
   /* private int maxKmsRecorridos(){
        int kmsMax=-1;
        for (Auto auto : autos) {
            if(auto.getKms()> kmsMax){
                kmsMax=auto.getKms();
            }
        }
        return kmsMax;
    }
    
    public ArrayList <Auto> autosMasKmsRecorridos(){
        ArrayList<Auto> listaDeMaximos =new ArrayList<>();
        int kmsMax=maxKmsRecorridos();
        for (Auto auto : autos) {
            if(auto.getKms() == kmsMax)
            listaDeMaximos.add(auto);
        }
        return listaDeMaximos;
    }
    */
    
        public ArrayList <Auto> autosMasKmsRecorridos(){
        ArrayList<Auto> listaDeMaximos =new ArrayList<>();
        int kmsMax=-1;
        for (Auto auto : autos) {
            if(auto.getKms() == kmsMax){
            listaDeMaximos.add(auto);
            }else if(auto.getKms()  > kmsMax){
                kmsMax = auto.getKms();
                listaDeMaximos.clear();
                listaDeMaximos.add(auto);
                }
        }
        return listaDeMaximos; 
    }
        
   public Auto autoMenKmsRecorridos(){
        Auto autoMin =null;// null para que vaya guardando en auto que vaya siendo el menor
        int kmsMin=Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if(auto.getKms()< kmsMin){
                kmsMin=auto.getKms();
                autoMin=auto;
            }
        }
        return autoMin;
    }
      public ArrayList <Auto> autosMenKmsRecorridos(){
        ArrayList<Auto> listaDeMinimos =new ArrayList<>();
        int kmsMin=Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if(auto.getKms() == kmsMin){
            listaDeMinimos.add(auto);
            }else if(auto.getKms()  < kmsMin){
                kmsMin=auto.getKms();
                listaDeMinimos.clear();
                listaDeMinimos.add(auto);
                }
        }
        return listaDeMinimos;
    }
    
}