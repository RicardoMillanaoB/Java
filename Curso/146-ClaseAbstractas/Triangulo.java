
package pkg143.clasesabstractas;


public class Triangulo extends FiguraGeometrica{
public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }
    @Override
    public void dibujar() {
        System.out.println("Aca deberia dibujar un: " + this.getClass().getSimpleName());
    //el metoro siver para obtener el nombre de la clase
    }
}
