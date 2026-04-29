package ejercicio_12.guia1;

import java.time.LocalDate;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {

   // 1. Creamos los "ingredientes" (Objetos)
        CartuchoDeTinta miCartucho = new CartuchoDeTinta(); // Empieza con 100
        BandejaDeHojas miBandeja = new BandejaDeHojas();   // Empieza con 0
        
        // 2. Creamos la Impresora
        ImpresoraMonocromatica miImpresora = new ImpresoraMonocromatica(miCartucho, miBandeja);
        
        // 3. Preparamos un Documento con mucho texto para que gaste varias hojas
        // 100 caracteres / 20 por hoja = 5 hojas necesarias
        String textoLargo = "Este es un texto de prueba que tiene que ser lo suficientemente largo "
                          + "para que nuestra impresora gaste varias hojas y puntos de tinta hoy.";
        
        Documento miDoc = new Documento(LocalDate.now(), "Informe de Programacion", textoLargo);

        // --- INICIO DE LAS PRUEBAS ---
        System.out.println("--- INICIANDO TEST DE IMPRESORA ---");

        // Prueba 1: Intentar imprimir apagada
        System.out.println("\n> Intento 1 (Apagada):");
        miImpresora.imprimir(miDoc);

        // Prueba 2: Encender e intentar imprimir sin hojas (debería tirar tu Exception)
        miImpresora.encender(); // 
        System.out.println("\n> Intento 2 (Encendida pero sin hojas):");
        try {
            miImpresora.imprimir(miDoc);
        } catch (RuntimeException e) {
            System.out.println("Captura de error: " + e.getMessage());
        }

        // Prueba 3: Cargar SOLO 2 hojas (faltan para las 5 que necesita el doc)
        // Acá es donde vamos a ver tu lógica de "uso lo que hay y recargo"
        System.out.println("\n> Intento 3 (Con solo 2 hojas - Recarga automatica):");
        miImpresora.recargarBandeja(2); 
        miImpresora.imprimir(miDoc);

        // 4. Verificamos cómo quedaron los niveles al final
        System.out.println("\n--- ESTADO FINAL ---");
        System.out.println("Tinta restante: " + miCartucho.getNivelDeTinta());
        System.out.println("Hojas en bandeja: " + miBandeja.getCantHojas());

       // ImpresoraMonocromatica imp = new ImpresoraMonocromatica();

    }
    

}