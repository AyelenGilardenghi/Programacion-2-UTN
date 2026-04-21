/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_11.guia1;


import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Gilar
 */
public class CuentaBancaria {
    private static final int CANT_DIGITOS = 3;
    
    private String CBU;
    private TipoCuentaBancaria tipo;
    private double saldo;
    private Persona titular;
    private LocalDate fechaDeApertura;

    public CuentaBancaria(TipoCuentaBancaria tipo,Persona titular,LocalDate fechaDeApertura) {
        generarCBU();
        setTipo(tipo);
        this.saldo=0;// inicialmentee en 0 pero por defecto estaria en cero ya supongo
        setTitular(titular);
        setfechaDeApertura(fechaDeApertura);
   }

    public void setfechaDeApertura(LocalDate fechaDeApertura) {
        if(fechaDeApertura!=null && fechaDeApertura.isBefore(LocalDate.now())){
            this.fechaDeApertura = fechaDeApertura;
        }
    }

    public void setTitular(Persona titular) {
        if(titular != null){
            this.titular = titular;
        }
    }

    private void generarCBU() {
        Random random = new Random();
        this.CBU = ""; // Variable auxiliar para un solo return

        for (int i = 0; i < 22; i++) {
            // Genera un dígito entre 0 y 9
            int digito = random.nextInt(10); 
            // Lo concatena al String
            this.CBU += digito; 
        }

        
    
    }
    public void mostrarCBU(){
        System.out.println("CBU: "+ this.CBU);
    }
    
    public void setTipo(TipoCuentaBancaria tipo) {
       if( tipo != null){
        this.tipo = tipo;
       }
        
    }
    
    //OBTENER EL SALDO ACTUAL

    public double getSaldo() {
        return saldo;
    }
    //DEPOSITAR
    public void depositar(double dinero){
        saldo += dinero;
    }
    
  //EXTRAER
    public void extraer(double dinero){
        if(tipo == tipo.CUENTA_CORRIENTE ||dinero <= saldo){
            saldo -= dinero;     
        } else{
            System.out.println("NO HAY SUFICIENTE DINERO PARA EXTRAER SU SALDO ES DE: $"+ saldo);
        }   
    }
    
    private boolean validarCuentaParaSaldoNegativo(){
        return( tipo == tipo.CUENTA_CORRIENTE);
    }

    public String get3UltimosDelCBU() {
        String CBU = null;
        if(this.CBU.length() >= CANT_DIGITOS ){
        CBU= this.CBU.substring(this.CBU.length()- CANT_DIGITOS);
        }
        return CBU;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + ", fechaDeApertura=" + fechaDeApertura + '}';
    }
    
 
    
    
}
