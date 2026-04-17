/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.guia1;

import ejercicio3.guia1.CuentaBancaria;
import ejercicio3.guia1.TipoCuentaBancaria;

/**
 *
 * @author Gilar
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaBancaria cuenta1 = new CuentaBancaria( TipoCuentaBancaria.CAJA_DE_AHORRO );
       CuentaBancaria cuenta2 = new CuentaBancaria( TipoCuentaBancaria.CUENTA_CORRIENTE );
       
       System.out.println("saldo: "+ cuenta1.getSaldo());
      
       
       cuenta1.depositar(100);
       System.out.println("saldo: "+ cuenta1.getSaldo());
       
       cuenta1.extraer(50);
         System.out.println("saldo: "+ cuenta1.getSaldo());
       
         
        System.out.println("Ultimos 3 digitos del CBU: " +   cuenta1.get3UltimosDelCBU());
        
        cuenta1.mostrarCBU();
        cuenta2.mostrarCBU();
       
    }
    
}
