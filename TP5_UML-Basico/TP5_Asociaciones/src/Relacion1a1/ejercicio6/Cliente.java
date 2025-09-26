package Relacion1a1.ejercicio6;

public class Cliente {
    private String nombre;
    private String telefono;
    
    //Generar constructor con los atributos necesarios   

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
//Getters para mostar informacion

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
        

}
