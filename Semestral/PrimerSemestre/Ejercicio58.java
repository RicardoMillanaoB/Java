package ejercicio.pkg5.pkg8;
import java.util.Scanner;

public class Ejercicio58 {

    
    public static void main(String[] args) {
        
        // Ecuacion de la recta//
        
        int x1, y1 ,x2, y2;
        float m,b,y;
        double mod;
        Scanner intro = new Scanner(System.in);
        
        System.out.println("Ingrese cordenada x1");
        x1 = intro.nextInt();
        System.out.println("Ingrese cordenada y1");
        y1 = intro.nextInt();
        System.out.println("Ingrese cordenada x2");
        x2 = intro.nextInt();
        System.out.println("Ingrese cordenada y1: ");
        y2 = intro.nextInt();
        System.out.println();
        
        System.out.println("Sus cordenadas:  i)  "+x1+","+y1+"  ii)  "+x2+","+y2);
        
        // pendiente//
        
        m = ((y2 - y1)/(x2 - x1));
        // y = mx + b
        
        b = -x1*m + y1;
        
        System.out.println("Ecuacion de la recta: y = "+m+ "X +"+b );
        
       //Modulo//
       
       mod = ((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
       mod = Math.sqrt(mod);
       
        System.out.println("La distancia entre las cordenas es: "+ mod);
}
}