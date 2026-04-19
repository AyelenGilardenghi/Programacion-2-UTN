/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.guia1;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setMes(int mes) {
        if(mes >= 1 && mes <=12){
        this.mes = mes;
        }
    }
    public void setDia(int dia) {
        if(dia>=1 && dia<= obtenerMaxDias()){
           this.dia = dia;
        }else{
            System.out.println("El dia ingresado no es valido para el mes "+ mes);
            }
    }
    
    private int  obtenerMaxDias(){
        int maximo;
    
        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            maximo = 30; // Meses de 30 días
        } else if (this.mes == 2) {
            maximo = 28; // Febrero
        } else {
            maximo = 31; // Todos los demás
        }
        return maximo;
    }
    
    public String getFechaFormateada() {
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }
   
    
    public void esNavidad(){
      
        if(dia!= 25 || mes!=12){ 
            System.out.print("NO ");
        }
        System.out.println("ES NAVIDAD");
    }

    }
   
    
   
   

    
    
   
    
    
    

