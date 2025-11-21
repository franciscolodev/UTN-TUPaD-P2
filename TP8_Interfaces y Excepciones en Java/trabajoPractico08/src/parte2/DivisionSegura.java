package parte2;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        
         try (Scanner scanner = new Scanner(System.in)) {
             try {
                 System.out.print("Ingrese el 1er número: ");
                 int a = scanner.nextInt();
                 
                 System.out.print("Ingrese el 2do número: ");
                 int b = scanner.nextInt();
                 
                 int resultado = a / b;
                 System.out.println("Resultado: " + resultado);
                 
             } catch (ArithmeticException e) {
                 System.out.println("Error: no se puede dividir por cero.");
             } finally {
                 System.out.println("Operación finalizada.");
             }

        }
            
    }        
}