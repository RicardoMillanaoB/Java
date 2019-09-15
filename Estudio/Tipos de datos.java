
package javaapplication18;
import java.util.Scanner;


public class JavaApplication18 {

    
    public static void main(String[] args) {
        // Concatenacion
        
        String nombre = "Alberto";
        String apellido = "Vargas";
        
        System.out.println(nombre +" "+ apellido);
        System.out.println("Nueva linea \n"+apellido);
        System.out.println("Tabulador \t"+ apellido);
        System.out.println("Retroceso \b"+ apellido);
        System.out.println("Retorno de carro: \r" + nombre);
        
        // Scanners
        
        // ( import java.util.Scanner;)
        
        Scanner intro = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        String usuario = intro.next();
        System.out.println("Saludos "+usuario);
        
        //Tamaño minimo y maximo: byte, short, int, long
        
        System.out.println("bits tipo byte "+Byte.SIZE);
        System.out.println("bits tipo byte "+Byte.BYTES);
        System.out.println("Valor minimo de bits "+Byte.MIN_VALUE);
        System.out.println("Valor maximo de bits"+Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo shor "+Short.SIZE);
        System.out.println("bits tipo short "+ Short.BYTES);
        System.out.println("Valor minimo de short "+Short.MIN_VALUE);
        System.out.println("Valor maximo de short"+Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo Integer "+Integer.SIZE);
        System.out.println("bits tipo Integer "+Integer.BYTES);
        System.out.println("Valor minimo de Integer "+Integer.MIN_VALUE);
        System.out.println("Valor maximo de Integer"+Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo Long "+Long.SIZE);
        System.out.println("bits tipo Long "+Long.BYTES);
        System.out.println("Valor minimo de Long "+Long.MIN_VALUE);
        System.out.println("Valor maximo de Long"+Long.MAX_VALUE);
        
        byte byteValor = 15;
        System.out.println("byte "+byteValor);
        short shortValor = 12;
        System.out.println("short "+shortValor);
        int intValor = 18;
        System.out.println("int "+intValor);
        long longValor = 25;
        System.out.println("long "+longValor);
    
        // base decimal, hexadecimal y octadecimal
        
        byte bi = 10;//decimal
        byte b2  = 0xa; // exadecimal   
        byte b3 = 012;// octal
        
        // Tipo flotantes
        
        //float, double
        System.out.println("bits tipo Float "+Float.SIZE);
        System.out.println("bits tipo Float "+Float.BYTES);
        System.out.println("Valor minimo de Float "+Float.MIN_VALUE);
        System.out.println("Valor maximo de Float "+Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo Double "+Double.SIZE);
        System.out.println("bits tipo Double "+Double.BYTES);
        System.out.println("Valor minimo de Double "+Double.MIN_VALUE);
        System.out.println("Valor maximo de Double "+Double.MAX_VALUE);
        
        float floatVar = 0.5F;//cambio
        double doubleVar = 10D; //cambio
        
        // Tipo Booleanos
        
        boolean booleanTrue = true;
        boolean booleanFalse = false;
        
        if (booleanTrue = true){
            System.out.println("El codigo es verdadera");
        }else if (booleanFalse = false){
            System.out.println("El codigo es falso");
        }
        
        System.out.println("Ingrese su edad");
        int edad = intro.nextInt();
        
        boolean adulto = edad >= 18;
        
        if( adulto ){
            System.out.println("El tipo es un adulto");}
    
        // Conversion de tipos primitivos
        
        int variable = Integer.parseInt("2");
        double variable2 = Double.parseDouble("23");
        
        char variable3 = "Hola".charAt(1);// char no se puede convertir ya que utiliza caracteres
        System.out.println("caracter" + variable3);
        
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
