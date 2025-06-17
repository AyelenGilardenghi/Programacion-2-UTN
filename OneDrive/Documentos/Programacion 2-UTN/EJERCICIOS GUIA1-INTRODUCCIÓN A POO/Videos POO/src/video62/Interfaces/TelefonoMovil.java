package video62.Interfaces;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TelefonoMovil extends Dispositivo implements EnviadorDeMensaje {

   
    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println("Conectando con la APi de WhatsApp para enviar el mensjae que dice: "+ mensaje);
    }

}