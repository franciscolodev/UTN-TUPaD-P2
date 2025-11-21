package empleadosYPolimorfismo;

public class main {

    public static void main(String[] args) {

        Empleado[] empleados = {
            new EmpleadoPlanta("Laura", 150000, 20000),
            new EmpleadoTemporal("Juan", 20, 4000),
            new EmpleadoPlanta("Marta", 180000, 30000),
            new EmpleadoTemporal("Pedro", 15, 3500)
        };

        System.out.println("=== Listado de Empleados ===");

        for (Empleado e : empleados) {
            System.out.println(e);

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es un empleado de planta fija.\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Es un empleado temporal.\n");
            }
        }
    }

}
