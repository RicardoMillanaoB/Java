package ejercicio.pkg6.pkg6;

import java.util.Scanner;

/* Programa utilizado para 
*calculo de ventas y remuneracion
*de un vendedor segun sus ventas
 */
public class Ejercicio66 {

    final static int rangoArreglo = 30;

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int arregloVentas[] = new int[rangoArreglo];

        //ingresa ventas
        for (int i = 0; i < arregloVentas.length; i++) {
            System.out.println("Ingrese venta dia n°" + (i + 1));
            arregloVentas[i] = intro.nextInt();
        }

        //mayor venta del mes, total ventas
        int mayorVenta = 0;
        int dia = 0;
        int totalVentas = 0;
        for (int i = 0; i < arregloVentas.length; i++) {
            totalVentas += arregloVentas[i];
            if (arregloVentas[i] > mayorVenta) {
                mayorVenta = arregloVentas[i];
                dia = i*1;     
            }
            
        }
        System.out.println("El dia con mayor venta es el dia n°"+(dia+1)+" "+arregloVentas[dia]);
        System.out.println("Total de ventas del mes "+totalVentas);
        
        for(int i = 0; i < arregloVentas.length; i++){
            if(arregloVentas[i] < 10000){
                System.out.println("El dia n° "+(i+1)+" las ventas son menores a $10.000");
            }
        }
        
        System.out.println("La remuneracion para el empleado en ventas es de "+(totalVentas*0.01));
        
    }

}
