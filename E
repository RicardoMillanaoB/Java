package ejercicio.pkg5.pkg11;
import java.util.Scanner;

public class Ejercicio511 {

    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        
        Float calificacion, promedio,mitad;
        
        float nota=0;
        float notas=0;
        float max=0;
        int mal = 0;
        int bien=0;
        
        String condicion1, califica;
        
        do {
                        System.out.println("Ingrese nota:  ");
                        calificacion = intro.nextFloat();
                        
                        notas =calificacion+notas;
                        nota ++;
                        
                        if ( calificacion  > max) {
                            max = calificacion;
                        } else{
                            max  = max;
                        }
                        
                        if (calificacion<4){
                            mal++;
                        }else{
                            bien++;
                        }
                        
                        System.out.println("Desea agregar mas notas:  (S/N)");
                        condicion1 = intro.next();
                        
        } while (condicion1.equalsIgnoreCase("S"));
                        
                        
                     promedio = (notas/nota);       
                     mitad = (nota/2);
                     if (promedio>=4 && bien < mitad) {
                         califica = " Aprobado ";
                     }else{
                         califica = " Reprobado ";
                     }
                     
                     
                     System.out.println("Nota mas alta: "+ max);
                     System.out.println("Cantidad de notas rojas: "+mal);
                     System.out.println("Cantidad de notas azules: "+ bien);
                     System.out.println("El promedio es: "+ promedio);
                     System.out.println();

                     System.out.println("EL alumno es " + califica );
       
    }
    
}
