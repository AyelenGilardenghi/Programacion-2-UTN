package video40.EjercicioDeArrayList;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Sucursal {

    private String nombre;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarInstrumento( Instrumento instru){
        this.instrumentos.add(instru);
    }
    
    public void listarInstrumentos(){
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);// no hace falta ponerle el tostring porque por defecto lo muestra
        }
    }
    
    public ArrayList<Instrumento> instrumentoPorTipo(TipoDeInstrumento tipo){
      ArrayList <Instrumento> instEncontrados= new ArrayList<>();
        for (Instrumento instrumento : instrumentos) {
            if(instrumento.getTipo()== tipo ){// puede ser == paracomparar enums o el equals taamb
                instEncontrados.add(instrumento);
            }
        }
                
        
      return instEncontrados;
    }
    
    public Instrumento borrarInstrumento(String ID){
      //buscar instrumento por Id
      //si existe borrarlo
       Instrumento insBorrar= buscarInstrumento(ID);
       this.instrumentos.remove(insBorrar);
       return  insBorrar;
    }
    
    private Instrumento buscarInstrumento(String ID){
        
        int i=0;
        Instrumento instEncontrado= null;
        while(i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID) ){//tomar la lista de instrumento en la posicion ir preguntarle al instrumento por su ID y ver si es igual al ID que viene por parametro
            i++;
        }
        if(i<instrumentos.size()){
            instEncontrado=this.instrumentos.get(i);
        }
        return instEncontrado;
    }
    

    public double [] porcInstrumentoPorTipo( ){
        final int CANT_INSTRUMENTOS = TipoDeInstrumento.values().length;
        double []porcentajes= new double[CANT_INSTRUMENTOS];
        for (Instrumento instrumento : instrumentos) {
            porcentajes [ instrumento.getTipo().ordinal() ] ++;
            
            
            
        }
        absolutoaPorcentaje(porcentajes);
        return porcentajes;
        
    }
    
    private void absolutoaPorcentaje(double[] porcentajes){
        for(int i=0;i<porcentajes.length;i++){
            porcentajes[i]=( porcentajes[i]*100) /instrumentos.size() ;
        }
            
            
    }
}