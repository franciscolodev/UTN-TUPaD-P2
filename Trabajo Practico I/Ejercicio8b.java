package ejercicio8b;
import java.util.Scanner;

public class Ejercicio8b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        double resultado = num1 / num2; 
        System.out.println("Resultado (double): " + resultado);

        input.close();
    }
}