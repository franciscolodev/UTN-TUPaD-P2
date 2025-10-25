package part2_biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class biblioteca {
    private String nombre;
    private List<libro> libros;

    public biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) {
            libro nuevoLibro = new libro(isbn, titulo, anioPublicacion, autor);
            libros.add(nuevoLibro);
            System.out.println("✅ Libro agregado: " + titulo);
        } else {
            System.out.println("⚠️ Error: Ya existe un libro con ISBN: " + isbn);
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("📚 La biblioteca está vacía.");
            return;
        }
        System.out.println("\n--- LISTADO DE LIBROS EN " + nombre + " (" + libros.size() + " total) ---");
        for (libro l : libros) {
            System.out.println(l);
        }
        System.out.println("-----------------------------------------------------");
    }

    public libro buscarLibroPorIsbn(String isbn) {
        for (libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
                libro l = libros.remove(i);
                System.out.println("🗑️ Libro eliminado: " + l.toString());
                return true;
            }
        }
        System.out.println("❌ Error al eliminar: Libro con ISBN " + isbn + " no encontrado.");
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<libro> filtrarLibrosPorAnio(int anio) {
        List<libro> filtrados = new ArrayList<>();
        for (libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                filtrados.add(l);
            }
        }
        return filtrados;
    }
    
    public void mostrarAutoresDisponibles() {
        Set<autor> autoresUnicos = new HashSet<>(); 
        
        for (libro l : libros) {
            autoresUnicos.add(l.getAutor());
        }
        
        System.out.println("\n--- AUTORES DISPONIBLES EN " + nombre + " (" + autoresUnicos.size() + " únicos) ---");
        for (autor a : autoresUnicos) {
            a.mostrarInfo();
        }
        System.out.println("-----------------------------------------------------");
    }
}
