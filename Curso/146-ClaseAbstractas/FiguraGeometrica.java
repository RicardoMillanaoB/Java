
package pkg143.clasesabstractas;


public abstract class FiguraGeometrica {

    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();
    
    @Override
    public String toString(){
        return "Tipo de Figura: "+this.tipoFigura;
    }
    
}
