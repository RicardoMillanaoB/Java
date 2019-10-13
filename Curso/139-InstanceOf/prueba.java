
public class prueba {

    public static void main(String[] args) {
       FiguraGeometrica figura = new Elipse();

        determinarTipo(figura); //devuelve "Es una elipse"
    }

    private static void determinarTipo(Object figura) {
        if (figura instanceof Elipse) {
            System.out.println("Es una elipse");
        } else if (figura instanceof Circulo) {
            System.out.println("Es un circulo");
        } else if (figura instanceof FiguraGeometrica) {
            System.out.println("Es una figura geometrica");
        } else if (figura instanceof Object) {
            System.out.println("Es un object");
        } else {
            System.out.println("No se encontro un tipo");
        }
    }
}
