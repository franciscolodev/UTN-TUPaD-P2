package principal;

import modelo.Empleado;

public class Main {
    public static void main(String[] args) {
        // Instanciar empleados utilizando ambos constructores
        Empleado e1 = new Empleado(101, "Ana Perez", "Gerente", 120000);
        Empleado e2 = new Empleado("Luis Gomez", "Programador");
        Empleado e3 = new Empleado("María Lopez", "Administrativa");

        // Imprimir empleados iniciales
        System.out.println("Empleados iniciales");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Aumentos de salario
        e1.actualizarSalario(5000);   // aumento fijo de $5000
        e2.actualizarSalario(15);     // aumento 15%
        e3.actualizarSalario(10);     // aumento 10%

        // Imprimir después de actualizar salarios
        System.out.println("Después de Aumentos");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}