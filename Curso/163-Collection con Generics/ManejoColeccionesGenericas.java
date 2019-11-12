package manejoColecconesGenericas;
import java.util.*;

public class ManejoColeccionesGenericas {

    public static void main(String[] args) {
        
        List<String> lista1 = new ArrayList<String>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("3");
        lista1.add("4");
        lista1.add("5");
        imprimir(lista1);
        
        Set<String> lista2 = new HashSet<String>();
        lista2.add("100");
        lista2.add("200");
        lista2.add("300");
        lista2.add("400");
        lista2.add("400");//no se va agregar, se omite
        imprimir(lista2);
        
        Map<String , String> mapa = new HashMap<>();
        //llava, valor
        mapa.put("1","Juan");
        mapa.put("2","Carlos");
        mapa.put("3","Samuel");
        mapa.put("4","Pedro");
        imprimir(mapa.keySet());
        imprimir(mapa.values());
    }
   public static void imprimir(Collection<String> coleccion){
       for(String elemento : coleccion){
           System.out.print(elemento+" ");
       }
       System.out.println("");
   }

}
