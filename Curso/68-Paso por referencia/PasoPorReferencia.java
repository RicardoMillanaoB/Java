package pasoporreferencia;

/**
 *Proyecto paso de valor por referencia
 * @author Ricardo
 */
public class PasoPorReferencia {

    
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.cambiarNombre( " Juan ");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
        public static void imprimirNombre(Persona p1){
            System.out.println("Nombre "+p1.obtenerNombre());
        
    }
        public static void modificarPersona(Persona arg){
            arg.cambiarNombre("Carlos");
        }
}
