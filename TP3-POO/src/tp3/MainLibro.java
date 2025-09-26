package tp3;

public class MainLibro {
    public static void main(String[] args) {
        // Crear un libro
        Libro miLibro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        // Mostrar info inicial
        miLibro.mostrarInfo();

        System.out.println("\nIntentando cambiar el año a un valor inválido (-100)...");
        miLibro.setAnioPublicacion(-100); // Valor inválido

        System.out.println("\nIntentando cambiar el año a un valor válido (1950)...");
        miLibro.setAnioPublicacion(1950); // Valor válido

        System.out.println("\nInformación final del libro:");
        miLibro.mostrarInfo();
    }
}
