package Relacion1a1.ejercicio8;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
        
//Getters para informacion

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    
}
