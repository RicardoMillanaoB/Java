public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    private Persona(){
        this.idPersona = ++contadorPersonas;
    }

    //Sobrecarga del contructores
    //debe tener diferete numeros de argumentos

    public Persona(String nombre, int edad){
        this();//mandar a llamar al constructor privado
        this.nombre = nombre;
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
