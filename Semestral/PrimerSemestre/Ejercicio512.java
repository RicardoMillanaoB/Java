package ejercicio.pkg5.pkg12;
import java.util.Scanner;

public class Ejercicio512 {

    public static void main(String[] args) {
        
        Scanner intro = new Scanner(System.in);
        
        int base = 300, carnes = 0;
        int carne;
        String churrasco, lomo_cerdo,ave,atun, condicion1;
        
        System.out.println("base sandwich"+base);
        System.out.println();
        System.out.println("¿Desea agregar carne? (S/N)");
        condicion1 = intro.next();
        
          if (condicion1.equalsIgnoreCase("S")) {
      
         
               
                   System.out.println("churrasco (S/N)");
                    churrasco = intro.next();        
                    if (churrasco.equalsIgnoreCase("S")){
                            carne = 400;
                            carnes= carne +carnes;
                        }else{
                        carne = 0;
                    }
                   System.out.println("lomo cerdo (S/N)");
                  lomo_cerdo = intro.next();
                       if (lomo_cerdo.equalsIgnoreCase("S")){
                            carne = 350;
                            carnes = carne + carnes;
                        }else{
                            carne = 0;
                       }
                  System.out.println("ave (S/N)");
                  ave = intro.next();
                       if (ave.equalsIgnoreCase("S")){
                            carne = 250;
                            carnes = carne + carnes;
                       }else{
                            carne = 0;
                        }
                 System.out.println("atun (S/N)");
                    atun = intro.next();
                        if (atun.equalsIgnoreCase("S")){
                           carne = 350;
                           carnes = carne + carnes;
                        }else{
                            carne = 0;
                        }
                        
              if (carnes>400){
                  System.out.println("No permitido, ingrese datos nuevamente");               
                  }
         

}else{ 
              carne = 0;
              carnes=0;
          }   
          
          
          
    int cont=0;
    int ingrediente, ingredientes;
  String condicion2, lechuga,tomate,champiñon, palta, palomitas,queso,tocino,jamon,huevo_frito,cebolla;

System.out.println("¿Desea agregar ingredientes?  (S/N)");
  condicion2 = intro.next();  

  if (condicion2.equalsIgnoreCase("S")) {               

                 System.out.println("lechuga (S/N)");
                              lechuga = intro.next();
                               if (lechuga.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                System.out.println("tomate (S/N)");
                              tomate = intro.next();
                               if (tomate.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }      
                System.out.println("champiñon (S/N)");
                              champiñon = intro.next();
                               if (champiñon.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("palta (S/N)");
                              palta = intro.next();
                               if (palta.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("palomitas (S/N)");
                              palomitas = intro.next();
                               if (palomitas.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("queso (S/N)");
                              queso = intro.next();
                               if (queso.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("tocino (S/N)");
                              tocino = intro.next();
                               if (tocino.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("jamon (S/N)");
                              jamon = intro.next();
                               if (jamon.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("huevo frito (S/N)");
                              huevo_frito = intro.next();
                               if (huevo_frito.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;
                               }
                 System.out.println("cebolla (S/N)");
                              cebolla = intro.next();
                               if (cebolla.equalsIgnoreCase("S")){
                                    ingrediente = 150;
                                    cont ++;
                               }else{
                                    ingrediente = 0;    
                               }

                               
                               if (cont>=3 && cont<5) {
                                   ingredientes = 120*cont;
                                   }else{
                                            if (cont>=5){
                                                ingredientes = 100*cont;
                                              }else{
                                                   ingredientes = 150*cont;
                                       }
                                  }             
            }else{
                          ingredientes = 0;
                        }              
            
             int total;
 
             total = base+carnes+ingredientes;
  
             System.out.println();
              System.out.println("base de sandwich: $"+base);
              System.out.println("carne de sandwich: $"+carnes);
              System.out.println("Ingredientes: $"+ingredientes);
              System.out.println("Total: $"+total);
          
    }
    }
    
      
    
    
     
        
    
    

