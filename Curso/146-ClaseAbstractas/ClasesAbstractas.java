package pkg143.clasesabstractas;


public class ClasesAbstractas {

    public static void main(String[] args) {
        
        FiguraGeometrica circulo = new Circulo("Circulo");
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
    
    
        System.out.println(rectangulo);
       //System.out.println(rectangulo.toString());
                
        rectangulo.dibujar();
    
    }

}
