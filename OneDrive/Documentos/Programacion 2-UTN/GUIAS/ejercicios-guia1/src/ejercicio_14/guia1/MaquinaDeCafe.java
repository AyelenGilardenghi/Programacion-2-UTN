package ejercicio_14.guia1;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class MaquinaDeCafe {

    private String marca;
    private boolean estaEncendida;
    private ModuloDeAgua moduloDeAgua;
    private ModuloDeLeche moduloDeLeche;

    public MaquinaDeCafe(String marca) {
        this.marca = marca;
        this.moduloDeAgua = moduloDeAgua;
        this.moduloDeLeche = moduloDeLeche;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
    }

    public boolean encendida() {
        return estaEncendida = !estaEncendida;
    }

    public void servirCafe(TipoDeCafe tipoCafe) {
        if (encendida()) {
            if (moduloDeAgua.temperaturaValida() && !moduloDeAgua.requiereMantenimiento()) {
                prepararCafe(tipoCafe);
            
            }
        
        }else
        {
            System.out.println("ESTA APAGADA");
        }
    }
    
    private void prepararCafe(TipoDeCafe tipoCafe){
        if(tipoCafe != tipoCafe.EXPRESSO){
            
        }
    }
}
