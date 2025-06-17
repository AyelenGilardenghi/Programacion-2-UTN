package video21.EjercicioStatic;

public class Ticket {
    private static int contador=100;// no hace falta agregarle el 0
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String DNIPersona) {
        //Ticket.contador ++; aca empieza en 101 
        this.numero=contador;
        Ticket.contador ++;// aca empieza en 100
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fechaCompra=" + fechaCompra + ", DNIPersona=" + DNIPersona + '}';
    }
    
    
    
    
    
}
