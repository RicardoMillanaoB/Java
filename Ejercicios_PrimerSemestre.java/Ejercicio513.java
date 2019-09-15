package ejercicio.pkg5.pkg13;
import java.util.Scanner;

public class Ejercicio513 {

 public static void main(String[] args) {
     
     Scanner intro = new Scanner(System.in);
     
//     int cont=1;
//     String corredor1, corredor2, corredor3, corredor4, corredor5,corredor6, corredor7, corredor8, corredor9, corredor10, equipo, numero1;
//     
//     
//         
//        System.out.println("Nombre del corredor "+cont);        
//        corredor1 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor2 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor3 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;     
//       System.out.println("Nombre del corredor "+cont);        
//        corredor4 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor5 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor6 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor7 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor8 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor "+cont);        
//        corredor9 = intro.next();
//       System.out.println("Equipo del corredor n° "+cont);
//        equipo = intro.next();
//       cont++;
//       System.out.println("Nombre del corredor"+cont);        
//        corredor10 = intro.next();
//       System.out.println("Equipo del corredor n° "+ cont);
//        equipo = intro.next();
//    
//
//         
//             System.out.println("Nombre del corredor: "+corredor1+"  Equipo del corredor: "+equipo1 );
//         
//          
//             System.out.println("Nombre del corredor: "+corredor2+"  Equipo del corredor: "+equipo2);
//         
//         
//             System.out.println("Nombre del corredor: "+corredor3+"  Equipo del corredor: "+equipo3);
//         
//         
//             System.out.println("Nombre del corredor: "+corredor4+"  Equipo del corredor: "+equipo4);
//         
//         
//             System.out.println("Nombre del corredor: "+corredor5+"  Equipo del corredor: "+equipo5);
//         
//             
//             System.out.println("Nombre del corredor: "+corredor6+"  Equipo del corredor: "+equipo6);
//         
//             System.out.println("Nombre del corredor: "+corredor7+"  Equipo del corredor: "+equipo7);
//         
//          
//             System.out.println("Nombre del corredor: "+corredor8+"  Equipo del corredor: "+equipo8);
//        
//             System.out.println("Nombre del corredor: "+corredor9+"  Equipo del corredor: "+equipo9);
//       
//             System.out.println("Nombre del corredor: "+corredor10+"  Equipo del corredor: "+equipo10+);
         
 int cont= 0, premio = 100000, premio1, premio2, premio3, corredores;
String corredor,equipo,equipo1,equipo2,equipo3;

     System.out.println("Total de corredores:");
     corredores = intro.nextInt();

     
     System.out.println("Ingrese el nombre del primer equipo");
                 equipo1 = intro.next();
                 System.out.println("Ingrese el nombre del primer equipo");
                 equipo2 = intro.next();
                 System.out.println("Ingrese el nombre del primer equipo");
                 equipo3 = intro.next();
     
     do{
                

            cont++;
            premio= premio-20000;
                 System.out.println("Escribir nombre del corredor:"+cont);
                corredor = intro.next();
                 System.out.println("Ingrese nombre del equipo");
                 equipo = intro.next();
                 if (equipo.equalsIgnoreCase(equipo1) || equipo.equalsIgnoreCase(equipo2) || equipo.equalsIgnoreCase(equipo3)) {
                     
                 } else{ System.out.println("Ingrese el equipo nuevamente");
                     equipo = intro.next();
                 
                            }
                 
                 premio1 = 40000;
                 premio2 = 20000;
                 premio3 = 0;

                 System.out.println();
                 
                  if (cont == 1 )
                      System.out.println("Puesto n°" + cont +"  "+ corredor + " ha ganado: $"+premio);
                     if (cont == 2 )
                      System.out.println("Puesto n°" + cont + "  "+ corredor + " ha ganado: $"+premio);
                     if (cont == 3 )
                      System.out.println("Puesto n°" + cont +"  " + corredor + " ha ganado: $"+premio);
                     if (cont == 4 )
                      System.out.println("Puesto n°" + cont +"  "+ corredor + " ha ganado: $"+premio1);
                     if (cont == 5 )
                      System.out.println("Puesto n°" + cont +"  "+ corredor + " ha ganado: $"+premio1);
                     if (cont == 6 )
                      System.out.println("Puesto n°" + cont +"  "+ corredor + " ha ganado: $"+premio1);
                     if (cont == 7 )
                      System.out.println("Puesto n°" + cont +"  "+ corredor + " ha ganado: $"+premio2);
                     if (cont == 8 )
                      System.out.println("Puesto n°" + cont + "  "+corredor + " ha ganado: $"+premio2);
                     if (cont == 9 )
                      System.out.println("Puesto n°" + cont + "  " +corredor + " ha ganado: $"+premio2);
                     if (cont == 10 )
                      System.out.println("Puesto n°" + cont +"  " + corredor + " ha ganado: $"+premio2);
                     if (cont > 10 )
                      System.out.println("Puesto n°" + cont +"  "+ corredor + " no califica como premiio");

 } while (cont<=corredores);
}
    
}
