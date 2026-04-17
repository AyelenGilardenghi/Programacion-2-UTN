package ejercicio5.guia1;


public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
       /* if(denominador != 0){
          this.denominador = denominador;
        }*/// debe ser asi porque si dejo distinto de ser por defolt si no ingresa nada queda en 0
       if(denominador == 0){
           throw new RuntimeException("Denominador no puede ser cero");
       }
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void mostrar(){
        System.out.println( numerador+ "/"+ denominador);    
    }
    
    public double getValorDecimal(){
        return (double)numerador/denominador;
    }
    
    public void sumar( int numero){
        this.numerador = numerador+ numero * denominador;//numerador+= numero*denominador
    }
    
    public void sumar(Fraccion nuevaFraccion){
        /*int nuevoNumerador= this.numerador * nuevaFraccion.denominador + nuevaFraccion.numerador* this.denominador;
        int nuevoDenominador = this.denominador * nuevaFraccion.denominador; */
        //MEJORADO USA EL GET NO EL ATRIBUTO
        numerador= this.numerador *nuevaFraccion.getDenominador() + nuevaFraccion.getNumerador()*this.denominador;
        denominador *= nuevaFraccion.getDenominador();
       simplificar();
    }
    public void simplificar(){
        dividirMitad();
   
        for( int i =  elMenor(); i >= 3; i--){
          while(numerador % i == 0  && denominador % i == 0){
              this.numerador /= i;
              this.denominador /= i;
          }
      }
    }
    private void dividirMitad(){
        while(esPar(numerador) && esPar(denominador)){
           this.numerador/= 2;
           this.denominador /=2;
        }
    }
    private int elMenor(){
        return Math.min(Math.abs(numerador),Math.abs(denominador));
    }
    private boolean esPar(int num){
        return (num %2 ==0);
    }
    
    /* private void simplificar() {
    
       //consejo de la ai poner != 0 el numerador porque si llega a estar cero va a entrar en par
       while(esPar(numerador) && esPar(denominador)){
           this.numerador/= 2;
           this.denominador /=2;
        }
      //consejo ai poner el valor absoluto para que no me tome un negativo Math.abs
      int menor= Math.min(Math.abs(numerador),Math.abs(denominador));
      
      for( int i = menor; i >= 3; i--){
          while(numerador % i == 0  && denominador % i == 0){
              this.numerador /= i;
              this.denominador /= i;
          }
      }
      
    }*/
    
  private boolean fraccionPropia(){
      return numerador < denominador;
  }
  
  private boolean fraccionAparente(){
   return (numerador % denominador == 0) ;
}
  private boolean fraccionImpropia(){
      return (numerador > denominador  && !fraccionAparente());
  }
  
  public void tipoFraccion(){
      mostrar();
      if(fraccionPropia()){
          System.out.println("Es una FRaccion propia, donde el numeroador es menor que el denominador");
        }else if(fraccionAparente()){
          System.out.println (" Es una FRACCION APARENTE, donde el numerador es multiplo del denominador");
  }else if(fraccionImpropia()){
          System.out.println("Es una FRACCION IMPROPIA, donde el numerador es mayor que el denominador, pero no multiplo");
  }
}
}