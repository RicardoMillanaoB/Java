public class Empleado extends Persona{

    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo){
        super(nombre, edad);
        this.sueldo = sueldo;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String toString(){
        return super.toString()+ " Empleado{" +
                "sueldo ="+sueldo+
                '}';
    }//toString clase padre

}
