package metoodos.loteria;

import java.util.Scanner;
import java.util.Random;

public class MetoodosLoteria {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        System.out.println("");// generacion de numeros
        int[] numGanadores = new int[15];
        int[] numEscogidos = new int[15];
        generacionGanadores(numGanadores);
        generacionEscogidos(numEscogidos);
    }
     
    public static int [] generacionGanadores(int numGanadores []){
        Random random = new Random();
        for (int i = 0; i < numGanadores.length; i++) {//generacion de numeros
            numGanadores[i] = random.nextInt(40) + 1;
            for (int j = 0; j < i; j++) {                           //random sin repeticion
                if (numGanadores[i] == numGanadores[j]) {
                    i--;
                }
            }

        }
        int aux;
        for (int i = 0; i < (numGanadores.length-1); i++) { // metodo burbuja
            for (int j = 0; j < (numGanadores.length-1); j++) {
                if (numGanadores[j] > numGanadores[j + 1]) {
                    aux = numGanadores[j];
                    numGanadores[j] = numGanadores[j + 1];
                    numGanadores[j + 1] = aux;

                }
            }
        }
        int cont = 0;
        int [][]matrizGanadores = new int[3][5];
        for(int i = 0; i < 3; i++){// asignacion de arreglo a matriz
            for(int j = 0; j < 5; j++){
                
                matrizGanadores [i][j] = numGanadores[cont];
                cont++;
            }
        }
        
        
        for(int i = 0; i < 5; i++){// impresion de matriz
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.print("\t"+matrizGanadores [j][i] +"\t");
            }
        }
        
        return numGanadores;
    }
    
    public static int [] generacionEscogidos(int numEscogidos [] ) {
        Scanner intro = new Scanner(System.in);
        
        for(int i = 0; i<numEscogidos.length; i++){// generacion de numeros
            System.out.println("\nEscriba su numero escogido ("+(i+1)+") ");
            numEscogidos[i] = intro.nextInt();
            for(int j = 0; j<i; j++){
                if(i==0){
                    continue;
                }
                    while((numEscogidos[i] == numEscogidos[j])){
                        System.out.println("Numero repetido, ingrese el numero nuevamente: ("+(i+1)+")");
                        numEscogidos[i] = intro.nextInt();
                    }
                }
            }
        int aux;
        for(int i = 0; i<(numEscogidos.length-1);i++){// ordenamiento de numeros
            for(int j = 0; j<(numEscogidos.length-1); j++){
                if(numEscogidos[j] > numEscogidos[j+1]){
                    aux = numEscogidos[j];
                    numEscogidos[j] = numEscogidos[j+1];
                    numEscogidos[j+1] = aux;
                }
            }
        }
        int [][] matrizEscogidos = new int[3][5];//asociamiento de matriz con arreglo
        int cont = 0;
        for(int i = 0; i<3; i ++){
            for(int j = 0; j < 5; j++){
                matrizEscogidos[i][j] = numEscogidos[cont];
                cont++;
            }
        }
        for(int i = 0; i< 5; i++){// impresion de matriz
            System.out.println();
            for(int j = 0; j<3; j++){
                System.out.print("\t"+matrizEscogidos[j][i]+"\t");
            }
        } 
        return numEscogidos;
        
    }
