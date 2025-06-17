package video52.Poimorfismosobrees;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
       // probar(new Vehiculo());
        probar(new Avion());
        System.out.println("//////////////////");
        probar(new BicicletaElectrica());
    }
    public static void probar(Vehiculo v){
        v.encender();
    }
}