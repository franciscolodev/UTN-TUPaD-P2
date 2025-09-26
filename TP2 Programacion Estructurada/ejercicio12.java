//Trabajo Práctico 2 - Programación II - Francisco López
public class ejercicio12 {
    public static void main(String[] args) {

        // a. Declarar e inicializar array precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Valores originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // c. Modificar precio de un producto específico
        precios[2] = 129.99;

        // d. Valores modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
