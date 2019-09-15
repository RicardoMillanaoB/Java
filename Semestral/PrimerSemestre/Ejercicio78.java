package ejercicio.pkg7.pkg8;

import java.util.Scanner;

/**
 * Programa utllizado para calcular el sueldo de trabajadores segun horas
 * trabajadas utilizando metodos
 *
 * @author Ricardo
 */
public class Ejercicio78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int empleados = numeroEmpleados();
        int horas[] = new int[empleados];
        arregloHoras(empleados, horas);
        
        
        int sueldos [] = new int [empleados];
        
        arregloSueldos(horas, sueldos);
        mostrarArreglo(sueldos);
        System.out.println("El menor sueldo es "+menorSueldo(sueldos));
        System.out.println("El mayor sueldo es "+mayorSueldo(sueldos));
    }

    public static int numeroEmpleados() {
        Scanner intro = new Scanner(System.in);

        System.out.println("Cuantos empleados tiene ");
        int empleados = intro.nextInt();

        return empleados;
    }

    public static void arregloHoras(int cantEmpleados, int[] arreglo) {
        Scanner intro = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("Ingrese horas trabajadas para el empleado " + (i + 1));
            arreglo[i] = intro.nextInt();

        }

    }

    public static void mostrarArreglo(int [] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("sueldo "+arreglo[i]);
        }
    }
    
    public static int menorSueldo(int [] arreglo){
        
        int menorSueldo = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] < menorSueldo){
                menorSueldo = arreglo[i];
            }
        }
        return menorSueldo;
    }
    
    public static int mayorSueldo(int [] arreglo){
        
        int mayorSueldo = arreglo[0];
        
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > mayorSueldo){
                mayorSueldo = arreglo[i];
            }
        }
        return mayorSueldo;
    }
    
    public static void arregloSueldos(int [] arregloHoras,int [] arregloSueldos){
        
        int bonus = 0;
        int resta = 0;
        for(int i = 0; i < arregloHoras.length; i++){
           
            if (arregloHoras[i]>40) {
             resta = arregloHoras[i]-40;
            if(resta>0 && resta <= 3){
                bonus = resta * 2000;
            }else{
                if(resta >= 4 && resta <= 7){
                    bonus = resta * 3000;
                }else if (resta > 7){
                    bonus = resta * 3500;
                }
            }
            arregloSueldos[i] = (arregloHoras[i]-resta)*5000 + bonus;
        }else{
                arregloSueldos[i] = arregloHoras[i]*5000;
            }
           
        }
        
    }
    
    
}
