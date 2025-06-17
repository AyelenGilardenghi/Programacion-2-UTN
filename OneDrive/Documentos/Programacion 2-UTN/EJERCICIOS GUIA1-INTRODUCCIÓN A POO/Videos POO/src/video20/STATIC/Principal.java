package video20.STATIC;


public class Principal {
    public static void main(String[] args) {
        Auto a1 = new Auto("ABC123",  "FIAT", 3123, "AMARILLO");
        Auto a2 = new Auto("ABC123",  "FORD", 54521, "VERDE");
        Auto a3 = new Auto("ABC123",  "PEUGOT", 354654, "AZUL");
        Auto a4 = new Auto("ABC123",  "FIAT", 54635, "ROJO");
    
        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());
  
        Auto.anularDescuento();
        System.out.println(" ");
        
        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());
  
        
    
    
    
    }
}
