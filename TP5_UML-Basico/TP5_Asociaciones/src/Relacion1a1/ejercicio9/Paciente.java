package Relacion1a1.ejercicio9;

public class Paciente {
    
        private String nombre;
    private String obraSocial;
    
//Constructor para paciente
    
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    //Getters para mostrar informacion del paciente

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }
    
    
}
