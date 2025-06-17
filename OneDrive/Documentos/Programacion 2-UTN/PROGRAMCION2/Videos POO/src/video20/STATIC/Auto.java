package video20.STATIC;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private String color;
    private  static double dcto;

    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.dcto=10; // no va con this poruqe seria en cada objeto
        // aca al ser static iria a tod ala clase
    }
    
    public double precioPromocional(){
        return this.precio - this.precio * Auto.dcto /100;
    }
    public static void anularDescuento(){
       Auto.dcto=0;
       // aca no puedo usar this.precio=0
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + '}';
    }

   
    

    
    
    
    
}
