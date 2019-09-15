package numeroespecial;

import java.util.Scanner;

public class Numeroespecial {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int numero = ingresarNumero();
        
        int canDivisores = largo(numero);
        int divisores[] = new int[canDivisores];
        
        int cantPrimos = largosPrimos(divisores);
        int primos[] = new int[cantPrimos];
        int especiales [] = {3,5,7};

        generacionDivisores(divisores, numero);
        mostrarDivisores(divisores);
        generacionPrimos(divisores,primos);
        mostrarPrimos(primos);
        System.out.println("primos"+cantPrimos);
    }

    public static int ingresarNumero() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = intro.nextInt();
        return numero;
    }

    public static int largo(int numero) {
        boolean divisores;
        int cont = 0;
        int arreglo[] = {numero};

        for (int j = 0; j < (numero + 1); j++) {
            if (j == 0) {
                continue;
            }
            divisores = arreglo[0] % j == 0;
            if (divisores) {
                cont++;

            }
        }
        int largo = cont;
        return largo;

    }

    public static int[] generacionDivisores(int[] divisores, int numero) {

        boolean divisoresBan;
        int cont = 0;
        for (int i = 0; i < numero + 1; i++) {

            if (i == 0) {
                continue;
            }
            divisoresBan = numero % i == 0;
            if (divisoresBan) {
                divisores[cont] = i;
                cont++;
            }
        }

        return divisores;
    }

    public static void mostrarDivisores(int divisores[]) {
        for (int i = 0; i < divisores.length; i++) {
            System.out.println(divisores[i]);

        }
    }

    public static int largosPrimos(int divisores[]) {

       
        int cont = 0;
        int contPrimo = 0;

        for (int i = 0; i < divisores.length; i++) {
            cont=0;
            for (int j = 0; j < divisores.length+1; j++) {

                    if (j == 0) {
                        continue;
                    }
                   boolean primos = divisores[i] % j == 0;
                    if (primos) {
                        cont++;
                    }
                }
            
            if (cont == 2) {
                contPrimo++;
             
            }
        }
     
        return contPrimo;
    }
    
    public static int [] generacionPrimos(int [] divisores, int [] primos){
        boolean primosBan;
        int cont = 0;
        for(int i =0 ; i < divisores.length; i++){
           int  contPrimos  = 0;
            for(int j = 0; j < divisores.length; j++){
                if(j == 0){
                    continue;
                }
                primosBan = divisores[i] % j == 0;
                
                if(primosBan){
                    cont++;
                    
                }
            }
            if ( contPrimos == 2){
                primos[cont] = divisores[i];
                cont++;
            }
        }
        return primos;
    }
  
    public static void mostrarPrimos(int [] primos){
        for (int i = 0; i < primos.length; i++) {
            System.out.println(primos[i]);
        }
    }
   
}
