package part3_universidad;

import java.util.ArrayList;
import java.util.List;

public class universidad {
    private String nombre;
    private List<profesor> profesores;
    private List<curso> cursos;

    public universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
            System.out.println("✅ Profesor agregado: " + p.getNombre());
        } else {
             System.out.println("⚠️ Error: Ya existe profesor con ID: " + p.getId());
        }
    }

    public void agregarCurso(curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
            System.out.println("✅ Curso agregado: " + c.getNombre());
        } else {
             System.out.println("⚠️ Error: Ya existe curso con código: " + c.getCodigo());
        }
    }

    // Método clave: Delega la sincronización al método setProfesor del Curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        curso curso = buscarCursoPorCodigo(codigoCurso);
        profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // Llama al método que sincroniza ambos lados
            System.out.println("🔄 Asignación: " + profesor.getNombre() + " asignado a " + curso.getNombre());
        } else {
            System.out.println("❌ Error de asignación: Curso o Profesor no encontrado.");
        }
    }

    public void listarProfesores() {
        System.out.println("\n--- PROFESORES DE " + nombre + " (" + profesores.size() + " total) ---");
        for (profesor p : profesores) {
            p.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        System.out.println("\n--- CURSOS DE " + nombre + " (" + cursos.size() + " total) ---");
        for (curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public profesor buscarProfesorPorId(String id) {
        for (profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public curso buscarCursoPorCodigo(String codigo) {
        for (curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    // Eliminación que rompe la relación bidireccional
    public boolean eliminarCurso(String codigo) {
        curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            // Rompe la relación con el profesor si existe
            if (cursoAEliminar.getProfesor() != null) {
                cursoAEliminar.setProfesor(null); // Esto quita el curso de la lista del profesor
            }
            cursos.remove(cursoAEliminar);
            System.out.println("🗑️ Curso eliminado: " + cursoAEliminar.getNombre());
            return true;
        }
        System.out.println("❌ Error: Curso con código " + codigo + " no encontrado.");
        return false;
    }

    // Tarea de eliminación de profesor, dejando sus cursos 'null'
    public boolean eliminarProfesor(String id) {
        profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            
            // Se usa una copia porque al llamar a setProfesor(null) la lista 'cursos' del profesor se modifica
            List<curso> cursosDictados = new ArrayList<>(profesorAEliminar.getCursos()); 
            for (curso c : cursosDictados) {
                c.setProfesor(null); // Esto quita el profesor de sus cursos y sincroniza la lista del profesor
            }
            
            // 2. Remover al profesor de la universidad
            profesores.remove(profesorAEliminar);
            System.out.println("🗑️ Profesor eliminado: " + profesorAEliminar.getNombre());
            return true;
        }
        System.out.println("❌ Error: Profesor con ID " + id + " no encontrado.");
        return false;
    }
}