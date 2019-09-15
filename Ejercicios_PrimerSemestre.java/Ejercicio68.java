package ejercicio.pkg6.pkg8;

import java.util.Scanner;

/**
 * Secuencia Criba de Eratóstenes
 *
 * @author Ricardo
 */
public class Ejercicio68 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese la cantidad maxima de numeros a generar");
        int N = intro.nextInt();

        int acum2 = 2;
        int acum3 = 3;
        int acum4 = 4;
        int acum5 = 5;
        int acum6 = 6;

//        for(int i = 1; i <= N; i++){
//           
//        
//  
//            if((acum2+1 != acum3)){
//                System.out.println("El numero primo es "+(acum2+1));
//            }else{
//                if((acum3+1) != acum4){
//                    System.out.println("El numero primo es "+(acum3+1));
//                }else{
//                    if((acum4+1)!= acum5){
//                        System.out.println("El numero primo es "+(acum4+1));
//                  
//                }else{
//                        if((acum5+1) != acum6){
//                            System.out.println("El numero primo es "+(acum5+1));
//                        }
//                    }
//            }
//        }
//        
//        acum2 += 2;
//        acum3 += 3;
//        acum4 += 4;
//        acum4 += 5;
//        acum6 +=6;
//        
//     
//        
//        
//        }
       
        int primo[] = new int[N];
        for (int i = 0; i <100; i++) {

            if (i != acum2 && i != acum3 && i != acum4 && i != acum5) {
                primo[i] = i;
            } else{
                continue;
            }
            
            acum2 += 2;
            acum3 += 3;
            acum4 += 4;
            acum4 += 5;
        }
        
        for(int i = 0; i < primo.length; i++){
            System.out.println("Primo "+primo[i]);
        }
    }

}
