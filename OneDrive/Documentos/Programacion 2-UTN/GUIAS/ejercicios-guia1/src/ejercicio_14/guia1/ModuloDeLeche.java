package ejercicio_14.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ModuloDeLeche {
    private static final int MIN_LIQUIDO=0;
    private static final int MAX_LIQUIDO=5;
    
    private int medidorDeLeche;
    private TexturaLeche textura;

    public ModuloDeLeche(int medidorDeLeche, TexturaLeche textura) {
        this.medidorDeLeche = 0;
        this.textura = textura.LIQUIDA;
    }

    public void recargarMedidorLeche(){
        if(medidorDeLeche== MIN_LIQUIDO){
            medidorDeLeche=MAX_LIQUIDO;
        }else{
            medidorDeLeche+= MAX_LIQUIDO - medidorDeLeche;
        }
               
    }

    public int getMedidorDeLeche() {
        return medidorDeLeche;
    }
}