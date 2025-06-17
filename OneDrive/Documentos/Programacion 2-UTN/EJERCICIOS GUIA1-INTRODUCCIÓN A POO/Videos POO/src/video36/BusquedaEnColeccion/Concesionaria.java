
package video36.BusquedaEnColeccion;


import java.util.ArrayList;
import java.util.Iterator;


public class Concesionaria {
    private String nombre;
    private ArrayList <Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }
    
    public void agregarAutos(Auto a){
        this.autos.add(a);
    }
    
    public int cantAutos(){
        return autos.size();
    }
  //de esta forma lo va hacer hasta que termine de recorrrer la lista por completo auqnue lo haya encontrado
  /*  public Auto buscarAuto(String patente){
        Auto autoEncontrado= null;
        for (Auto auto : autos) {
            if(auto.getPatente().equalsIgnoreCase(patente)){
                autoEncontrado= auto;
            }
        }
        return autoEncontrado;
    }
  */
    /* ESTO ESTA BIEN PERO SE PUEDE MEJORAR COMO EL CODIGO DE LA LINEA 50 PARAA NO TENER DOS CONDICIONES
     public Auto buscarAuto(String patente){
        Auto autoEncontrado= null;
        int i=0;
        while(i< cantAutos() && autoEncontrado == null){
            Auto auto=this.autos.get(i);
            if(auto.getPatente().equalsIgnoreCase(patente)){
                autoEncontrado= auto;
            }
            i++;
        }
        return autoEncontrado;
    }
}*/
   // de esta forma queda mejor, ES LA QUE LE GUSTA AL FPROFE
     public Auto buscarAuto(String patente){
        Auto autoEncontrado= null;
        int i=0;
        while(i< cantAutos() && !this.autos.get(i).getPatente().equalsIgnoreCase(patente)){// EL METODO THIS.AUTOS.GET HAY QE EVITARLO PORQUE SI TRABAJO CON UNA LISTA QUE NO SEA ARRAY SE ROMPE corrrigo en linea 63 si no llega a ser lista por ejemplo en vez de ser arratlist una HashSet
                
                i++;
        }
        if(i< cantAutos()){
            autoEncontrado=this.autos.get(i);
        } 
        return autoEncontrado;
    }
}
    
    /*
    public Auto buscarAuto(String patente){
        Auto autoEncontrado= null;
        Iterator<Auto> it=this.autos.iterator();
        while(it.hasNext() && autoEncontrado == null){
            Auto a=it.next();
            if(a.getPatente().equalsIgnoreCase(patente)){
               autoEncontrado= a;
            }
        }
        return autoEncontrado;
    }
}*/