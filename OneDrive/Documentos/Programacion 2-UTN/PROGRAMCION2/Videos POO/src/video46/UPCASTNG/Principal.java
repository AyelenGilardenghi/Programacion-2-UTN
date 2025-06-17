
package video46.UPCASTNG;

import video45.ConstructorNoSeHereda.*;


public class Principal {
    public static void main(String[] args) {
       Concesionaria c = new Concesionaria();
       c.agregarVehiculo(new Auto(true, "MarcaFalsa", "AXZ", "ABC123"));
       c.agregarVehiculo(new Moto(20, "otraMarca", "XTZ", "234BCD"));
       
       /*
        Vehiculo v= new Vehiculo("MarcaFalsa", "RTY", "CVA586");
        Auto a= new Auto(true, "MarcaFalsa", "AXZ", "ABC123");
        Moto m = new Moto(20, "otraMarca", "XTZ", "234BCD");
       
       */
    }
}
