package Relacion1a1.ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    //Constructor que incluya editorial (agregacion) pero no autor (asociacion directa)
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    //Setter para definir autor
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    //Getters para mostar informacion

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    
      public void mostrarInfoLibro() {
        System.out.println("Libro > "
                + "Titulo:  " + (getTitulo()) + " ISBN: " + (getIsbn())
                + "\nEditorial: " + (editorial.getNombre()) + ", Direccion: " + (editorial.getDireccion()) + "\n");
        if(this.autor != null){
            System.out.println("Autor(a): " + (autor.getAutor()) + " ,Nacionalidad: " + (autor.getNacionalidad()));
        }else {
            System.out.println("Aun no se ha asignado un autor al Libro: " + this.getTitulo() + "\n");
        }
    
        }

    }
    
