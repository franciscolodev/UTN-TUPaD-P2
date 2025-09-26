//Trabajo Práctico 2 - Programación II - Francisco López
public class ejercicio13 {

    // Función recursiva para imprimir un array
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice >= array.length) {
            return; // Termina de recorrer el array
        }
        System.out.println("Precio: $" + array[indice]);
        imprimirArrayRecursivo(array, indice + 1); // Llamada recursiva al siguiente índice
    }

    public static void main(String[] args) {

        // a. Declarar e inicializar array de precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // b. Precios originales usando recursión
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);

        // c. Modificar el precio de un producto específico (índice 2)
        precios[2] = 129.99;

        // d. Precios modificados usando recursión
        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
}
