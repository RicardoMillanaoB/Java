package paquete;

public class Argumentos {

    public static void main(String[] args) {
        
    
        String palabra = "      Multiples variables 2";
        boolean condicion = true;
        
        variosParametros1(1, 3, 4);
        variosParametros2(palabra,condicion,10,2,54,4,5,6);
        
    
    }
    public static void variosParametros1( int ... numeros) {

        System.out.println("        Multiples variables 1");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
    public static void variosParametros2(String palabra, boolean condicion, int ... numeros){
        System.out.println(palabra);
        
        for(int a : numeros){
            System.out.println(a );
        }
    }
}
