/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video57.metodosAbstractos;

/**
 *
 * @author Gilar
 */
public class TrianguloEquilatero  extends FiguraGeometrica{
    private double lado;

    public TrianguloEquilatero(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    

    @Override
    public double perimetro() {
       return 3*lado;
    }
}
