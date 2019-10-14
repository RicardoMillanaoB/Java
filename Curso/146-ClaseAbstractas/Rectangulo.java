
package pkg143.clasesabstractas;


public class Rectangulo extends FiguraGeometrica{

    public Rectangulo (String tipoFigura) {
        super(tipoFigura);
    }
    @Override
    public void dibujar() {
        System.out.println("Aca deberia dibujar un: " + this.tipoFigura);
    //el metoro siver para obtener el nombre de la clase
    }
}
