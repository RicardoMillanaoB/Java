

public class Escritor extends Empleado{

    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre , double sueldo, TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura;
    }
  @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nTipo Escritura: "+tipoEscritura.getTipoEscritura();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
}
