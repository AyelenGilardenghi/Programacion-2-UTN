package ejercicio5.guia1;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fraccion fraccion1 = new Fraccion(5, 6);
       Fraccion fraccion2 = new Fraccion(12, 6);
       Fraccion fraccion3 = new Fraccion(7, 6);
       Fraccion fraccion4 = new Fraccion(1, 6);
       
        System.out.print("FRACCION: ");
        fraccion1.mostrar();
        System.out.println(fraccion1.getValorDecimal());
      
        fraccion1.sumar(2);
       System.out.print("FRACCION: ");
       fraccion1.mostrar();
       
       fraccion1.sumar(new Fraccion(2,3) );
       System.out.print("Suma de FRACCIONES: ");
       fraccion1.mostrar();
       fraccion1.tipoFraccion();
       /*
       fraccion1.simplificar();
       System.out.print("FRACCION SIMPLIFICADA: ");
       fraccion1.mostrar();
       */
       fraccion2.tipoFraccion();
       fraccion3.tipoFraccion();
       fraccion4.tipoFraccion();
       
    }
    
}
