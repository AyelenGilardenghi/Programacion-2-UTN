package video52.Poimorfismosobrees;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Avion extends Vehiculo {

    public void calefaccionarCarburador() {
        System.out.println("Carburador listo");
    }

    public void regularMezclaDeCombustible() {
        System.out.println("Mezcla Regulada");
    }

    public void inyectarCombustible() {
        System.out.println("Combustible inyectado");
    }

    public void masPasos() {
        System.out.println("Muchos pasos mas...");
    }
    
    @Override
     public void encender() {
        calefaccionarCarburador();
        regularMezclaDeCombustible();
        inyectarCombustible();
        masPasos();
    }
}