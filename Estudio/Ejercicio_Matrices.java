import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        preguntar();
    }

    public static void preguntar() {
        Scanner intro = new Scanner(System.in);
        int num1, num2;
        int resp = -1;

        System.out.println("Ingrese el largo del arreglo");
        num1 = intro.nextInt();
        System.out.println("ingrese el ancho del arrego");
        num2 = intro.nextInt();

        int[][] pato = new int[num2][num1];
        int[][] pares = new int[num2][num1];
        int[][] impares = new int[num2][num1];

        llenarMatriz(pato, pares, impares, num1, num2, resp);
        menu(pato, pares, impares, num1, num2, resp);
    }

    public static void menu(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {
        Scanner intro = new Scanner(System.in);

        System.out.println("\t MENU");
        System.out.println("1- Mostrar Matriz");
        System.out.println("2- Moatrar Pares");
        System.out.println("3- Mostrar Impares");
        System.out.println("4- Ingresar una nueva matriz");
        System.out.println("0- Salir");
        int num = intro.nextInt();

        switch (num) {
            case 1:
                mostrarMatriz(pato, pares, impares, num1, num2, resp);
                break;
            case 2:
                System.out.println("\t Pares");
                llenarPar(pato, pares, impares, num1, num2, resp);
                mostrarPar(pato, pares, impares, num1, num2, resp);
                break;
            case 3:
                System.out.println("\t Impares");
                llenarImpar(pato, pares, impares, num1, num2, resp);
                mostrarImpar(pato, pares, impares, num1, num2, resp);
                break;
            case 4:
                resp = 1;
                llenarMatriz(pato, pares, impares, num1, num2, resp);
                break;
            case 0:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Numero no valido");
                System.out.println();
                menu(pato, pares, impares, num1, num2, resp);
                break;
        }
    }

    public static int[][] llenarMatriz(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {
        if (resp == 1) {
            preguntar();
        }
        Scanner intro = new Scanner(System.in);
        int total = num1 * num2;
        System.out.println("Ingrese " + total + " numeros distintos de 0");
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                do {
                    pato[i][j] = intro.nextInt();
                    if (pato[i][j] == 0) {
                        System.out.println("Debe ingresar un numero distinto de 0");
                    }
                } while (pato[i][j] == 0);

            }
        }
        if (resp == 1) {
            menu(pato, pares, impares, num1, num2, resp);
        }
        return pato;
    }

    public static int[][] llenarPar(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {
        for (int i = 0; i < pato.length; i++) {
            for (int j = 0; j < pato[i].length; j++) {
                if (pato[i][j] % 2 == 0) {                      //pato: // 1  2 //
                    pares[i][j] = pato[i][j];                            // 3 4 //
                } else {
                    pares[i][j] = 0;                            //pares: // 0 2 //
                }                                                        // 0 4 //
            }
        }
        return pares;
    }

    public static int[][] llenarImpar(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {
        for (int i = 0; i < num2; i++) { // = pato.lenth
            for (int j = 0; j < num1; j++) {// = patol[i].length//pato: //1  2 //
                if (pato[i][j] % 2 == 1) {                             // 3  4 //
                    impares[i][j] = pato[i][j];
                } else {                                   //impares   // 1  0 //
                    impares[i][j] = 0;                                 // 3  0 //
                }
            }
        }
        return impares;
    }

    public static void mostrarPar(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {

        for (int i = 0; i < pares.length; i++) {
            for (int j = 0; j < pares[i].length; j++) {             //pares // " " 2 //
                if (pares[i][j] != 0) {                                     // " " 4 //
                    System.out.print(pares[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        menu(pato, pares, impares, num1, num2, resp);
    }

    public static void mostrarImpar(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {
        for (int i = 0; i < pato.length; i++) {
            for (int j = 0; j < pato[i].length; j++) {
                if (impares[i][j] != 0) {                       //impares // 1 " " //
                    System.out.print(impares[i][j] + " ");                // 3 " " //
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        menu(pato, pares, impares, num1, num2, resp);
    }

    public static void mostrarMatriz(int pato[][], int pares[][], int impares[][], int num1, int num2, int resp) {
        int totalNum = num1 * num2;
        System.out.println("ingrese :" + totalNum + " numeros, distintos de 0");
        System.out.println("\t Matriz");
        for (int i = 0; i < pato.length; i++) {
            for (int j = 0; j < pato[i].length; j++) {
                System.out.print(pato[i][j] + " ");
            }
            System.out.println();
        }
        menu(pato, pares, impares, num1, num2, resp);
    }
}
