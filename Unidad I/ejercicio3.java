import java.util.Scanner;

public class ejercicio3 {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese su altura: ");
        double altura = Double.parseDouble(input.nextLine());

        System.out.print("¿Sos estudiante?: ");
        boolean estudiante = Boolean.parseBoolean(input.nextLine());

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("¿Sos estudiante?: " + estudiante);
    }
}