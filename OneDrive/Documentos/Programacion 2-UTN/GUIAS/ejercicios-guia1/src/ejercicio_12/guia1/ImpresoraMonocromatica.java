package ejercicio_12.guia1;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ImpresoraMonocromatica {
    private static final int CANT_CARACT_POR_HOJA = 20;// es  bandeja
    private boolean estaEncendida;
    private CartuchoDeTinta cartucho;
    private BandejaDeHojas bandeja;
        

    public ImpresoraMonocromatica(CartuchoDeTinta cartucho, BandejaDeHojas hoja) {
       // this.estaEncendida = false;por feault esta
        this.cartucho = cartucho;
        this.bandeja = hoja;
    }

    public void encender(){
       // estaEncendida=true;
       estaEncendida = !estaEncendida;
    }


    /**
     * 
     * @param cantCaracteres
     * @return 
     */
    private int nivelSegunCantCaracteres(int cantCaracteres) {
        return cartucho.cantSegunCantCaracteres(cantCaracteres);   
    }

   public void recargarBandeja(int cantHojas) {
    bandeja.recargar(cantHojas);
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
          if( bandeja.getCantHojas()< hojasNecesariasParaImprimir){
              System.out.println("impriminendo...");
              bandeja.usarHojas(bandeja.getCantHojas());
              System.out.println("BANDEJA VACIA");
              System.out.println("RECARGANDO.......");
              recargarBandeja(hojasNecesariasParaImprimir);
            }    
        
              cartucho.actulizarNivelTinta(documento.cantCaracteresCuerpo());
              bandeja.usarHojas(hojasNecesariasParaImprimir);
              
              documento.imprimir();
          
      }else{
          System.out.println("IMPRESORA APAGADA");
      }
          
      
    }
    
    private boolean hayhojas(){
        return bandeja.getCantHojas()==0;
    }
}