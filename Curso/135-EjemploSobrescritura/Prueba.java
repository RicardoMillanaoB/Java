
public class Prueba {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Esteban", 12000);
        Gerente gerente1 = new Gerente("Toman Echaurruen", 600000, "Gerencia general");
        System.out.println("Empleado1");
        empleado1.obtenerDetalles();
      
        System.out.println("Gerente");
        gerente1.obtenerDetalles();
       

    }


}
