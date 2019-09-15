package desafio.matrices;

import java.util.Scanner;
import java.util.Random;

public class DesafioMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dim = 3;
        int rango = 50;
        int[][] matriz = new int[dim][dim];
        mostrar(matriz);
        System.out.println("===================================");
        llenar(matriz, rango);
        mostrar(matriz);
        int p = perimetro(matriz);
        System.out.println("Perimetro: " + p);
        System.out.println("====================================");

        int[] diagonal11 = new int[dim];
        int[] diagonal12 = new int[dim];
        int d = sumaDiagonales(matriz, diagonal11, diagonal12);
        System.out.println("Suma Diagonal: " + d);
        System.out.println("=====================================");

        sumaEsquinas(matriz);
        System.out.println("========================================");

        int[][] matrizT = tranponer(matriz);
        mostrar(matrizT);

    }

    public static void llenar(int[][] mat, int num) {
        Random rnum = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rnum.nextInt(num);
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println("");
        }
    }

    public static int perimetro(int[][] matriz) {
        int acumulador = 0;
        for (int i = 0; i < matriz.length; i++) {
            acumulador += matriz[0][i];
            acumulador += matriz[matriz.length - 1][i];
            acumulador += matriz[i][0];
            acumulador += matriz[i][matriz.length - 1];

        }
        acumulador -= matriz[0][0];
        acumulador -= matriz[matriz.length - 1][matriz.length - 1];
        acumulador -= matriz[0][matriz.length - 1];
        acumulador -= matriz[matriz.length - 1][0];

        return acumulador;
    }

    public static int sumaDiagonales(int[][] matriz, int[] arr1, int[] arr2) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            arr1[i] = matriz[i][i];
            arr2[i] = matriz[matriz.length - 1][i];

            suma += (arr1[i] + arr2[i]);
        }
        return suma;
    }

    public static void mostrarArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "\t");
        }
        System.out.println("");
    }

    public static void sumaEsquinas(int[][] matriz) {
        int suma = 0;
        suma += matriz[0][0];
        suma += matriz[matriz.length - 1][matriz.length - 1];
        suma += matriz[0][matriz.length - 1];
        suma += matriz[matriz.length - 1][0];

        System.out.println("Esquinas: " + suma);

    }

    public static int[][] tranponer(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta.length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }
}
