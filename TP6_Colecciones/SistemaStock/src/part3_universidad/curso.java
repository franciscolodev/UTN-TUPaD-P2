package part3_universidad;

public class curso {
    private String codigo;
    private String nombre;
    private profesor profesor; // Referencia al profesor (el lado '1')

    public curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public profesor getProfesor() { return profesor; }

    // Método para bidireccionalidad
    public void setProfesor(profesor nuevoProfesor) {
        // 1. Manejar la relación previa (quita de la lista del profesor anterior)
        profesor profesorPrevio = this.profesor;
        if (profesorPrevio != null && profesorPrevio != nuevoProfesor) {
            profesorPrevio.eliminarCursoInterno(this); // Llama a un método interno del profesor
        }

        // 2. Asignar el nuevo profesor al curso
        this.profesor = nuevoProfesor;

        // 3. Sincronizar el lado del nuevo profesor 
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCursoInterno(this); // Llama a un método interno del profesor
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + codigo + " - " + nombre + " (Profesor: " + nombreProfesor + ")");
    }
}
