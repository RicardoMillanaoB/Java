
public class Prueba {

    public static void main(String[] args) {
        
    

    Empleado escritor= new Escritor("Roy",15000,TipoEscritura.CLASICO);
    
    imprimirDetalles(escritor);
    
    Empleado gerente1 = new Gerente("Tomas Subercaseaux",10000,"Sistemas");
        imprimirDetalles(gerente1);
    Empleado empleado = new Empleado("Juan martinez",1000);
        imprimirDetalles(empleado);
    }
    
    public static void imprimirDetalles(Empleado empleado){
        String resultado  = null;
        
        if(empleado instanceof Escritor){
            
            Escritor escritor = (Escritor) empleado;
            System.out.println(escritor.obtenerDetalles());
            
        }else if(empleado instanceof Gerente){
           resultado = ((Gerente) empleado).getDepartamento();
            System.out.println(empleado.obtenerDetalles()+resultado);
        }else{
            System.out.println(empleado.obtenerDetalles());
        }
        
    }
}
