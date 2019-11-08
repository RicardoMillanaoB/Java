package manejorexcepciones2;

import manejoexcepciones1.*;

public class ManejoExcepcionesArg {
                                                                        //OperartionException 
    public static void main(String args[]) throws Exception {

        try {
            int op1 = Integer.parseInt(args[0]);//convertir el arreglo de tipo cadena al operando
            int op2 = Integer.parseInt(args[1]);

            Division div = new Division(op1, op2);
            div.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aie) {//solicitar un dato fuera del arreglo 
            System.out.println("Ocurrió una excepcion:");
            System.out.println("Hubo un error al acceder un elemento fuera de rango");
            aie.printStackTrace();
        }catch (NumberFormatException nfe){//formato de numero
            System.out.println("Ocurrió un exceptión: ");
            System.out.println("Uno de los argumenots no es entero");
            nfe.printStackTrace();
        }catch(OperationException oe){//finalmente nuestra excepcion
            System.out.println("Ocurrió una excepcion: ");
            System.out.println("Se trató de que el denominador es 0");
            oe.printStackTrace();
        }finally {
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}
