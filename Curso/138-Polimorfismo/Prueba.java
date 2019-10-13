
public class Prueba {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Esteban", 12000);
        Gerente gerente1 = new Gerente("Toman Echaurruen", 600000, "Gerencia general");
        System.out.println("Empleado1");
        imprimirDetalle(empleado1);
      
        System.out.println("Gerente");
        gerente1.obtenerDetalles();
       imprimirDetalle(gerente1);

    }
public static void imprimirDetalle(Empleado emp){
    System.out.println(emp.obtenerDetaller); // aqui ocurre el polimorfismo, al utilizar emp como un gerente

}

}
