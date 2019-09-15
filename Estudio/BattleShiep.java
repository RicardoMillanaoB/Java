package batteshiep;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pc
 */
public class BatteShiep {

    final static int largo = 5;

    public static void main(String[] args) {
        String ganador;
        int contJugador = 0;
        int contMaquina = 0;
        int[][] jugador1 = new int[largo][largo];
        int[][] jugador2 = new int[largo][largo];

        int barcosJugador = azarJugador1(jugador1);
        mostrarJugador1(jugador1);

        int barcosMaquina = azarJugador2(jugador2);
      
        do {
            mostrarJugador2(jugador2);
            contJugador += recibirAtaqueManual(jugador2);//incluye el registrar ataque
            
              
            contMaquina += recibirAtaqueMaquina(jugador1);
     

            if (barcosJugador == contMaquina) {
                mostrarJugador1(jugador1);
                System.out.println("Has perdido");
            } else {
                if (barcosMaquina == contJugador) {
                    mostrarJugador2(jugador2);
                    System.out.println("Has gaaaanado");
                }
            }
        } while (barcosJugador != contMaquina && barcosMaquina != contJugador);

    }

    public static int azarJugador1(int[][] jugador1) {
        int acum = 0;
        Random random = new Random();
        for (int i = 0; i < jugador1.length; i++) {
            for (int j = 0; j < jugador1.length; j++) {
                jugador1[i][j] = random.nextInt(2) + 0;
                acum += jugador1[i][j];
            }
        }
        return acum;
    }

    public static void mostrarJugador1(int[][] jugador1) {

        for (int i = 0; i < jugador1.length; i++) {
            System.out.println("");
            for (int j = 0; j < jugador1.length; j++) {
                System.out.print("\t" + jugador1[i][j] + "\t");
            }

        }
    }

    public static int azarJugador2(int[][] jugador2) {
        Random random = new Random();
        int acum = 0;
        for (int i = 0; i < jugador2.length; i++) {
            for (int j = 0; j < jugador2.length; j++) {
                jugador2[i][j] = random.nextInt(2) + 0;
                acum += jugador2[i][j];
            }
        }
        return acum;
    }

    public static void mostrarJugador2(int[][] jugador2) {

        for (int i = 0; i < jugador2.length; i++) {
            System.out.println("");
            for (int j = 0; j < jugador2.length; j++) {
                System.out.print("\t" + jugador2[i][j] + "\t");
            }

        }
    }

    public static int ataqueX() {
        Scanner intro = new Scanner(System.in);
        int coordenada;
        System.out.println("\nIngrese el la coordenada x ");
        do {
            coordenada = intro.nextInt();

            if (coordenada > 4 || coordenada < 0) {
                System.out.println("Numero no admitido");
            }

        } while (coordenada > 4 || coordenada < 0);

        return coordenada;

    }

    public static int ataqueY() {
        Scanner intro = new Scanner(System.in);
        int coordenada;
        System.out.println("Ingrese el la coordenada Y ");
        do {
            coordenada = intro.nextInt();

            if (coordenada > 4 || coordenada < 0) {
                System.out.println("Numero no admitido");
            }

        } while (coordenada > 4 || coordenada < 0);

        return coordenada;

    }

    public static int ataqueMaquinaX() {
        Random random = new Random();
        int x;

        do {
            x = random.nextInt(4) + 1;
        } while (x > 5 || x < 0);

        return x;

    }

    public static int ataqueMaquinaY() {
        Random random = new Random();
        int y;

        do {
            y = random.nextInt(4) + 1;
        } while (y > 5 || y < 0);

        return y;
    }

    public static int recibirAtaqueManual(int[][] jugador2) {

        int x = ataqueX();
        int y = ataqueY();
        int cont = 0;

        for (int i = 0; i < jugador2.length; i++) {
            for (int j = 0; j < jugador2.length; j++) {
                if (jugador2[x][y] == 1) {
                    System.out.println("Has hundido un barco");
                    jugador2[x][y] = 0;
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int recibirAtaqueMaquina(int[][] jugador1) {
        int x = ataqueMaquinaX();
        int y = ataqueMaquinaY();
        int cont = 0;

        for (int i = 0; i < jugador1.length; i++) {
            for (int j = 0; j < jugador1.length; j++) {
                if (jugador1[x][y] == 1) {
                    System.out.println("Te hundieron un barco");
                    
                    jugador1[x][y] = 888;
                    mostrarJugador1(jugador1);
                    cont++;
                }
            }
        }
        return cont;

    }
}
