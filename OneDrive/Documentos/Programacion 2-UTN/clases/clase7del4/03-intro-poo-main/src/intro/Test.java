
package intro;

public class Test {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez");
        Persona p2 = new Persona("María", "Lopez");
        p1.mostrarDatos();
        p1.setNombre("Bu");
        p1.mostrarDatos();
        p1.setNombre("Juan");
        p1.mostrarDatos();
    }
    
}
