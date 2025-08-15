package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}