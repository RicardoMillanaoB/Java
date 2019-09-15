package ejercicio.pkg7.pkg9;

import java.util.Scanner;

/**
 * Programa para calcular fila y diagonal de una matriz 10x10
 *
 * @author Ricardo
 */
public class Ejercicio79 {

    final static int filas = 10;
    final static int columnas = 10;

    public static void main(String[] args) {

        int matriz[][] = new int[filas][columnas];

        llenarMatriz(matriz);
        int filaSeleccionada = filaSeleccionar();
        System.out.println("El promedio de la fila "+filaSeleccionada+" "+promedioFila(matriz,filaSeleccionada));
        System.out.println("La suma di la diagonal es "+diagonal(matriz));
    }

    public static void llenarMatriz(int[][] matrizPorLlenar) {

        Scanner intro = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < columnas; j++) {
                do {
                    System.out.println("Ingrese numero [" + i + "][" + j + "]");

                    matrizPorLlenar[i][j] = intro.nextInt();
                    if (matrizPorLlenar[i][j] < 0 || matrizPorLlenar[i][j] > 250) {
                        System.out.println("limite sobrepasado");
                    }
                } while (matrizPorLlenar[i][j] < 0 || matrizPorLlenar[i][j] > 250);

            }
        }
    }

    public static int filaSeleccionar() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la fila para promediar");
        int filaSeleccionada = intro.nextInt();

        return filaSeleccionada;
    }

    public static int diagonal(int[][] matriz) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            diagonal1 += matriz[i][i];
            diagonal2 += matriz[i][matriz.length - 1];

        }
        return diagonal1 + diagonal2;
    }
    public static int promedioFila(int [][] matriz, int filaSeleccionada){
        
        int promedio = 0;
        
        for(int i = 0; i < matriz.length; i++){
            promedio += matriz[filaSeleccionada][i];
        }
        
        return promedio/matriz.length;
    }
}
