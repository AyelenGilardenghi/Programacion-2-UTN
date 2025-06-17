package video60;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class EmpleadoConSalarioFijo extends Empleado {
    private static final double PORC1=0.05;
    private static final double PORC2=0.1;
    private static final int ANIO1=2;
    private static final int ANIO2=5;
    private double sueldoBasico;

    public EmpleadoConSalarioFijo(double sueldoBasico, String DNI, String nombre, String apellido, int anioDeIngreso) {
        super(DNI, nombre, apellido, anioDeIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    
    
    
    
    private double porctAdicional() {
        int ant=antiguedadEnAnios();
        double porc=0;
        if(ant > ANIO2){
            porc=PORC2;
        }else if( ant >= ANIO1){
            porc=PORC1;
        }
        return porc;
    }

    @Override
    public double getSalario() {
        
        return sueldoBasico + sueldoBasico * porctAdicional();
    }

}