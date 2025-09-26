package tp3;

public class MainGallina {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 3);

        // Simular acciones
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();

        // Estado final de las gallinas
        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
