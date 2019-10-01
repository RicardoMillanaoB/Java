
package paquete;


public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //Atributo de cada elemento de una enumeracion
    private final int paises;
    
    //contructor
    Continentes(int paises){
        this.paises  = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
