package ejercicio_12.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class BandejaDeHojas {
    private static final int MAX_CANT_HOJAS =35;
    private int cantHojas;

    public BandejaDeHojas() {
        this.cantHojas = 0;
    }

    public int getCantHojas() {
        return cantHojas;
    }

    public boolean validarCantHojas(int cantHojas) {
       return cantHojas > 0;
    }

    public void recargar(int cant) {
       if( validarCantHojas(cant)){
            if( (cantHojas + cant) <= MAX_CANT_HOJAS){
                cantHojas+=cant;
            }else{
                cantHojas=MAX_CANT_HOJAS;// dejo cargado hasta el tope
            }
       }
    }
    
    public void usarHojas(int cant){
        if (cant > 0) {
         int resultado= this.cantHojas -= cant;
         this.cantHojas = (resultado < 0) ? 0 : resultado;
         }
        // o
        /*if (cant > 0) {
        // Math.max elige el mayor entre la resta y 0. 
        // Si la resta da -2, elige 0.
        this.cantHojas = Math.max(0, this.cantHojas - cant);
    }*/
    }

}