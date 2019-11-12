
package Ejecutador;


public class ClaseGenerica<T> { //Clase generica de tipo T

    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    public void obtenerTipo(){
        System.out.println("El tipo es: "+objeto.getClass().getName());
    }
   
    
}
