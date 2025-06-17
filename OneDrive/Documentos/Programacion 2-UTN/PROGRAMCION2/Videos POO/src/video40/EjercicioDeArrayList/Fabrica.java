package video40.EjercicioDeArrayList;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Fabrica {

    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales= new ArrayList<>();
        
    }
    
        // puede ser voi o el instrumento borrado
    public Instrumento borrarInstrumento(String ID){
        Instrumento borrado = null;
        int i = 0;
        while(i < sucursales.size() && borrado == null){
            borrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        } 
        return borrado;
    }
    
    public void agregarSucursal( Sucursal sucu){
        this.sucursales.add(sucu);
    }
    
    public void listarInstrumentos(){
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
            
        }
    
    public ArrayList<Instrumento> instrumentoPorTipo(TipoDeInstrumento tipo){
      ArrayList <Instrumento> instEncontrados= new ArrayList<>();
        for (Sucursal sucursal : sucursales) {
            instEncontrados.addAll( sucursal.instrumentoPorTipo(tipo));
        }
         
    return instEncontrados;
    }
    
public double [] porcInstrumentoPorTipo( String nombresuc){
    double [] porcentajes = null; // o un array con ceros 
    Sucursal sucEncontrada= buscarSucursal(nombresuc);
    if(sucEncontrada!= null){
        porcentajes= sucEncontrada.porcInstrumentoPorTipo();
        
    }
    return porcentajes;
}
    
 private Sucursal buscarSucursal(String nombre){
        
        int i=0;
        Sucursal sucEncontrada= null;
        while(i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombre) ){//tomar la lista de instrumento en la posicion ir preguntarle al instrumento por su ID y ver si es igual al ID que viene por parametro
            i++;
        }
        if(i<sucursales.size()){
            sucEncontrada=this.sucursales.get(i);
        }
        return sucEncontrada;
    }
    
}