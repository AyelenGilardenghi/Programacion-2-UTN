package video62.Interfaces;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

    public void valorRapido() {
        System.out.print("volando....");
    }


    @Override
    public void enviarMensaje(String mensaje) {
        valorRapido();
        System.out.println("Lanzando papel que dice: "+ mensaje);
    }

 

   
}