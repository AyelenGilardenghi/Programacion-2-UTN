package video60;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class EmpleadoAComision extends Empleado {

    private  double salarioMin ;
    private int cantClienteCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(double salarioMin, int cantClienteCaptados, double montoPorCliente, String DNI, String nombre, String apellido, int anioDeIngreso) {
        super(DNI, nombre, apellido, anioDeIngreso);
        this.salarioMin = salarioMin;
        this.cantClienteCaptados = cantClienteCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getCantClienteCaptados() {
        return cantClienteCaptados;
    }

    
  
    @Override
    public double getSalario() {
        double sal = montoPorCliente *cantClienteCaptados;
        if (sal< salarioMin)
        {
            sal=salarioMin;
        }
        return sal;
    }

}