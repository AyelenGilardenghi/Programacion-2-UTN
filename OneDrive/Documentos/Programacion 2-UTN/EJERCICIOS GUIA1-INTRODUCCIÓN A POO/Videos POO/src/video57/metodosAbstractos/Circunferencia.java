package video57.metodosAbstractos;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Circunferencia extends FiguraGeometrica {

    private double radio;

    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    
    @Override
    public double perimetro() {
        // Método a resolver...
        return 2*this.radio *Math.PI;
    }

}