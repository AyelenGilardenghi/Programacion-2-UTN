/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video30.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Gilar
 */
public class Principal {
    public static void main(String[] args) {
         Auto a1= new Auto("abc123", "azul");
      //  Auto a2= new Auto("def123", "verde");
        //Auto a3= new Auto("abc456", "rojo");
    
    ArrayList <Auto>  misAutos= new ArrayList();
    
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        System.out.println("**************************");
        //OJO SI PONGO 2 VECES EL MISMO  AUTO, N TENGO UN CLON SINO DOS REFERENCIAS APUNTANDO A UN MISMO AUTO
        misAutos.add(a1);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        System.out.println("**************************");
        
        misAutos.add(new Auto("def123", "verde"));
        System.out.println(misAutos.size());// TAMAÑO
        System.out.println(misAutos);// VEO LA LISTA
        System.out.println("**************************");
        
        misAutos.add(new Auto("abc456", "rojo"));
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        
        //OBTENER UN AUTO CONOCIENDO SU INDICE
        System.out.println("El 2° auto es: "+ misAutos.get(1));
        
        
        //MOSTRAR TODOS LOS AUTOS DE LA LISTA
        System.out.println("**************************");
        System.out.println("Mostrar todos los elementos de la lista");
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion "+i+" es "+ misAutos.get(i));
        }
        //BORRAR UN  ELEMENT DE LA LISTA 
        System.out.println("**************************");
        misAutos.remove(0);
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        
        
        
    }
}
