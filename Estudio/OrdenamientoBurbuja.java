package metodo.brbuja;
import java.util.Scanner;
import java.util.Random;


public class MetodoBrbuja {

    
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner intro = new Scanner(System.in);
        
        int aux;
        
        System.out.println("Ingrese largo: ");
        int largo = intro.nextInt();
        int [] numeros = new int[largo];
        
        
        for ( int i = 0; i < (numeros.length-1); i++) {
            numeros[i] = aleatorio.nextInt(numeros.length)+1;
            System.out.println("casilla : " + i +" : " + numeros[i]);
         
        }
        
        // metodo burbuja//
        
        for ( int i = 0; i< (numeros.length-1) ; i++){
            for(int j = 0; j < (numeros.length-1) ;j++){
                if ( numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
                System.out.println("Ordenado: ");
                for ( int i=0; i <(numeros.length-1); i++){
                    System.out.println("casilla: "+i+" : "+numeros[i]);
                }
  
    
    
    
    
    }
    
}


