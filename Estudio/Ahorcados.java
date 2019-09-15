package ahorcados;
//faltan los aciertos con contador

import java.util.Scanner;
import java.util.ArrayList;

public class Ahorcados {

    final static int columnas = 20;
    final static int filas = 20;

    public static void main(String[] args) {

        String cuerpo[][] = llenarCuerpo();// llena la matriz con el dibujo del ahorcado

        //1//   [-===========]
        //2//   []         O/
        //3//   []       __|__
        //4//   []         |
        //5//   []       /  \
        //6//123456789012345678
        ArrayList<Character> palabraArray = traspasoArray(palabraEvaluada());

        ArrayList<Character> palabraMostrada = new ArrayList<Character>();
        llenadoArrayMostrar(palabraMostrada, palabraArray);
        int intentos = 0;
        char letra;

        do {
            letra = leerLetra();
            intentos++;

            modificacionPalabra(palabraArray, palabraMostrada, cuerpo, letra, intentos);//ArrayList que muestra la palabra a jugar
        } while (intentos < 5);
    }

    public static String[][] llenarCuerpo() {

        String cuerpo[][] = {{"[", "=", "=", "=", "=", "=", "=", "=", "=", "}{", "=", "=", "=", "=", "=", "=|"},
        {"|", "[", " ", " ", " ", " ", "  {", " ", "_", "_", " ", "} ", "  //"},
        {"|", "|", " ", " ", " ", " ", " |", "{Â° .", "Â°}", "| //"},
        {"|", "|", " ", " ", " ", " ", " |", "{", " o ", "}", "|"},
        {"|", "|", " ", " ", " ", " ", "", "{--", " |", "-- }"},
        {"|", "|", "", " ", " ", " ", " //", "  ||", " "},
        {"|", "|", "", " ", " ", " ", "//", " ", "  ||", " "},
        {"|", "|", "  ", " ", " ", " ", " ", "//", " //", " "},
        {"|", "|", " ", " ", " ", " ", " ", "//", " //", " "}};
        return cuerpo;
    }

    public static void imprimirCuerpo(String[][] cuerpo) {
        for (int i = 0; i < cuerpo.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < cuerpo[i].length; j++) {
                System.out.print(" " + cuerpo[i][j]);
            }
        }
    }

    public static String palabraEvaluada() {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese la palabra a evaluar");
        String palabra = intro.next();

        return palabra;
    }

    public static ArrayList<Character> traspasoArray(String palabra) {
        ArrayList<Character> palabraArray = new ArrayList<Character>();//Se envian la palabra en una descomposicion en un ArrayList

        for (int i = 0; i < palabra.length(); i++) {
            palabraArray.add(palabra.charAt(i));
        }
        return palabraArray;//Retorna un ArrayList con los caracteres de la palabra
    }

    public static char leerLetra() {
        Scanner intro = new Scanner(System.in);
        boolean verificacion = false;
        System.out.println("\nIngrese la letra");
        String letra;
        do {
            letra = intro.next();//verifica que la letra ingresada no sea una palabra

            verificacion = letra.length() < 2;

        } while (!verificacion);

        char caracter = letra.charAt(0);//convierte String a char

        return caracter;
    }
    public static ArrayList<Character> llenadoArrayMostrar(ArrayList<Character> palabraMostrada,ArrayList<Character>palabraEvaluada){
        for (int i = 0; i < palabraEvaluada.size(); i++) {
            palabraMostrada.add('_');
        }
        return palabraMostrada;
    }

    public static ArrayList<Character> modificacionPalabra(ArrayList<Character> palabraEvaluada, ArrayList<Character> palabraMostrada, String[][] cuerpo, char letra, int intentos) {//modifica las palabras segun los aciertos

        //incorporar Aciertos
        int aciertos = 0;
        char letraAcertada;

        //llenado de nuevo Array
      
        for (int i = 0; i < palabraEvaluada.size(); i++) {
            
            if (letra == palabraEvaluada.get(i)) {
                palabraMostrada.set(i,letra);
                aciertos++;
                System.out.println("\nHas acertadooo");
            }
        }
        if (aciertos > 0) {//mustra los resultados de las condicionales
            for (int i = 0; i < palabraMostrada.size(); i++) {
                System.out.print(palabraMostrada.get(i));
            }
        } else {
            System.out.println("No has acertado\nIntentos restantes " + (5 - intentos));
            switch (intentos) {
                case 1:
                    ahorcado1(cuerpo);
                    break;
                case 2:
                    ahorcado2(cuerpo);
                    break;
                case 3:
                    ahorcado3(cuerpo);
                    break;
                case 4:
                    ahorcado4(cuerpo);
                    break;
                case 5:
                    ahorcado5(cuerpo);
                    break;
            }
        }
        return palabraMostrada;
    }

    public static void ahorcado1(String[][] cuerpo) {

        for (int i = 5; i < cuerpo.length; i++) {
            System.out.println("");
            for (int j = 0; j < 1; j++) {
                System.out.print(cuerpo[i][j]);
            }
        }

    }

    public static void ahorcado2(String[][] cuerpo) {

        for (int i = 0; i < cuerpo.length; i++) {
            System.out.println("");
            for (int j = 0; j < 1; j++) {
                System.out.print(cuerpo[i][j]);
            }
        }

    }

    public static void ahorcado3(String[][] cuerpo) {

        for (int i = 0; i < cuerpo.length; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(cuerpo[i][j]);
            }
        }

    }

    public static void ahorcado4(String[][] cuerpo) {

        for (int i = 0; i < cuerpo.length; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(cuerpo[i][j]);
            }
        }

    }

    public static void ahorcado5(String[][] cuerpo) {

        for (int i = 0; i < cuerpo.length; i++) {
            System.out.println("");
            for (int j = 0; j < cuerpo[i].length; j++) {
                System.out.print(cuerpo[i][j]);
            }
        }

    }

}


}
