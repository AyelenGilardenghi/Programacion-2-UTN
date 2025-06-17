package video35.MaxyMin;

import video34.PromedioySumatoria.*;



public class Auto {
    private String patente;
    private String color;
    private int kms;

    public Auto(String patente, String color, int kms) {
        this.patente = patente;
        this.color = color;
        this.kms = kms;
    }

    public int getKms() {
        return kms;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kms=" + kms + '}';
    }

    
    
    
  

   
    

   
    

    
    
    
    
}
