/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video36.BusquedaEnColeccion;



/**
 *
 * @author Gilar
 */
public class Principal {
    public static void main(String[] args) {
        Concesionaria c= new Concesionaria("AutoCar");
        
       // c.mostrarAutos();
        
        c.agregarAutos(new Auto("ABC124", "violeta",4000));
        c.agregarAutos(new Auto("42455", "azul",2000));
        c.agregarAutos(new Auto("a1354", "azul",1003));
        c.agregarAutos(new Auto("5514", "gris",3000));
        c.agregarAutos(new Auto("ABC123", "Negro",4000));
        c.agregarAutos(new Auto("1354", "verde",1003));
        c.agregarAutos(new Auto("ABC124", "violeta",4000));
        
        Auto a =c.buscarAuto("AbC123");
        System.out.println("Se encontro auto:" + a);


    }
}
