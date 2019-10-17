package datos;


public interface AccesoDatos {

    public static int MAX_REGISTROS = 10;
    public abstract void insertar();// siempre seran public y abstractos los metodos
    public abstract void listar();
    
}
