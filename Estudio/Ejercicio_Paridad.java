package ejercicio.para.trabajar.arreglos;
import java.util.Random;
import java.util.Scanner;

public class EjercicioParaTrabajarArreglos {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner intro = new Scanner(System.in);
        
        int N= 100;// cantidad de numeros a ingresar
        int par = 0;// inicializo contadores
        int impar = 0;
       
        int rangoSupAleatorio = 101; //Lim superior real = 100
        String primo;
        
       int [] number = new int[N]; // inicializo el arreglo, por eso es "N"
         
         for (int i= 0; i<N; i++){//ciclo para asignar la casilla "[i]" con numero generados por RANDOM
            int numeros = random.nextInt(rangoSupAleatorio)+1;    // numeros generados por random, del 1 al 100
             number [i] = numeros;// se asocia numeros [contador] con numeros generados con random
             System.out.println( "casilla: " + i + " con numero: "+ numeros);//imprime la casilla [contador] con numeros generados en random
                    }
        
         for (int i = 0; i<N; i++){// ciclo a utilizar para ver si es par p imar 
            float  caracteristica = number[i]%2 ;// operacion matematica para ver si es par o impar.
            if (caracteristica == 0){ // si no sobra nada entonces se establece contador para contar los pares 
                par++;
            }else{
                impar++;}        // si la division no es exacta entonces es cuentan impares
         }
       
         System.out.println("pares "+par);
         System.out.println("impares: "+ impar);
         
         for (int i = 0; i< number.length; i++ ){
            int prim =0;
             for (int j = 1; j<=rangoSupAleatorio - 1; j++){ 
                    boolean isPrimo = number[i]%j == 0;
                    if (isPrimo){
                        prim++;  
                     } 
             }
                      
                     if (prim!=2){
                        primo = "no primo";       
                     }else{
                        primo = " primo";
                     }
                      System.out.println("casilla " + i +" numero: "+ number[i]+ " es "+  primo);
                   }
         
    
}
}
