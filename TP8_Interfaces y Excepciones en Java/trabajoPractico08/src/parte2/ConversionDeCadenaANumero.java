package parte2;

import java.util.Scanner;

public class ConversionDeCadenaANumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número válido.");
        }
        scanner.close();
    }
}

