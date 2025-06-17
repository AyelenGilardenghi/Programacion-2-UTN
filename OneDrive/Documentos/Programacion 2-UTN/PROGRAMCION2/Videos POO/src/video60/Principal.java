package video60;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Empresa emp = new Empresa();
        
        emp.agregarEmpleado(new EmpleadoConSalarioFijo(45000, "123", "Ana", "Lopez", 2021));
        emp.agregarEmpleado(new EmpleadoAComision(30000,  100 ,500, "1232", "Pepe", "Gomez",2021));
        emp.agregarEmpleado(new EmpleadoConSalarioFijo(50000, "123", "Leo", "Torres", 2019));
        emp.agregarEmpleado(new EmpleadoAComision(30000, 200, 100, "123", "Luis", "Gomez", 2017));
        emp.agregarEmpleado(new EmpleadoConSalarioFijo(100000, "123", "Maria", "Perez", 2014));
              
        emp.mostrarSalarios();
        
        System.out.println(emp.empleadoConMasClientes().nombreCompleto());
        
    }

}