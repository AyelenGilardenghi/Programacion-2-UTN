/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video39.EnumConAtriyMetod;

/**
 *
 * @author Gilar
 */
public enum Continente {
    
        AMERICA(546455446,0215454),
        EUROPA(45143,546431),
        AFRICA(546514,45654),
        ASIA(45542514,351454),
        OCEANIA(54412512,35143),
        ANTARTIDA(5143,3134343);

        private long cantHabitantes;
        private double supeficie;
        
        //EL CONSTRUCTOR ES PRIVADO EN LSO ENUM
    private Continente(int cantHabitantes, double supeficie) {
        this.cantHabitantes = cantHabitantes;
        this.supeficie = supeficie;
    }
    // la cantidad de habitantes que hay por km2
    public double densisdadPoblacion(){
        return this.cantHabitantes/this.supeficie;
    }
    
    @Override
    public String toString() {
        return "Continente{" + "ordinal=" + ordinal() + ", name=" + name() + ", cantHabitantes=" + cantHabitantes + ", supeficie=" + supeficie + '}';
    }
    
        
        
}
