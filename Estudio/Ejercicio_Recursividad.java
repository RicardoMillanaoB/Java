import java.util.Scanner;
public class Recursividad {

    //Recursividad, recursividad
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese la opcion que quiere realizar");
        menu();
        int opcion = intro.nextInt();

        switch (opcion) {

            case 1:
                int numero = obtenerNumero();//factorial de un numeor de manera recursuva
                System.out.println(factorial(numero));
                break;

            case 2:
                int numeroFib = obtenerNumero();//fibonacci de numer ode forma recursiva
                System.out.println(fibonacci(numeroFib));
                break;
            case 3:
                int numeroPotencia = obtenerNumero();//cuadrado de un numero de forma recursiva
                System.out.println(potencia(numeroPotencia));
                break;
            case 4:
                int dividendo = dividendo();//cociente de un numer
                int divisor = divisor();
                int coc = cociente(dividendo, divisor);
                System.out.println("El cociente es: " + coc);
                break;
            case 5:
                int [] array = {1,2,3,4,5};//recorrer arreglo de forma recursiva
                mostrarArray(array, 0);
                break;
            case 6:
                int [] [] matriz ={ {1,2,3},// 2,2--
                                    {4,5,6},
                                    {7,8,9} };
                recorrerMatriz(matriz,0,0);
                break;
            case 7:
                String palabra= obtenerPalabra();
                System.out.println(invertirPalabra(palabra,palabra.length()-1));
                break;


        }


    }

    public static void menu() {
        System.out.println("1-Factorial de un numero\n2-Secuencia de Fibonacci\n3-Potencia cudrada\n4-Cociente");
        System.out.println("5-Recorrer arreglo\n6-Recorrer matriz\n7-Invertir palabra");
    }
    public static String obtenerPalabra(){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la palabra a invertir");
        String palabra = intro.next();

        return palabra;

    }

    public static int obtenerNumero() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese numero ");
        int numero = intro.nextInt();

        return numero;
    }

    public static int factorial(int numero) { //funcion para calcular el factorial de un numero
        int n;
        if (numero == 0) {
            return 1;
        } else {
            n = numero * factorial(numero - 1);
            System.out.println(n);
            return n;

        }

    }
    //////////////////// Fibonacci ////////////////////////////////7

    public static int fibonacci(int numero) {

        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }


    ////////////// Potencia cuadrada //////////////////////

    public static int potencia(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return numero * (numero);
        }
    }

    ////////////////////Cociente//////////////////////

    public static int dividendo() {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese el dividendo");
        int dividendo = intro.nextInt();

        return dividendo;
    }

    public static int divisor() {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese divisor");
        int divisor = intro.nextInt();

        return divisor;
    }

    public static int cociente(int dividendo, int divisor) {

        System.out.println("Llamada al cociente de " + dividendo + " y " + divisor);
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + cociente(dividendo - divisor, divisor);
        }
    }

    ///////////////////////Recorrer un array de forma recursiva/////////////////////

    public static void mostrarArray(int [] arreglo, int indice){

        if(indice == arreglo.length){

        }else{
            System.out.println(arreglo[indice]);
            indice++;
            mostrarArray(arreglo,indice);
        }
    }

    ///////////////////////Recorrer matriz///////////////////////////////77

    public static void recorrerMatriz(int [][] matriz, int i, int j){

        System.out.print("\t"+matriz[i][j]+"\t");


        if (i != matriz.length-1 || j != matriz[i].length-1){

            if(j == matriz[i].length-1){//si es que j llega a su tope regresa a 0 y comienza
                                        //la nueva columna
                i++;
                j = 0;
                System.out.println("");

            }else{
                j++;//de no pasar, avanza j
            }
            recorrerMatriz(matriz,i,j);
        }
    }

    /////////////////////Invertir numero ////////////////////////

    public static String invertirPalabra(String palabra,int largo){

        if (largo == 0) {
            return palabra.charAt(largo)+"";
        }else{
            return palabra.charAt(largo) +(invertirPalabra(palabra,largo-1));
        }

    }

}
