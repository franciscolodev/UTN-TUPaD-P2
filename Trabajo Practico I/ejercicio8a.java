package ejercicio8a;
import java.util.Scanner;

public class Ejercicio8a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt(); 

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int resultado = num1 / num2;
        System.out.println("Resultado (int): " + resultado);

        input.close(); 
    }
}

