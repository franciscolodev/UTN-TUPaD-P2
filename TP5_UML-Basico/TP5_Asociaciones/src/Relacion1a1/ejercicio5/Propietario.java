package Relacion1a1.ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

 //Generar constructor con los atributos necesarios   
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
     //Getters para luego imprimir informacion

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
//Obtener dato PC
    public Computadora getComputadora() {
        return computadora;
    }
    
 //Setear una Computadora para un cliente
    
        public void setComputadora(Computadora computadora) {
        if (computadora != null) {
            this.computadora = computadora;
            if (computadora.getPropietario() != this) { 
                computadora.setPropietario(this);
            }
        }

    }   
    
    
}
