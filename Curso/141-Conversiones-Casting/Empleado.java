
public class Empleado {

    protected String nombre;
    protected double sueldo;

    protected Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "\nNombre: " + nombre + "\nSueldo: "
                + sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
}
