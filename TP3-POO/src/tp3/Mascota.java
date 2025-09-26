package tp3;

public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para simular que cumple años
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años.");
    }
}
