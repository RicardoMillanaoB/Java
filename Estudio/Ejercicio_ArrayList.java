import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/*

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
*/
public class ejercicio {

    final static int largo = 15;

    public static void main(String [] args) {

        //crear un ArrayList de 15 elementos aleatorios

        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> primos = new ArrayList<Integer>();
        ArrayList<Integer> compuestos = new ArrayList<Integer>();
        int opcion = 0;
        generar(lista);//genera si repeticion
        do {
            menu();
            opcion = opcion();
            switch(opcion) {
                case 1:
                    imprimir(lista);
                    break;
                case 2:
                    burbuja(lista);//arreglo burbuja
                    imprimir(lista);
                    break;
                case 3:
                    System.out.println("Suma de numero "+suma(lista));
                    break;
                case 4:
                primos(lista, primos);
                imprimir(primos);
                break;
                case 5:
                imprimir(compuestos);
                break;
                case 6:
                    modificarIndice(lista);
                    imprimir(lista);
                break;
                case 7:
                    modificarNumero(lista);
                    imprimir(lista);
                break;
                    //leerNumero(lista);
                case 10:
                    System.out.println("Saliendo. . .");
                    break;
            }
        }while(opcion != 10);
    }
    public static ArrayList<Integer> generar(ArrayList <Integer> lista){//generacion de random sin repeticiones

        Random random = new Random();
        for(int i = 0; i < largo; i++){
            lista.add(random.nextInt(15)+1);
            for(int j = 0; j < i; j++){
                if(lista.get(i) == lista.get(j)){
                    lista.remove(i);
                    i--;
                }
            }
        }
        return lista;
    }
    public static ArrayList<Integer> burbuja(ArrayList<Integer> lista){// arreglo burbuja en ArrayList
        int aux = 0;
        for(int i = 0; i < (lista.size()-1);i++){
            for(int j = 0; j < (lista.size()-1); j++){
                if(lista.get(j) > lista.get(j+1)){
                    aux = lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1,aux);
                }
            }
        }
        return lista;
    }
    public static int suma(ArrayList<Integer> lista){
        int suma = 0;
        for(int i = 0; i < lista.size(); i ++){
            suma += lista.get(i);
        }
        return suma;
    }
    public static ArrayList<Integer> primos (ArrayList<Integer> lista,ArrayList<Integer> primos){
        boolean isPrimo = false;
        int cont = 0;
        for(int i = 0; i < lista.size(); i++){
            cont = 0;
            for(int j = 0; j < lista.size(); j++){
                isPrimo = lista.get(i) % lista.get(j) == 0;
                if(isPrimo){
                    cont++;
                }
            }
            if(cont == 2){
              primos.add(lista.get(i));
            }
        }
        return primos;
    }
    public static ArrayList<Integer> compuestos (ArrayList <Integer> lista, ArrayList <Integer> compuestos){
        int cont = 0 ;
        boolean isPrimo;
        for(int i = 0; i < lista.size(); i++){
            cont = 0;
            for(int j = 0; j < lista.size(); j++){
                isPrimo = lista.get(i) % lista.get(j) == 0;
                if(isPrimo == true){
                    cont++;
                }
            }
            if(cont != 2){
                compuestos.add(lista.get(i));
            }
        }
        return compuestos;
    }

    public static ArrayList<Integer> modificarIndice(ArrayList <Integer> lista){//modificar segun el indice
        Scanner intro = new Scanner(System.in);
        int numeroModificar = leerNumero(lista);

        System.out.println("Ingrese numero por el cual desea cambiar:["+numeroModificar+"]");
        int numeroNuevo = intro.nextInt();

        lista.set(numeroModificar,numeroNuevo);


        return lista;
    }
    public static int leerNumero(ArrayList <Integer> lista){// Metodos para modificar un numero del array
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un nÃºmero");
        int numero;
        do{
            numero = intro.nextInt();

            if(!lista.contains(numero)) {
                System.out.println("El numero no estÃ¡");
            }
        }while(!lista.contains(numero));
        return numero;
    }
    public static ArrayList<Integer> modificarNumero(ArrayList <Integer> lista){//modificar segun el mumero
        Scanner intro = new Scanner(System.in);
        int numeroModificar = leerNumero(lista);

        System.out.println("Ingrese numero por el cual desea cambiar:["+numeroModificar+"]");
        int numeroNuevo = intro.nextInt();

        lista.remove(numeroModificar);
        lista.add(numeroNuevo);


        return lista;
    }

    public static void imprimir(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size(); i++){
            System.out.printf("\n[%d]",lista.get(i));

        }
        System.out.println("\n_____________________________________________________");
    }
    public static int opcion(){
        Scanner intro = new Scanner(System.in);
        String numeroPrueba;
        boolean coincideNumero;
        System.out.println("Ingrese numero");
        do{
            numeroPrueba = intro.next();
            //coincideNumero = numeroPrueba.matches("[1-10]{1,1}");
            //if(!coincideNumero){
               // System.out.println("Falso douuu");
            //}
        }while(numeroPrueba.equals("1000000"));
        int numero = Integer.parseInt(numeroPrueba);
        return numero;
    }
public static void menu(){
    System.out.println("\n1-Imprimr lista\n2-Ordenar\n3-Suma\n4-Primos\n5-Compuestos\n6-Modificar segÃºn indice\n7-Modificar segun numero");
}
