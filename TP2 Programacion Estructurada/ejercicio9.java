//Trabajo Práctico 2 - Programación II - Francisco López
import java.util.Scanner;

public class ejercicio9 {

    // Función para calcular el costo de envío por peso y zona
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10;
        } else {
            System.out.println("Zona inválida. Se usará Nacional por defecto.");
            costoPorKg = 5;
        }

        return peso * costoPorKg;
    }

    // Función para calcular el total de la compra, sumando precio del producto y costo de envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();

        sc.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}
