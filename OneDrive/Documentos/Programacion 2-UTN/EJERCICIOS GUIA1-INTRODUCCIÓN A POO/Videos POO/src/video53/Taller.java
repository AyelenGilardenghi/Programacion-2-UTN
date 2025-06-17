package video53;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Taller {
/*
    Solo se le brinda servicios aquellas icicletas de menos de 50 kms recoridos y bicicletas electricas de asta 40 ww y menos de 50 kms recorridos , como el resto de las bicicletas
    */
    public int cantSeviciosPosibles(ArrayList<Bicicleta> bicis) {
        int contador=0;
        for (Bicicleta bici : bicis) {
            if(bici.cumpleRequisitos()){
                contador++;
            }
            
        }
        return contador;
    }

}