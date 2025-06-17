package video40.EjercicioDeArrayList;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal_1 {

    public static void main(String[] args) {
      Fabrica f= new Fabrica();
        cargarFabrica(f);
        
         //f.listarInstrumentos(); // punto a)
        //punto B
       /* ArrayList<Instrumento> lista= f.instrumentoPorTipo(TipoDeInstrumento.PERCUSION);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }*/
        
        //punto C
        /*
        Instrumento borrado = f. borrarInstrumento("kEF567");
        System.out.println("se borro: "+borrado);
        f.listarInstrumentos(); 
        */
             
        // punto d
        double []procs =f.porcInstrumentoPorTipo("Sucursal B");
        for (int i = 0; i < procs.length; i++) {
            System.out.println(procs[i]);
            
        }
        
    }
    
    private static void cargarFabrica (Fabrica f){
        Sucursal s1= new Sucursal("Sucursal A");
        Sucursal s2= new Sucursal("Sucursal B");
       
        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoDeInstrumento.CUERDA));
       s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoDeInstrumento.VIENTO));
       s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoDeInstrumento.PERCUSION));
       
       s2.agregarInstrumento(new Instrumento("ASD 353", 52432, TipoDeInstrumento.CUERDA));
       s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoDeInstrumento.VIENTO));
       
       
        
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
       
        //s1.listarInstrumentos();
    }

}