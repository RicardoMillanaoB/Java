
package datos;

import excepciones.*;

public class ImplementacionMySql implements AccesoDatos { // definir los metodos de la interface
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos");
        }else{
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if(simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else{
            System.out.println("Listar desde MySql");
        }
    }
    
    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    @Override
    public boolean isSimularError() {
        return simularError;
    }
}
