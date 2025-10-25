package part3_universidad;

public class MainUniversidad {
    public static void main(String[] args) {

        System.out.println("\n==================================================================");
        System.out.println("=== INICIO CASO 3: UNIVERSIDAD Y RELACIÓN BIDIRECCIONAL (1:N) ===");
        System.out.println("==================================================================");

        universidad miUniversidad = new universidad("UTN - Programación II");

        // Crear al menos 3 profesores y 5 cursos.
        profesor profA = new profesor("P100", "Dr. Juan Pérez", "Algoritmos");
        profesor profB = new profesor("P101", "Lic. María Gómez", "Bases de Datos");
        profesor profC = new profesor("P102", "Ing. Luis Acosta", "Redes");

        curso curso1 = new curso("C201", "Programación Orientada a Objetos");
        curso curso2 = new curso("C202", "Estructuras de Datos");
        curso curso3 = new curso("C203", "Análisis y Diseño de Sistemas");
        curso curso4 = new curso("C204", "Teoría de la Computación");
        curso curso5 = new curso("C205", "Bases de Datos Avanzadas");

        // Agregar profesores y cursos a la universidad.
        System.out.println("\n--- TAREA 2: AGREGAR ENTIDADES ---");
        miUniversidad.agregarProfesor(profA);
        miUniversidad.agregarProfesor(profB);
        miUniversidad.agregarProfesor(profC);
        miUniversidad.agregarCurso(curso1);
        miUniversidad.agregarCurso(curso2);
        miUniversidad.agregarCurso(curso3);
        miUniversidad.agregarCurso(curso4);
        miUniversidad.agregarCurso(curso5);

        // Asignar profesores a cursos.
        System.out.println("\n--- TAREA 3: ASIGNAR PROFESORES (SINCRONIZACIÓN) ---");
        miUniversidad.asignarProfesorACurso("C201", "P100"); // Prof. Pérez dicta C201
        miUniversidad.asignarProfesorACurso("C202", "P100"); // Prof. Pérez dicta C202
        miUniversidad.asignarProfesorACurso("C203", "P101"); // Lic. Gómez dicta C203
        miUniversidad.asignarProfesorACurso("C204", "P102"); // Ing. Acosta dicta C204

        // Listar cursos con su profesor y profesores con sus cursos.
        miUniversidad.listarCursos();
        System.out.println("\n--- TAREA 4: LISTADO DE CURSOS POR PROFESOR ---");
        profA.listarCursos(); // Debería tener C201 y C202
        profB.listarCursos(); // Debería tener C203
        profC.listarCursos(); // Debería tener C204

        //Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("\n--- TAREA 5: CAMBIAR PROFESOR DE C201 (P100 -> P101) ---");
        miUniversidad.asignarProfesorACurso("C201", "P101"); // Cambia de Pérez a Gómez

        System.out.println("\n[VERIFICACIÓN] Prof. P100 (Pérez):");
        profA.listarCursos(); // Debe haber perdido C201 (solo le queda C202)
        System.out.println("\n[VERIFICACIÓN] Prof. P101 (Gómez):");
        profB.listarCursos(); // Debe haber ganado C201 (tiene C203 y C201)

        // Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n--- TAREA 6: REMOVER CURSO C202 (Dictado por P100) ---");
        miUniversidad.eliminarCurso("C202");
        System.out.println("\n[VERIFICACIÓN] Prof. P100 (Pérez) después de eliminar C202:");
        profA.listarCursos(); // No debe tener C202

        // Remover un profesor (P101) y dejar su curso (C203) como null.
        System.out.println("\n--- TAREA 7: REMOVER PROFESOR P101 (Gómez) ---");
        String cursoAfectado = miUniversidad.buscarCursoPorCodigo("C203").getNombre();
        miUniversidad.eliminarProfesor("P101"); // Elimina a Gómez (P101)

        System.out.println("\n[VERIFICACIÓN] Curso '" + cursoAfectado + "' después de eliminar P101:");
        miUniversidad.buscarCursoPorCodigo("C203").mostrarInfo(); // Profesor debe ser 'Sin asignar'

        // Mostrar un reporte: cantidad de cursos por profesor (restantes).
        System.out.println("\n--- TAREA 8: REPORTE DE CURSOS POR PROFESOR (Restantes) ---");
        miUniversidad.listarProfesores(); // Muestra los restantes: P100 y P102
        System.out.println("Detalle:");
        profA.mostrarInfo(); // Pérez: 1 curso (C202 fue eliminado, C201 reasignado, le queda 1)
        profC.mostrarInfo(); // Acosta: 1 curso (C204)

        System.out.println("\n=================================================");
        System.out.println("=== FIN CASO 3 ===");
        System.out.println("=================================================");
    }
}
