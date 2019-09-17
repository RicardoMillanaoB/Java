package cambiar.tipo;


public class CambiarTipo {

    
    public static void main(String[] args) {
        
        int variable = Integer.parseInt("2");//parsear desde string
        double variable2 = Double.parseDouble("23");
        
        char variable3 = "Hola".charAt(1);// char no se puede convertir ya que utiliza caracteres
        System.out.println("caracter" + variable3);
       
        int entero = 1;
        String enteroString = Integer.toString(entero); //convierte de int a string
        
        String variable4 = intro.next();
        int variable5 = Integer.parseInt(intro.next());// asignacion de String a una variable int nueva
        
        char caracter = intro.next().charAt(0);
        System.out.println("caracter = "+caracter);// imprime caracteres
        
        int valorInt = 5;
        String valorString = String.valueOf(valorInt);// asignacion entero a String
        
        byte vite = 10;
        short chort = vite; // asignacion simple (numeros de bits correpondidos)
        
        short chort2 = 12;
        byte  vite2 = (byte) chort2; // asignacion  sobreescrita ( por ser de menores bytes)
        
    }
    
}
