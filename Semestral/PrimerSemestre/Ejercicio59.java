package ejercicio.pkg5.pkg9;
import java.util.Scanner;

public class Ejercicio59 {

    public static void main(String[] args) {
           Scanner intro = new Scanner(System.in);
        
        int  n1, n2 ,n3, n4 ,n5, g1 ,g2, g3 ,g4 ,g5, acierto= 0, noaciertos= 0;
        float premio;
        
        System.out.println("Ingrese el premio a sortearse: ");
        premio = intro.nextInt();
        
        System.out.println("Ingrese los numeros escogidos: ");
        
        do {
            System.out.println("Ingrese el primero numero:");
            n1 = intro.nextInt();
            
        }while (n1>41);
        do {
            System.out.println("Ingrese el segundo numero:");
            n2 = intro.nextInt();
            
        }while (n2>41);
        do {
            System.out.println("Ingrese el tercer numero:");
            n3 = intro.nextInt();
            
        }while (n3>41);
        
        do {
            System.out.println("Ingrese el cuarto numero:");
            n4 = intro.nextInt();
            
        }while (n4>41);
        
        do {
            System.out.println("Ingrese el quinto  numero:");
            n5 = intro.nextInt();
            
        }while (n5>41);
        

        
        g1   = 8;
        g2 = 10;
        g3 = 16;
        g4 = 25;
        g5  = 34;
        
        System.out.println(("Numero ingresado:\n " +n1 +"\n " +n2+ "\n "+n3+"\n "+ n4+ "\n "+n5)+("Numeros ganadores: \n"+g1 +"\n" +g2+ "\n"+g3+"\n"+ g4+ "\n"+g5));
        
        if (n1 == g1){
            acierto = acierto + 1;
        }else{
            noaciertos = noaciertos +1;
        }
         if (n2 == g2){
            acierto = acierto + 1;
       }else{
             noaciertos = noaciertos + 1;
         }
          if (n3 == g3){
            acierto = acierto + 1;
      }else{
              noaciertos = noaciertos + 1;
          }
           if (n4 == g4){
            acierto = acierto + 1;
     }else{
               noaciertos = noaciertos + 1;
           }
            if (n5 == g5){
            acierto = acierto + 1;
     }else{
                noaciertos = noaciertos + 1;
            }
   
          if (acierto == 5)  {
              System.out.println("Ganaste el premio de: $"+premio);
          }
            
            
            System.out.println("Numero de aciertos: "+acierto);
            System.out.println("Numero de no aciertos: "+ noaciertos);
    
    }
  
}
