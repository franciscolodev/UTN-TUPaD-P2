package Ejercicio12;

public class Contribuyente {
    private String nombre;
    private String cuil;

    //Generar instancia contribuyente
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

//Para mostrar informacion de impuestos
    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }
    
    
    
    
    
}
