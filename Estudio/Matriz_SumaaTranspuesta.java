package matriz.transpuesta;
import java.util.Scanner;

public class MatrizTranspuesta {

    
    public static void main(String[] args) {
        
           Scanner intro = new Scanner(System.in);
           
           int matriz [][]= new int[3][3];
           
           System.out.println("Digite la matriz");
                
           for(int i=0;i<3;i++){ //Generacion de la matriz
               for(int j = 0; j<3; j++){
                   System.out.println("Matriz["+i+"] ["+j+"] :");
                   matriz[i][j] = intro.nextInt();
               }
           }
          System.out.println("\nMatriz");
            for(int i=0;i<3;i++){//Escribir la matriz
                System.out.println("");
               for(int j = 0; j<3; j++){
                   System.out.print(matriz[i] [j] +" ");
               }
        int sumaFilas;
            int sumaColumnas; //SUMA DE FILAS
          
             for(int i=0;i<3;i++){
                   sumaFilas = 0;
               for(int j = 0; j<3; j++){
                   sumaFilas += matriz[i][j];
                   
               }
                 System.out.println("\nSuma de filas["+i+"] es "+sumaFilas);
             }
             System.out.println("\n");
             for(int j=0;j<3;j++){//SUMA DE COLUMNAS
                sumaColumnas = 0;
                System.out.println("");
               for(int i = 0; i<3; i++){
                   sumaColumnas += matriz[i] [j];
               }
               System.out.println("\nSuma de columnas["+j+"] es "+sumaColumnas);
            }
            int aux; //TRANSPOSICION DE LA MATRIZ
             for(int i=0;i<3;i++){
               for(int j = 0; j<i; j++){
                   aux = matriz[i][j];
                   matriz[i][j]= matriz[j][i];
                   matriz[j][i]=aux;
               }
             }
             System.out.println("\nMatriz transpuesta");
             for(int i=0;i<3;i++){//Escribir la matriz transpuesta
                System.out.println("");
               for(int j = 0; j<3; j++){
                   System.out.print(matriz[i] [j] + " ");
               }
            }
    }
    
}
