package ejercicio.pkg6.pkg9;

import java.util.Scanner;

/**
 * Programa para calcular promedios segu arreglo PROM
 *
 * @author Ricardo
 */
public class Ejercicio69 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos");
        int alumnos = intro.nextInt();

        float PROM[] = new float[alumnos];

        // Llenado de areglo
        for (int i = 0; i < PROM.length; i++) {
            System.out.println("Ingrese el promedio para el alumno " + (i + 1));
            PROM[i] = intro.nextInt();
        }
        int cont = 0;
        float promMenor = PROM[0];
       float promMayor = PROM[0];
        int notas = 0;
        for (int i = 0; i < PROM.length; i++) {
            notas += PROM[i];
            if(PROM[i] > promMayor){
                promMayor = PROM[i];
            }
            if(PROM[i] < promMenor){
                promMenor = PROM[i];
            }
            if(PROM[i] >= 4.5 && PROM[i]<=6.0){
            cont ++;
            System.out.println("El alumno "+(i+1)+"obtuvo un promedio entre 4.5 y 6.0. Promedio: "+PROM[i]);
            }
            
        }
        System.out.println("La cantidad de promedio entre 4.5 y 6.0 es "+cont);
        System.out.println("El promedio de es " + notas / alumnos);
        System.out.println("El promedio menor es "+promMenor);
        System.out.println("El promedio menor es "+promMayor);
    }

}
