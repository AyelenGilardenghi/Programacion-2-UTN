/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Gilar
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = input.nextInt();
        System.out.println("El num");
        esPrimo(num);
        
        
    }// esto funciona pero no es bueno
  /* public static boolean esPrimo( int numero){
        boolean esPrimo= true;
        if( numero <=1){
            esPrimo= false ;
        }
        //con while ya que la condicion no depende de un contador
        
        for( int i=2 ;i*i<= numero; i++){
            if(numero % i== 0)
                esPrimo=false;
        }
        return esPrimo;
    }*/
    
     public static boolean esPrimo( int numero){
        int contDivisores=2;
        int cont=2;
        
        while(cont < Math.sqrt(numero)){
            if(numero %cont== 0)
        }
     }
}
 