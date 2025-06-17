package video57.metodosAbstractos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
       ArrayList <FiguraGeometrica> figuras = new ArrayList<>();
       figuras.add(new Rectangulo (2, 2, "Verde"));
       figuras.add(new Circunferencia (1, "Roja"));
       figuras.add(new Rectangulo (1, 2, "Amarillo"));
       figuras.add(new Circunferencia (2, "Azul"));
       figuras.add(new TrianguloEquilatero(4,"Naranja"));
       
       
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.perimetro());
            
        }
    }

}