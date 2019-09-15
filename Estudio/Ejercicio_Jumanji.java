package jumanji;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Jumanji {

    final static int largo = 27;

    public static void main(String[] args) {

        String[] tablero = new String[largo];//inicializa el tablero
        llenarTablero(tablero); //llena con espacios
        int posicion1 = 0;
        int posicion2 = 0;
        int posicion3 = 0;
        String nombre1 = nombre();
        String nombre2 = nombre();
        String nombre3 = nombre();

        do {
            //Turno jugador 1
            System.out.println("\nTurno de "+nombre1);
            remover1(posicion1, tablero);//remueve jugada anterior
            posicion1 += dado(posicion1);//acumula las posiciones jugadas
            posicion1 = verificacion(posicion1);//verifica si el acumulador es valido
            turno1(tablero, posicion1, nombre1);//modifica las jugadas

            //Turno jugador 2
            System.out.println("\nTurno de "+nombre2);
            remover2(posicion2, tablero);//remueve jugada anterior
            posicion2 += dado(posicion2);//acumula las posiciones jugadas
            posicion2 = verificacion(posicion2);//verifica si el acumulador es valido
            turno2(tablero, posicion2, nombre2);//modifica las jugadas

            //Turno jugador 3
            System.out.println("\nTurno de "+nombre3);
            remover3(posicion3, tablero);//remueve jugada anterior
            posicion3 += dado(posicion3);//acumula las posiciones jugadas
            posicion3 = verificacion(posicion3);//verifica si el acumulador es valido
            turno3(tablero, posicion3, nombre3);//modifica las jugadas

            mostrarTablero(tablero);//muestra tablero

        } while ((posicion1 < largo - 1) && (posicion2 < largo - 1) && (posicion3 < largo - 1));
        System.out.println("El ganador fue:  " + ganador(nombre1, posicion1, nombre2, posicion2, nombre3, posicion3));
    }

    public static String[] llenarTablero(String[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = " ";
        }
        return tablero;
    }

    public static String nombre() {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese el nombre del jugador");
        String nombre = intro.next();

        return nombre;
    }

    public static int dado(int posicion) { // Genera el dado
        Random random = new Random();
        boolean primo = false;
        boolean par = false;

        int cont = 0;
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23};
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int dado = dado1 + dado2;
        int iterador = 0;

        par = dado % 2 == 0;

        switch(dado){
            case 10:
                dado = 5;
                break;
            case 20:
                dado = 5;
                break;
            default:
                break;
        }

            for (int j = 1; j < largo; j++) {//verificacion de numero primo
                primo = dado % j == 0;
                if (primo) {
                    cont++;
                }
            }

            if (cont == 2) {// numero primo

                for (int i = 1; i < primos.length; i++) {
                       
                    if ((posicion < primos[i]) && posicion >= primos[i - 1]) {
                        iterador = i;
                    }
                    
                }
                System.out.println("Primo, se movera al lugar "+dado);
                    dado = primos[iterador];

            }else{
                if(par == true){
                    System.out.println("Numero par");
                    dado = 2;
                }else{
                    if(par == false){
                        System.out.println("Numero impar");{
                            dado = -1;
                        }
                    }
                }
            }

        System.out.println("\nEl jugador se moverÃ¡ "+dado+" lugares\n");
        return dado;
}

    //                             jugador 1

    public static void remover1(int posicion, String [] tablero){//remueve al jugador
        tablero[posicion] = "";
    }
    public static int verificacion (int posicion) {//verifica si la posicion es menor o no
        if (posicion < 1) {
            posicion = 0;
        } else {
            if (posicion >= largo) {
                posicion = largo - 1;
            } else {
                posicion = posicion;
            }

        }
        return posicion;
    }

    public static String [] turno1(String [] tablero, int posicion, String nombre){//ingresa nueva posicion con nombre

            tablero[posicion] = nombre;

        return tablero;
    }

    //                              jugador 2

    public static void remover2(int posicion, String [] tablero){//remueve al jugador
        tablero[posicion] = "";
    }

    public static String [] turno2(String [] tablero, int posicion, String nombre){//ingresa nueva posicion con nombre

        tablero[posicion] = nombre;

        return tablero;
    }

    //                              jugador 3

    public static void remover3(int posicion, String [] tablero){//remueve al jugador
        tablero[posicion] = "";
    }
    public static String [] turno3(String [] tablero, int posicion, String nombre){//ingresa nueva posicion con nombre

        tablero[posicion] = nombre;

        return tablero;
    }


    public static void mostrarTablero(String [] tablero){//muestra tablero
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < tablero.length; i++){

            System.out.printf("["+(i+1)+" "+tablero[i]+"]-");
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public static String ganador(String nombre1, int posicion1, String nombre2, int posicion2, String nombre3, int posicion3 ){


        String ganador = " ";
        if(posicion1 == (largo-1)){
            ganador = nombre1;
        }else{
            if(posicion2 == (largo-1)){
                ganador = nombre2;
            }else{
                if(posicion3 == (largo-1)){
                    ganador = nombre3;
                }
            }
        }
        return ganador;
    }

}
