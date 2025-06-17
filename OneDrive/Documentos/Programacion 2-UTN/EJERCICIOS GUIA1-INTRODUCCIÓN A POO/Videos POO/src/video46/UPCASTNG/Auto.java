
package video46.UPCASTNG;

import video45.ConstructorNoSeHereda.*;


public class Auto extends Vehiculo {
    private boolean tieneAire;
   

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }
    
    
    public void prenderAire(){
     if (tieneAire)
     {
         System.out.println("Encendiendo Aire....");
     }
    }

    
}
