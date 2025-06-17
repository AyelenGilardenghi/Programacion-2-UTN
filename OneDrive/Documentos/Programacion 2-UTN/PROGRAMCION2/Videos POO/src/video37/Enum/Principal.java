/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video37.Enum;


public class Principal {
    public static void main(String[] args) {
        Empresa e= new Empresa();
        /*
        e.agregarPersona(new Persona("Pepre", "Munioz", "primario"));
        e.agregarPersona(new Persona("AYELEN", "Quilmes", "Secundario"));
        e.agregarPersona(new Persona("LUIS", "MADR", "SECUNDARIO"));
        e.agregarPersona(new Persona("mARIA", "GILA", "FAUCLTAD"));*/
       
        //AHORA CON EL ENUM CAMBIO  LOS DATOS, pongo el nombre de la clase enum seguido de punto  y veo todas las opciones
        
        e.agregarPersona(new Persona("Pepre", "Munioz", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("AYELEN", "Quilmes",NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("LUIS", "MADR", NivelEstudio.SIN_ESTUDIO));
        e.agregarPersona(new Persona("mARIA", "GILA", NivelEstudio.SECUNDARIO));
        
        e.mostrarPorNivel(NivelEstudio.PRIMARIO);
    }
}
