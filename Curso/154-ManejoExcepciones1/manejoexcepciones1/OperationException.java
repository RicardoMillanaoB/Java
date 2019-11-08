package manejoexcepciones1;


public class OperationException extends Exception{ //Nuestra propia exception

    public OperationException(String mensaje) {
        //Inicializamos el mensaje de error de la clase padre
        super(mensaje);
    }
    
    
    
}
