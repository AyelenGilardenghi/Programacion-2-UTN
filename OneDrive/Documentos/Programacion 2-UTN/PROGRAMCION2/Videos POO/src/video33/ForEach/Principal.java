/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video33.ForEach;

import video32.AtributosTipoColeccion.*;

/**
 *
 * @author Gilar
 */
public class Principal {
    public static void main(String[] args) {
        Concesionaria c= new Concesionaria("AutoCar");
        
        c.mostrarAutos();
        
        c.agregarAutos(new Auto("1354", "verde"));
        c.agregarAutos(new Auto("42455", "azul"));
        c.agregarAutos(new Auto("5514", "gris"));
        
        c.mostrarAutos();

    }
}
