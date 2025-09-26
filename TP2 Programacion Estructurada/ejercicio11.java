//Trabajo Práctico 2 - Programación II - Francisco López
import java.util.Scanner;

public class ejercicio11 {

    // Variable global constante para el descuento especial
    static double DESCUENTO_ESPECIAL = 0.10;

    // Función para calcular el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        calcularDescuentoEspecial(precio);

        sc.close();
    }
}
