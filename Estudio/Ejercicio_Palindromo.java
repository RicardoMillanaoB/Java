package palindromo;
import java.util.*;


public class Palindromo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // charAt cualquiera
        
         String h = "hola mundo";
        char letra = h.charAt(2);
        System.out.println("Caracter en la posicion indicada"+letra);

        System.out.println("");
        System.out.println("");
        
        // generacion de proyecto PALINDROMO
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese palabra");
        String palabra = intro.next();
        boolean condicion;
        int cont = 0;
        
        char  arreglo [] = new char[palabra.length()];
        
        for ( int i = 0; i<palabra.length(); i++){
            arreglo[i] = palabra.charAt(i);
}
        
        for(int i = 0; i<palabra.length(); i++){
            if (arreglo[i] == palabra.charAt(palabra.length()-1-i)){
                cont++;
            }
        }
        if ( cont== palabra.length()){
            System.out.println("Es palindromo");
            
        }else{
            System.out.println("No es palidromo");
        }

                      }
                  }


    
    

