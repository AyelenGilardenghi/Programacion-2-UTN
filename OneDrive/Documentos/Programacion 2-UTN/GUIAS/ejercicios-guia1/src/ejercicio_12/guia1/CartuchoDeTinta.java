package ejercicio_12.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CartuchoDeTinta {

    private static final int CANT_CARATERES_X_PUNTO = 50;
    private int nivelDeTinta;

    public CartuchoDeTinta() {
        this.nivelDeTinta=100;
    }

    public int getNivelDeTinta() {
        return nivelDeTinta;
    }
    
    private boolean validarcantCaracteres(int cant){
        return cant > 0;
    }
    public int cantSegunCantCaracteres(int cantCaracateres){
        int cantTintaAUsar=0;
        if(validarcantCaracteres(cantCaracateres) ){
            cantTintaAUsar= (int)Math.ceil((double)cantCaracateres/CANT_CARATERES_X_PUNTO);
        }
        return cantTintaAUsar;
    }
    public void actulizarNivelTinta(int cant){
        nivelDeTinta-=cantSegunCantCaracteres(cant);
        
    }
    
    public boolean ValidarCantTintaNecesaria(int cantTintaUsar){
     
        return this.nivelDeTinta>= cantTintaUsar;
    }
}