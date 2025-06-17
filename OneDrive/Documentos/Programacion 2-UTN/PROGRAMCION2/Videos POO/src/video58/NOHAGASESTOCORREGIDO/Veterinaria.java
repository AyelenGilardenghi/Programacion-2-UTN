package video58.NOHAGASESTOCORREGIDO;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Veterinaria {

    private ArrayList<Mascota> mascotas;

    public Veterinaria() {
        this.mascotas =new ArrayList<>();
    }
    
    public void agregarMascota(Mascota m){
        this.mascotas.add(m);
    }
    
//    //METODO QUE NO USA POLIMORFISMO
//    public void saludarCliente() {
//        for (Mascota mascota : mascotas) {
//            if (mascota instanceof Perro) {
//                ((Perro) mascota).ladrar();
//                
//            } else if(mascota instanceof Gato){
//                ((Gato)mascota).maullar();
//            }
//        }
//    
//    }
      //METODO QUE SI USA POLIMORFISMO
    public void saludarCliente() {
       for (Mascota mascota : mascotas) {
           mascota.expresarse();
       }
    }

}