package tp3;

public class Nave {
    // Atributos privados
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // Límite máximo de combustible

    // Constructor
    public Nave(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= MAX_COMBUSTIBLE && combustibleInicial >= 0) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = 0; // If = valor inválido, inicializa en 0
        }
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) { // Suponiendo que despegar consume 10 unidades
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante:" + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    // Método para avanzar X distancia
    public void avanzar(int distancia) {
        int consumo = distancia; // 1 unidad de combustible por unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de recarga inválida.");
            return;
        }
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
        } else {
            combustible += cantidad;
        }
        System.out.println(nombre + " ha recargado combustible. Combustible actual: " + combustible);
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
        System.out.println("---");
    }
}
