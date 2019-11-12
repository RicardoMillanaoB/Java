package Ejecucion;
import java.util.*;

public class ManejoColecciones {

    public static void main(String [] args){
        
        List lista = new ArrayList();//interfas
        lista.add("1");//lista de tipo object por no especificar el tipo de argumento
        lista.add("2");
        lista.add("3");
        lista.add("4");
        //elemento repetido, se puede utilizar elementos repetidos
        lista.add("4");
        imprimir(lista);
        
        Set listaSet = new HashSet();
        listaSet.add("100");
        listaSet.add("200");
        listaSet.add("300");
        listaSet.add("400");
        //Set no permite elementos repetidos y no se agregan
        listaSet.add("400");
        imprimir(listaSet);
        
        Map mapa = new HashMap();
        //tiene la foma de llave y valor
        mapa.put("1","Juan"); //por default es tipo Object
        mapa.put("2","Carlos");
        mapa.put("3","Rosario");
        mapa.put("14","Esperanz");
        //Se imprimen todas las llaves
        imprimir(mapa.keySet());
        //Se imprimen todos los valores
        imprimir(mapa.values());
    }
    
    private static void imprimir(Collection coleccion){//todos tienen en comun la interfaz de collection
        for(Object elemento : coleccion){
            System.out.print(elemento+" ");
            
        }
        System.out.println("");
    }
}
