
package beans;

import java.io.Serializable;

public class PersonaBean implements Serializable{
    
    private String nombre;
    private int edad;
    
    public PersonaBean(){
        
    }
    
    public PersonaBean(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
   
    
}
