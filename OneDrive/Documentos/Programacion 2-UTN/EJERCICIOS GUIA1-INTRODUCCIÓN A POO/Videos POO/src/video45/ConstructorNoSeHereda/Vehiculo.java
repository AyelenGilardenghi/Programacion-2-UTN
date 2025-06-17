/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video45.ConstructorNoSeHereda;




public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    

    public String getMarca() {
        return marca;
    }

   
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

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + '}';
    }
    
    
}
