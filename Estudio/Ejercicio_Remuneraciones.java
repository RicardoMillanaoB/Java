package seguros.metodos;

import java.util.Random;
import java.util.Scanner;

public class SegurosMetodos {

    static final int EMPLEADOS = 2;
    static final int MESES = 3;

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int remuneraciones[][] = new int[EMPLEADOS][MESES];
        int opcion;
        
        mostrarMenu();
        do {
            System.out.println("\n---------------------------\nIngrese una opcion");
            opcion = intro.nextInt();

            switch (opcion) {

                case 1:
                    matriz(remuneraciones);
                    motrar(remuneraciones);
                    break;
                case 2:
                    int mayorRem = mayorRemuneracion(remuneraciones);
                    int empleadoRem = empleadoRem(remuneraciones);
                    System.out.println("\n\nEl mayor pago fue de $" + mayorRem + " ganado por el empleado " + empleadoRem);
                    break;
                case 3:
                    System.out.println("\nEl mes con menor pago: " + menorPago(remuneraciones));
                    break;
                case 4:
                    System.out.println("\nEl promedio anual de remuneraciones es: " + promedioRem(remuneraciones));
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Ingrese la opcion nuevamente");
                    break;
            }
        } while (opcion != 5);

    }

    public static void mostrarMenu(){
        System.out.println("\n1-Generacion de matriz\n2-Mayor sueldo\n3-Mes con menor pago\n4-Promedio anual de remuneraciones\n5-Salir");
    }
    
    public static int[][] matriz(int[][] remuneraciones) {

        Scanner intro = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Desea ingresar generar o ingresar las remuneraciones");
        String condicion = intro.next();

        if (condicion.equalsIgnoreCase("generar")) {
            for (int i = 0; i < EMPLEADOS; i++) {
                for (int j = 0; j < MESES; j++) {
                    remuneraciones[i][j] = random.nextInt(10) + 1;
                }
            }

        } else {
            for (int i = 0; i < EMPLEADOS; i++) {
                System.out.println("EMPLEADO" + (i + 1));
                for (int j = 0; j < MESES; j++) {
                    System.out.println("Ingrese remuneracion para el mes " + (1 + i));
                    remuneraciones[i][j] = intro.nextInt();
                }
            }
        }

        return remuneraciones;
    }

    public static void motrar(int[][] remuneraciones) {

        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.println("\n");
            for (int j = 0; j < MESES; j++) {
                System.out.print("\t" + remuneraciones[i][j] + "\t");
            }
        }
    }

    public static int mayorRemuneracion(int[][] remuneraciones) {
        int nMayor = 0;

        for (int i = 0; i < EMPLEADOS; i++) {

            int mes;
            for (int j = 0; j < MESES; j++) {
                if (remuneraciones[i][j] > nMayor) {
                    nMayor = remuneraciones[i][j];

                }
            }
        }

        return nMayor;
    }

    public static int empleadoRem(int[][] remuneraciones) {
        int nMayor = 0;
        int empleado = 0;
        for (int i = 0; i < EMPLEADOS; i++) {
            nMayor = 0;
            empleado = 0;
            for (int j = 0; j < MESES; j++) {
                if (remuneraciones[i][j] > nMayor) {
                    nMayor = remuneraciones[i][j];
                    empleado = i;
                }
            }
        }
        return empleado + 1;

    }

    public static int menorPago(int[][] remuneraciones) {
        int suma = 0;
        int menor = 999999999;
        int mes = 0;

        for (int j = 0; j < MESES; j++) {
            suma = 0;
            for (int i = 0; i < EMPLEADOS; i++) {
                suma = suma + remuneraciones[i][j];
            }
            if (suma < menor) {
                menor = suma;
                mes = j;
            }
        }
        return mes + 1;
    }

    public static float promedioRem(int[][] remuneraciones) {
        int suma = 0;
        for (int i = 0; i < EMPLEADOS; i++) {
            for (int j = 0; j < MESES; j++) {
                suma = suma + remuneraciones[i][j];
            }
        }

        return (float) suma / MESES;
    }
}
