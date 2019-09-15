public class ContextStatico {

    public static void main(String[] args){

        Persona persona1 = new Persona("Juan");
        System.out.println(persona1);

        Persona persona2 = new Persona("Carla");
        System.out.println(persona2);

        System.out.println("Contador Personas"+Persona.getContadorPersonas());
        //lo static se asocia con la clase y no con el objeto
    }
}


class Persona{
    private int idPersona;
    private String nombre;
    public static int contadorPersonas;//incrementa por cada objeto creado
    //contadorPersonas esta dentro de la clase y no de el objeto
    public Persona(String nombre){

        this.idPersona = contadorPersonas++;//primero se asocia el valor y luego se incrementa
        this.nombre = nombre;
    }
    public int getIdPersona(){
        return this.idPersona;
    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public static int getContadorPersonas(){ //statico para asociarlo con la clase
        return contadorPersonas;
    }

    public String toString(){
        return "idPersona: "+idPersona +" nombre: "+nombre; //no concatenar el contadorPersonas por ser estatico
    }
}