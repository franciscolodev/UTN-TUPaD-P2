package Relacion1a1.ejercicio6;

public class Mesa {
    private int numero;
    private int capacidad;
    
//Generar constructor con los atributos necesarios   

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
//Getters para mostar informacion

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    
}
