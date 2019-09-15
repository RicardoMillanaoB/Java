package ejercicio.pkg6.pkg10;
import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class Ejercicio610 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);               
        
        System.out.println("Ingrese el mensaje para enviar");
        String palabra = intro.next();
        
        char palabraArreglo [] = new char [palabra.length()];
        
        //arreglo utilizado para generar cadena
        
        for(int i = 0; i < palabraArreglo.length; i++){
            palabraArreglo[i] = palabra.charAt(i);
        }
        
        for(int i = 0; i < palabraArreglo.length;i++){
            switch(palabraArreglo[i]){
                
            }
        }
        
    }
    
}
