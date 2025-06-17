package video40.EjercicioDeArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Instrumento {

    private String ID;
    private double precio;
    private TipoDeInstrumento tipo;

    public Instrumento(String ID, double precio, TipoDeInstrumento tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public TipoDeInstrumento getTipo() {
        return tipo;
    }
             
    
    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    

}