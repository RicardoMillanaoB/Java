package ejercicio.pkg7.pkg10;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Ejercicio710 {

    public static void main(String[] args) {

        String palabra = ingresarPalabra();
        System.out.println("La cantidad de letras vocales es "+Cuenta_Vocales(palabra));
        System.out.println("La cantidad de letras es "+palabra.length());
    }

    public static String ingresarPalabra() {

        Scanner intro = new Scanner(System.in);
        String palabra;
        do {

            System.out.println("Ingrese palabra");
            palabra = intro.next();

            if (palabra.length() > 30) {
                System.out.println("Palabra sobre pasa 30 caracteres");
            }
        } while (palabra.length() > 30);

        return palabra;
    }
    public static int Cuenta_Vocales(String palabra ){
        int cantidadVocales = 0;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0; 
        int u = 0;
        for(int j = 0; j < palabra.length(); j++){
           switch(palabra.charAt(j)){
            case 'a': 
            a++;
            break;
            case 'e':
            e++;
            break;
            case 'i':
            i++;
            break;
            case 'o':
            o++;
            break;
            case 'u':
            u++;
            break;
            
        }
        }
        System.out.println("cantidad de a: "+a);
        System.out.println("Cantidad de e: "+e);
        System.out.println("Cantidad de i: "+i);
        System.out.println("Cantidad de o: "+o);
        System.out.println("Cantidad de u: "+u);
        
        cantidadVocales = a+e+i+o+u;
        return cantidadVocales;
    }
    
}
