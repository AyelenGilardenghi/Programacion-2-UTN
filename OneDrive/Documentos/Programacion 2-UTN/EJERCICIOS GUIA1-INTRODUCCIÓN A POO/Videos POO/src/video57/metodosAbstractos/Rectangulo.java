package video57.metodosAbstractos;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
   public double perimetro() {
        // Método a resolver...
        return 2*this.base+2*this.altura;
    }

 

}