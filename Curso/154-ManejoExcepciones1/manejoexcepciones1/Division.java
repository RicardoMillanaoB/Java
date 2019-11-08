package manejoexcepciones1;


public class Division {//ejecuta la operacion matematica
    
    private int numerador;
    private int denominador;
    //contructor debe ser publico
   public Division(int numerador,int denominador) throws OperationException{//contructor utilizando la clase antes hecha
       
       if(denominador == 0){
           // "Denominado igual a cero"
           throw new OperationException("Denominador igual a cero");//tipo exception y no run time exception por eso se declara en el contructor
           
       }
       
       this.numerador = numerador;
       this.denominador = denominador;
   }
   public void visualizarOperacion() {
       System.out.println("El resultado de la divison es: "+(numerador/denominador));
   }
}
