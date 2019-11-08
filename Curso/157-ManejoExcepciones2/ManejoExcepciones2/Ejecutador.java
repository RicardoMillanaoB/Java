package ManejoExcepciones2;

import datos.*;
import excepciones.*;

public class Ejecutador {

    public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionMySql();
        //cambiamos el estado a simularError = true
        datos.simularError(true);
        ejecutar(datos, "listar");

        //Cambiamos el estado simular Error = false
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos, "insertar");
    }

    public static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equalsIgnoreCase(accion)) {
            try {
                datos.listar();
            } //si se van a procesar varias exceptiones de la misma jerarquia
            // siempre se debe procesar primero la excepcion de menor jerarquia
            //y posteriormente de la mayor jerarquia
            catch (LecturaDatosEx ex) {
                      System.out.println("Error lectura: Procesa la excepcion mas especifica de lectura de datos");
            }catch(AccesoDatosEx ex ){
                System.out.println("Error Acceso datos: Procesa la excepcion mas generica de acceso a datos");
            }catch (Exception ex){
                System.out.println("Error general");
            }finally{
                System.out.println("Procesar finally es opciones, siempre ejecutara sin importar si hubo error o no");
            }
        }else if ( "insertar".equalsIgnoreCase(accion)){
            try{
                datos.insertar();
                
            }catch (AccesoDatosEx ex){
                System.out.println("Error acceso datos: Podermos procesar sla la excepcion mas generica");
            }
            finally{
                System.out.println("Procesar finally es opcionl, simpre se ejecutara sin importar si hubo error o no");
            }
        }
        else System.out.println("No se proporciono ninguna opcion conocida");
    }
}
