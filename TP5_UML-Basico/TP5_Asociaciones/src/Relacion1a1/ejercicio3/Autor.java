package Relacion1a1.ejercicio3;

public class Autor {
    private String autor;
    private String nacionalidad;

    public Autor(String autor, String nacionalidad) {
        this.autor = autor;
        this.nacionalidad = nacionalidad;
    }
    
    //Getters para mostrar informacion

    public String getAutor() {
        return autor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
}
