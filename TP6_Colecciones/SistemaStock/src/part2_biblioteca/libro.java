package part2_biblioteca;

public class libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private autor autor;

    public libro(String isbn, String titulo, int anioPublicacion, autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters necesarios
    public String getIsbn() { return isbn; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public autor getAutor() { return autor; }

    public void mostrarInfo() {
        System.out.println("-------------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre() + " (ID: " + autor.getId() + ")");
        System.out.println("-------------------------------------");
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " (ISBN: " + isbn + ", Año: " + anioPublicacion + "), Autor: " + autor;
    }
}
