package part3_universidad;

import java.util.ArrayList;
import java.util.List;

public class profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<curso> cursos; // Colección de cursos (el lado 'N')

    public profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters necesarios
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<curso> getCursos() { return cursos; }

    // Metodos internos para la sincronización
    public void agregarCursoInterno(curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
        }
    }

    public void eliminarCursoInterno(curso c) {
        this.cursos.remove(c);
    }

    // Metods de tarea
    public void listarCursos() {
        System.out.println(" Cursos dictados por " + nombre + " (" + cursos.size() + " total):");
        if (cursos.isEmpty()) {
            System.out.println("   (No dicta cursos actualmente)");
            return;
        }
        for (curso c : cursos) {
            System.out.println("   - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor ID: " + id + ", Nombre: " + nombre +
                ", Especialidad: " + especialidad + ", Cursos Asignados: " + cursos.size());
    }
}
