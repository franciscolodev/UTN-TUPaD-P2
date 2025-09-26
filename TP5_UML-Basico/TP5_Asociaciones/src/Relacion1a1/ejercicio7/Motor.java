package Relacion1a1.ejercicio7;

public class Motor {

    private String tipo;
    private String numSerie;

//Constructor
    public Motor(String tipo, String numSerie) {
        this.tipo = tipo;
        this.numSerie = numSerie;
    }
    
    
//Getters para info y setter   

    public String getTipo() {
        return tipo;
    }

    public String getNumSerie() {
        return numSerie;
    }
}
