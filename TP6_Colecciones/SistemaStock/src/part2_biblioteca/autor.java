package part2_biblioteca;

public class autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters necesarios
    public String getNombre() { return nombre; }
    public String getId() { return id; }

    public void mostrarInfo() {
        System.out.println("  -> Autor ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
    
    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
