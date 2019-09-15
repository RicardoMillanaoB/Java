public class PruebaEncapsulamiento {

    public static void main(String [] args){
        Persona persona1 = new Persona("Juan","Olave",true);

        System.out.println(persona1.getNombre());
        persona1.setNombre("Carlos"); //modifica nombre con el metodo set

        System.out.println(persona1);//no es necesariocolocar toStrin
        //toString imprime el estado del objeto

    }

}
