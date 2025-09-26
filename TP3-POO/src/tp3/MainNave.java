package tp3;

public class MainNave {
    public static void main(String[] args) {
        // Crear nave con 50 unidades de combustible
        Nave nave = new Nave("Explorer", 50);

        // Mostrar estado inicial
        nave.mostrarEstado();

        // Intentar avanzar sin recargar
        nave.avanzar(60); // Consumo mayor al disponible
        nave.despegar();  // Debería poder despegar porque tiene 50 de combustible

        // Recarga combustible
        nave.recargarCombustible(40);

        // Avanza correctamente
        nave.avanzar(60);

        // Muestrs estado final
        System.out.println("\nEstado final de la nave:");
        nave.mostrarEstado();
    }
}
