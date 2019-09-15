package matriz.simetrica;

import java.util.Scanner;

public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int nFilas, nColumnas;
        boolean simetrica = true;

        System.out.println("Digite el numero de filas");
        nFilas = intro.nextInt();
        System.out.println("Digite el numero de columnas");
        nColumnas = intro.nextInt();

        int matriz[][] = new int[nFilas][nColumnas];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.println("Matriz[" + i + "] [" + j + "]: ");
                matriz[i][j] = intro.nextInt();

            }
        }

        if (nFilas == nColumnas) {
            int i = 0;
            int j = 0;
            while(i<nFilas && simetrica == true){
                while(j<i && simetrica == true){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica == true) {
                System.out.println("La matriz es simetrica");
            }else{
                System.out.println("La matriz no es simetrica");
            }
        } else {
            System.out.println("La matriz no es simitrica");// no es cuadrada
        }

    }

}
