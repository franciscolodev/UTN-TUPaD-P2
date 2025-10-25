package part2_biblioteca;

import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        
        System.out.println("\n=================================================");
        System.out.println("=== INICIO CASO 2: BIBLIOTECA Y LIBROS (1:N) ===");
        System.out.println("=================================================");
        
        biblioteca bibliotecaCentral = new biblioteca("Biblioteca General Universitaria");
        
        autor autorA = new autor("A100", "Gabriel Garcia Marquez", "Colombiana");
        autor autorB = new autor("A101", "Isabel Allende", "Chilena");
        autor autorC = new autor("A102", "Jorge Luis Borges", "Argentina");
        
        System.out.println("\n--- TAREAS 2 y 3: AGREGAR LIBROS Y AUTORES ---");
        bibliotecaCentral.agregarLibro("ISBN001", "Cien años de soledad", 1967, autorA);
        bibliotecaCentral.agregarLibro("ISBN002", "La casa de los espíritus", 1982, autorB);
        bibliotecaCentral.agregarLibro("ISBN003", "El Aleph", 1949, autorC);
        bibliotecaCentral.agregarLibro("ISBN004", "El amor en los tiempos del cólera", 1985, autorA);
        bibliotecaCentral.agregarLibro("ISBN005", "Paula", 1994, autorB);
        
        bibliotecaCentral.listarLibros();
        
        System.out.println("\n--- TAREA 5: BUSCAR LIBRO ISBN003 ---");
        libro libroBuscado = bibliotecaCentral.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        
        System.out.println("\n--- TAREA 6: FILTRAR LIBROS POR AÑO (1985) ---");
        List<libro> libros85 = bibliotecaCentral.filtrarLibrosPorAnio(1985);
        if (!libros85.isEmpty()) {
            for (libro l : libros85) {
                System.out.println(" [Filtro 1985] " + l);
            }
        } else {
            System.out.println("No se encontraron libros publicados en 1985.");
        }
        
        System.out.println("\n--- TAREA 7: ELIMINAR LIBRO ISBN001 ---");
        bibliotecaCentral.eliminarLibro("ISBN001");
        bibliotecaCentral.listarLibros();
        
        System.out.println("\n--- TAREA 8: CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("Cantidad total de libros en la biblioteca: " + bibliotecaCentral.obtenerCantidadLibros());
        
        bibliotecaCentral.mostrarAutoresDisponibles();
        
        System.out.println("\n=================================================");
        System.out.println("=== FIN CASO 2 ===");
        System.out.println("=================================================");
    }
}
