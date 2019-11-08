package manejoexcepciones1;


public class Ejecutador {

    public static void main(String[] args) {
        try {
             Division division1 = new Division(4, 0);//no deja crear objeto sin try catch
             division1.visualizarOperacion();
        } catch (OperationException oe) { //posible exception
            //si arroja la exception oe será la variable
            
            /*
            Ocurrió un error!
                    OperationException: Denominador igual a cero
	at Division.<init>(Division.java:11)
	at Ejecutador.main(Ejecutador.java:6)
            */
            
            System.out.println("Ocurrió un error!");
            oe.printStackTrace();
        }
       
    }
}
