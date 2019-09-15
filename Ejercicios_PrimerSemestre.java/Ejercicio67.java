package ejercicio.pkg6.pkg7;

import java.util.Scanner;

/*Programa utilizado para
        *calcular las ventas de un vendedor
        *de CD's
 */
public class Ejercicio67 {

    final static int mes = 30;

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int ventas[] = new int[mes];

        for (int i = 0; i < ventas.length; i++) { // llenado de arreglo
            do {
                System.out.println("Ingrese venta realizada para el dia " + (i + 1));
                ventas[i] = intro.nextInt();
                if(ventas[i] > 50 && ventas[i] < 0){//validacion
                    System.out.println("Datos sobrepasados");
                }
            } while (ventas[i] > 50 && ventas[i] < 0);
        }

        int quincena = 0;
        for(int i = 0; i < ventas.length/2; i++){
            quincena += ventas[i];
        }
        System.out.println("El promedio de los primeros 15 dias es "+quincena/15);
    
    int mayorVenta = 0;
    int dia = 0;
    for(int i = 0; i < ventas.length; i++){
        if(ventas [i] > 345000){
            System.out.println("El dia "+(i+1)+" las ventas fueron mayores a $345.000");
        }
        if(ventas[i] > mayorVenta){
            mayorVenta = ventas[i];
            dia = (i*1)+1;
        }
    }
    
        System.out.println("El dia con mayor venta es el dia "+dia+" por el monto de $"+mayorVenta);
    
}
}
