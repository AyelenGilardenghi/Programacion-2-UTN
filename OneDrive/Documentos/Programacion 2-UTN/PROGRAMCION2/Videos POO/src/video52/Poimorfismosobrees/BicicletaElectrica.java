package video52.Poimorfismosobrees;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class BicicletaElectrica extends Vehiculo {

    public void prenderPantalla() {
        System.out.println("Pantalla prendida");
    }

    public void energizarMotor() {
        System.out.println(" motos listo");
    }
    
    @Override
     public void encender() {
        prenderPantalla();
        energizarMotor();
    }
}