package video60;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado emp){
        this.empleados.add(emp);
    }

    public void mostrarSalarios() {
        for (Empleado emple : empleados) {
            System.out.println(emple.nombreCompleto()+ ": $"+ emple.getSalario());
        }
    }

    public Empleado empleadoConMasClientes() {
       int max= -1;
       Empleado elMayor= null;
        for (Empleado empleado : empleados) {
            if(empleado instanceof EmpleadoAComision){
                EmpleadoAComision eac= (EmpleadoAComision) empleado;//doucasting
                int can=  eac.getCantClienteCaptados();
                if(can > max){
                    max=can;
                    elMayor=empleado;// o eac es lo mismo porque guardo la referencia
                }
            }
        }
        return elMayor;
    }
    
    
}