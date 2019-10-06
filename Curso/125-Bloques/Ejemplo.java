//Un bloque de codigo contiene codigo y a diferencia que el resto de codigo 
//se ejecuta primero en la consola

public class Persona {
  private final int idPersona;
  private static int contadorPersonas;
  
  static{ //primer bloque, ejecuta primero que demas bloques
      System.out.println("Ejecuta bloque estatic");
      contadorPersona-10;
      }

  { // este bloque se ejecuta primero a no ser que exista uno static
  System.out.println("Ejecuta bloque inicializado");
  idPersona = contadorPersonas++;
  }
  
  Persona // Primero en el orden de ejecucion sin bloques
  {
  System.out.println("Ejecuta Constructor");
  }
  
}
