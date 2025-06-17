
package video28.TeelDontAsk;

public class Principal {
    public static void main(String[] args) {
            Motor m = new Motor("1235", 1.6, "Nafta");
        Auto auto = new Auto("ABC123", "fiat", 346252, "rojo",m); 
        System.out.println(auto);
//EVITAR ESOS ERRORES
//ESTO SERIA UN TELL DONT ASK       
//auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales()+1000);
        auto.acelerar();
        System.out.println(auto);
 //ESTO SERIA UN TELL DONT ASK        //auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales()+1000);
        auto.acelerar();
        System.out.println(auto);
        
        
    }
          
}
