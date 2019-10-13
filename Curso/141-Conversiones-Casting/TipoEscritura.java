

public enum TipoEscritura {

    CLASICO ("Escritura a Mano"),
    MODERNO ("Escritura Digital");
    
private final String tipoEscritura;

TipoEscritura(String tipoEscritura){
this.tipoEscritura = tipoEscritura;
}

    public String getTipoEscritura() {
        return tipoEscritura;
    }

}
