package ejercicio_12.guia1;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Documento {

    private LocalDate fecha;
    private String titulo;
    private String cuerpo;

    public Documento(LocalDate fecha, String titulo, String cuerpo) {
        setFecha(fecha);
        setTitulo(titulo);
        setCuerpo(cuerpo);
    }

    public void setFecha(LocalDate fecha) {
        if(fecha != null && fecha.isBefore(LocalDate.now())){
         this.fecha = fecha;
        }
    }

    public void setTitulo(String titulo) {
        if(titulo != null){
        this.titulo = titulo;
        }
    }
    
    public void setCuerpo(String cuerpo) {
        if(cuerpo != null){
            this.cuerpo = cuerpo;
        }
    }

    public int cantCaracteresCuerpo(){
        return this.cuerpo.length();
    }
    
    public int cantCaracteresDoc(){
        return titulo.length()+cuerpo.length()+fecha.toString().length();
    }
    public void imprimir(){
        System.out.println(fecha +"\t\t***"+ titulo+ "***\n" );
        System.out.println(cuerpo);
    }// tendriqa que wer tostring


}
//creame un test para probar y comprobar que anden todos los metodos