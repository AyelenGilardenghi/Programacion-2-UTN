/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video65.HerenciaEntreInterfaces;

/**
 *
 * @author Gilar
 */
public class AutoElectrico  implements  VehiculoRecargable{

 
    
    
    @Override
    public void recargar() {
        System.out.println("Recargand bateria  del Auto");
    }

    @Override
    public void acelerar() {
         System.out.println("Acelerando el motor  del Auto");
    }
    
}
