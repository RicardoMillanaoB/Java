
package Ejecutador;


public class ManejoGenericos {

    public static void main(String [] args){
        //creamos una instancia de ClaseGenerica para Integer
        ClaseGenerica<Integer> objeto = new ClaseGenerica<Integer>(15);//15 es el constructor
        objeto.obtenerTipo();
        
        //creamos una Instancia de Clase generica para String
        
        ClaseGenerica<String> objeto2 = new ClaseGenerica<>("Prueba");
        objeto2.obtenerTipo();
        
    }
}
