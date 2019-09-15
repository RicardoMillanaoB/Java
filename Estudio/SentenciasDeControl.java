package sentencias.de.control;
import java.util.Scanner;
public class SentenciasDeControl {

   public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
       // Switch ( Interruptor ) menu de opciones
     
       System.out.println("Ingrese el menú: \n(1)Ensalada\n(2)Postre");
       int expresion = intro.nextInt();
       String menu;
      switch (expresion) {
       case 1 :
            menu = "ensalada";
            break;
       default :
           menu = "postre";
           break;
   }
      
       for (int i = 0; i < 10; i++) {
           System.out.println(""+i);
       }
      
       }    
}
