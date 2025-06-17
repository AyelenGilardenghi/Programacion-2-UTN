/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video39.EnumConAtriyMetod;

/**
 *
 * @author Gilar
 */
public class Principal {
    public static void main(String[] args) {
        Continente [] continentes= Continente.values();
        
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i]);
            System.out.println(continentes[i].densisdadPoblacion());
        }
    }
}
