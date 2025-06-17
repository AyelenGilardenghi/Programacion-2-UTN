package video53;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class BicicletaElectrica extends Bicicleta {
     private final int CANT_POT_MAX=400;
    private int potencia;

    public BicicletaElectrica(int potencia, String marca, int rodado, int cantKms) {
        super(marca, rodado, cantKms);
        this.potencia = potencia;
    }
    @Override
      public boolean cumpleRequisitos(){
        return this.potencia< CANT_POT_MAX && super.cumpleRequisitos()  ;
    }

}