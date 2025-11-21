package parte2;

import java.util.Scanner;

public class ExcepcionPersonalizada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
    }  
}