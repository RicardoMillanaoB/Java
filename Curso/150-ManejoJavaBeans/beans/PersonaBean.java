
package beans;

import java.io.Serializable;

// 1.Implementa la interface Serializable del paquete java.io
public class PersonaBean implements Serializable{
    
// 2.Cada propiedad es de tipo private y sus getters and stetters
    private String nombre;
    private int edad;
    
    // 3.Siempre tiene un constructor sin argumentos
    public PersonaBean(){
        
    }
    
    public PersonaBean(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
    
}
