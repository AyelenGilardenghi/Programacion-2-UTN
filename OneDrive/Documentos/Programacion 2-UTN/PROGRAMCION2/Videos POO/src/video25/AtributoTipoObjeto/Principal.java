/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video25.AtributoTipoObjeto;

/**
 *
 * @author Gilar
 */
public class Principal {
    public static void main(String[] args) {
        Motor m = new Motor("1235", 1.6, "Nafta");
        Auto auto = new Auto("ABC123", "fiat", 346252, "rojo",m);
        
        System.out.println(m);
        System.out.println(auto);
        m.setCilindrada(2.3);
        
        System.out.println(" ");
        System.out.println(m);
        System.out.println(auto);
    }
}
