package ejercicio.pkg6.pkg4;

import java.util.Scanner;

/* Programa para ingresar numeros a una matriz, posteriormente sumar y promediar
*una fila y diagonales
 */
public class Ejercicio64 {

    final static int filas = 3;
    final static int columnas = 3;

    public static void main(String[] args) {

        int matriz[][] = new int[filas][columnas];

        Scanner intro = new Scanner(System.in);
        // llenado de matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.println("Ingrese numero para la matriz [" + i + "][" + j + "]");

                matriz[i][j] = intro.nextInt();

                while (matriz[i][j] < 0 || matriz[i][j] > 250) {
                    System.out.println("El numero sobrepasa el limite\nIngrese numeros para la matriz [" + i + "][" + j + "]");
                    matriz[i][j] = intro.nextInt();
                }

            }
        }

        //Muestra matriz
        for (int i = 0; i < filas; i++) {
            System.out.println("");
            for (int j = 0; j < columnas; j++) {
                System.out.print("\t[" + matriz[i][j] + "]\t");
            }
        }

        //promedio de una fila elegida por el usuario
        System.out.println("\nIngrese la fila que desea promediar");
        int fila = intro.nextInt()-1;

        int sumaFilas = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaFilas += matriz[fila][i];
        }

        System.out.println("El promedio de las filas "+(fila+1)+" es " + sumaFilas/matriz.length);

        //Sumar numeros de la diagonal
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            diagonal1 += matriz[i][matriz.length - 1];
            diagonal2 += matriz[i][i];
        }

        int sumaDiagonales = (diagonal1) + diagonal2;
        System.out.println(""+diagonal1);
        System.out.println(""+diagonal2);
        System.out.println("La suma de las diagonales es " + sumaDiagonales);

    }
}
