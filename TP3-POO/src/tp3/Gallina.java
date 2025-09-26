package tp3;

public class Gallina {
    // Atributos privados
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // Inicialmente no ha puesto huevos
    }

    // Método para simular que pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total huevos: " + huevosPuestos);
    }

    // Método para simular que envejece un año
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }

    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("---");
    }
}
