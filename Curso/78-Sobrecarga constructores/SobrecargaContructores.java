public class SobrecargaContructores {

    public static void maint(String [] args){

        Persona persona1 = new Persona("Lilia",22);
        System.out.println("Persona1 = "+persona1);

        Empleado empleado1 = new Empleado("Pedro",34,1800000);
        System.out.println("empleado1 = " + empleado1);
    }


}
