package Ejercicio11;

public class Artista {
    private String nombre;
    private String genero;

 //Constructor de Artista
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    //Getters para mostrar en Informacion de la cancion
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
    
    
    
}
