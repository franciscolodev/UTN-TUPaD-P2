package tp3;

public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // Setter con validación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validacion para año de publicación
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0) { // Validamos que sea positivo
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: año de publicación inválido.");
        }
    }

    // Método para mostrar informacion del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}
