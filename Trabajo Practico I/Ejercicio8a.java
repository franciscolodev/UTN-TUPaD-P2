package ejercicio8a;
import java.util.Scanner;

public class Ejercicio8a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // cambiamos 'sc' por 'input'

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt(); // usamos 'input' aquí

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int resultado = num1 / num2;
        System.out.println("Resultado (int): " + resultado);

        input.close(); // cerramos 'input'
    }
}