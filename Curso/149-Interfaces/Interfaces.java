package datos;


public class Interfaces {

    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");
        
        datos = new ImplementacionMySql();
        ejecutar(datos, "insertar");
    }

    public static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equalsIgnoreCase(accion)){
            datos.listar();
        }else if("insertar".equalsIgnoreCase(accion)){
            
           datos.insertar();
        }
    }
}
