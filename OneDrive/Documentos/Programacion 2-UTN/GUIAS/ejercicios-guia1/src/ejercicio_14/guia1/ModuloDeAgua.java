package ejercicio_14.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ModuloDeAgua {

    private static final double TEMP_SUPERIOR = 70;
    private double medidorTemperatura;
    private boolean requiereMantenimiento;

    public ModuloDeAgua(double medidorTemperatura, boolean requiereMantenimiento) {
        this.medidorTemperatura = medidorTemperatura;
        this.requiereMantenimiento = requiereMantenimiento;
    }

 
    public boolean requiereMantenimiento() {
        return requiereMantenimiento;
    }

    public boolean temperaturaValida() {
        return medidorTemperatura > TEMP_SUPERIOR;
    }

    
    
    

}