package video36.BusquedaEnColeccion;




public class Auto {
    private String patente;
    private String color;
    private int kms;

    public Auto(String patente, String color, int kms) {
        this.patente = patente;
        this.color = color;
        this.kms = kms;
    }

    public int getKmsRecorridos() {
        return kms;
    }

    public String getPatente() {
        return patente;
    }
    

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kms=" + kms + '}';
    }

    
    
    
  

   
    

   
    

    
    
    
    
}
