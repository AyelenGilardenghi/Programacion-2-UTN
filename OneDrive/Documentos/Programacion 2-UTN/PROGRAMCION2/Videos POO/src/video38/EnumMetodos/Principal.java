
package video38.EnumMetodos;

import java.util.Scanner;
import mislibrerias.Consola;


public class Principal {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
       // System.out.println(NivelEstudio.PRIMARIO.ordinal());
        //System.out.println(NivelEstudio.PRIMARIO.toString());
        //values devuelve un array lo guardo en una variable
        NivelEstudio[] niveles = NivelEstudio.values();
        for (int i = 0; i < niveles.length; i++) {
           // System.out.println(niveles[i]);
            System.out.println((i+1)+ ") "+ niveles[i]);
        }
        System.out.println("Ingrese su nivel de estudio: ");
        int level = input.nextInt(); 
        System.out.println("Usted eligio: "+ niveles[level-1]);
        Consola.escribir("hola");
        
        //NivelEstudio.valueOf("pimaria");
    }
}
