package ejercicio_14.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public enum TipoDeCafe {

    EXPRESSO(0,TexturaLeche.NORMAL),
    LATTE(2,TexturaLeche.ESPUMOSA),
    LAGRIMA(3,TexturaLeche.LIQUIDA);
    private int puntosLeche;
    private TexturaLeche textura;

    private TipoDeCafe(int puntosLeche, TexturaLeche textura) {
        this.puntosLeche = puntosLeche;
        this.textura = textura;
    }
    
    

}