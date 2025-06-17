
package video44.VehiculosProtected;



public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String patente;

  
   
    public void acelerar(){
        System.out.println("Acelerando.....");
    }
    
    public void frenar(){
        System.out.println("Frenandoooo.....");
    }
    
    private void chequearMotor(){
        System.out.println("chequeando motor....");
    }
    public void encender(){
        chequearMotor();
        System.out.println("Encendiendose.....");
        
    }
    
}
