package tp3;

// Clase Estudiante
class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                           " | Curso: " + curso +
                           " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}

// Clase pública con el main
public class ejercicio1 {
    public static void main(String[] args) {
        // Instanciar un estudiante
        Estudiante est1 = new Estudiante("Juan", "Pérez", "Programación II", 7.5);

        // Mostrar la info.
        est1.mostrarInfo();

        // Aumentar calificación
        System.out.println("\nSubiendo calificación...");
        est1.subirCalificacion(1.0);
        est1.mostrarInfo();

        // Disminuir calificación
        System.out.println("\nBajando calificación...");
        est1.bajarCalificacion(2.5);
        est1.mostrarInfo();
    }
}
