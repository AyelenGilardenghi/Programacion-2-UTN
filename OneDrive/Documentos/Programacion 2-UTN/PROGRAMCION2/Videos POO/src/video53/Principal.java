package video53;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
       ArrayList <Bicicleta> bicis= new ArrayList<>();
       
       bicis.add(new Bicicleta("fake", 20, 30));
       bicis.add(new BicicletaElectrica(250, "BicieE", 16, 65));
       
       bicis.add(new Bicicleta("Ultrabike", 28, 55));
       bicis.add(new BicicletaElectrica(350, "Eceta", 18, 43));

        Taller t = new Taller();
        System.out.println("Servicios posibles: "+ t.cantSeviciosPosibles(bicis));
    }

}