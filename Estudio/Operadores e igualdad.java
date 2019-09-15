package javaapplication19;
import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        
        // OPERADORES
        
        int a = 4; 
        a++;// suma de uno a uno
        a--; // resta de uno a uno
        a += 3; // incrementacion de a 3
        
        boolean c = true;
        boolean cNegativo = !c; // auxiliar de variable contraria a la anterior
       
          int g = 3;
          int h = ++g; // preincremento, imprime ambas 4

          int j = 4;
          int k = j++; // postincremento, imprime solo j = 5y k = 4

          int x=2, z = 3;  
          boolean d = ( a == z);//  d   es falso
        
         // IGUALDADES
         
         //objetos(String) utilizacion de equals:
         
         String f= "Hola", s= "Chao";
        boolean verificar = ( f.equals(s)); // falso
        boolean verificar2 = (x != z); // verdadero
      
        int hola = 4;
        boolean descanzo = (hola > 3) ?  false : true; // if simplificado
        
        boolean vacaciones = true; // ejemplos
        
        if ( vacaciones == true || descanzo == false){
            System.out.println("Tiempo disponible");
        }
        
        boolean par = hola%2==0;
        String ji = String.valueOf(par);
        System.out.println(ji+ji);
    }
    
}
