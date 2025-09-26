package Relacion1a1.ejercicio9;

public class Profesional {
        private String nombre;
    private String especialidad;
    
//Constructor para profesional   

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
//Getters para mostrar informacion del profesional

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
}
