package video53;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Bicicleta {
    private final int CANT_KMS_MAX=50;
    private String marca;
    private int rodado;
    private int cantKms;

    public Bicicleta(String marca, int rodado, int cantKms) {
        this.marca = marca;
        this.rodado = rodado;
        this.cantKms = cantKms;
    }

    public int getCantKms() {
        return cantKms;
    }
    
    
    public boolean cumpleRequisitos(){
        return this.cantKms< CANT_KMS_MAX;
    }

}