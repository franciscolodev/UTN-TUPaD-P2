package tp3;

public class MainMascota {
    public static void main(String[] args) {
        // Crear la mascota
        Mascota miMascota = new Mascota("Jack", "Perro", 3);

        // Mostrar informacion inicial
        miMascota.mostrarInfo();

        // Simular que cumple años
        miMascota.cumplirAnios();

        // Info después de cumplir años
        miMascota.mostrarInfo();
    }
}
