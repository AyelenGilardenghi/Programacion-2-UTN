package ejercicio_12.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ImpresoraMonocromatica {
    private static final int CANT_CARACT_POR_HOJA = 20;
    private boolean estaEncendida;
    private CartuchoDeTinta cartucho;
    private BandejaDeHojas hoja;
        

    public ImpresoraMonocromatica(CartuchoDeTinta cartucho, BandejaDeHojas hoja) {
        this.estaEncendida = false;
        this.cartucho = cartucho;
        this.hoja = hoja;
    }

    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }


    
    private int nivelSegunCantCaracteres(int cantCaracteres) {
        return cartucho.cantSegunCantCaracteres(cantCaracteres);   
    }

   public void recargarBandeja(int cantHojas) {
    hoja.recargar(cantHojas);
    }

    public void imprimir(Documento documento) {
      if(estaEncendida){
          int tintanNecesaria= nivelSegunCantCaracteres(documento.cantCaracteresCuerpo());
          int hojasNecesariasParaImprimir=  (int) Math.ceil((double)documento.cantCaracteresCuerpo()/CANT_CARACT_POR_HOJA);
         
          if(!cartucho.ValidarCantTintaNecesaria(tintanNecesaria) ){
               throw new RuntimeException("TINTA INSUFICIENTEE");
          }
          if( hayhojas() ){
               throw new RuntimeException("NO HAY HOJAS EN LA BANDEJA");
          }     
          if( hoja.getCantHojas()< hojasNecesariasParaImprimir){
              System.out.println("impriminendo...");
              hoja.usarHojas(hoja.getCantHojas());
              System.out.println("BANDEJA VACIA");
              System.out.println("RECARGANDO.......");
              recargarBandeja(hojasNecesariasParaImprimir);
            }    
        
              cartucho.actulizarNivelTinta(documento.cantCaracteresCuerpo());
              hoja.usarHojas(hojasNecesariasParaImprimir);
              
              documento.imprimir();
          
      }else{
          System.out.println("IMPRESORA APAGADA");
      }
          
      
    }
    
    private boolean hayhojas(){
        return hoja.getCantHojas()==0;
    }
}