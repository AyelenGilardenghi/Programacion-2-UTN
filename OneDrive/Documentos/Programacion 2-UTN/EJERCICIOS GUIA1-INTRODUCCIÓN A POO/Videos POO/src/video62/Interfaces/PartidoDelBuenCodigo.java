package video62.Interfaces;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PartidoDelBuenCodigo {

    private ArrayList<EnviadorDeMensaje> mensajeros;
    // una lista qu epermite guardar referencias a enviadores de memsja
    //
    
    public PartidoDelBuenCodigo() {
        this.mensajeros = new ArrayList<>();
    }
    
    public void agregarMensajero(EnviadorDeMensaje mensajero){
        this.mensajeros.add(mensajero);
        
    }
    
    public void hacerCampania() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el partido del buen codigo");
        }
    }

  
    
    

}