
package video45.ConstructorNoSeHereda;


public class Principal {
    public static void main(String[] args) {
        Auto a= new Auto(true, "MarcaFalsa", "AXZ", "ABC123");
       
        a.acelerar();
        System.out.println(a);
        
    }
}
