package ejercicio.pkg6.pkg5;

import java.util.Scanner;

/*Programa utilizado para
*crear una plantilla de sueldo
 */
public class Ejercicio65 {

    final static int meses = 12;
    final static int saldo = 1;

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int cuentaCorriente[] = new int[meses];

        for (int i = 0; i < meses; i++) {
            System.out.println("Mes" + (i + 1));

            System.out.println("Ingrese sueldo: ");
            cuentaCorriente[i] = intro.nextInt();

        }
        // muestra los meses y sueldos
        for (int i = 0; i < meses; i++) {
            System.out.println("\tMes" + (i + 1) + "[" + cuentaCorriente[i] + "]\t");
        }

        //compara los meses del arreglo
        for (int i = 0; i < cuentaCorriente.length; i++) {
            if (cuentaCorriente[i] < 0) {
                System.out.println("EL mes " + (i + 1) + "/2019 el saldo es negativo $" + cuentaCorriente[i]);
            }
        }
        //mayor saldo
        int mayorSaldo = 0;
        int mes = 0;
        for (int i = 0; i < cuentaCorriente.length; i++) {
            if (cuentaCorriente[i] > mayorSaldo) {
                mayorSaldo = cuentaCorriente[i];
                mes = i * 1;
            }
        }

        System.out.println("El mes con mayor saldo es " + mes + "/2019 $ " + mayorSaldo);

        //promedio anual de sueldos en el año
        int acumSueldos = 0;
        
        for(int i = 0; i < cuentaCorriente.length; i++){
            acumSueldos += cuentaCorriente[0];
        }
        
        System.out.println("El promedio de sueldos en el año es "+acumSueldos/meses);
    }
}
