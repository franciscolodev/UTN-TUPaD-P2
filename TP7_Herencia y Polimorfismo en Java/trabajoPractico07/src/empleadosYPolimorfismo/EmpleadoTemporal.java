package empleadosYPolimorfismo;


public class EmpleadoTemporal extends Empleado {
    
    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(String nombre, int diasTrabajados, double pagoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSueldo(){
        return diasTrabajados * pagoPorDia;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Temporal | Sueldo: $" + calcularSueldo();
    }
    
    
    
    
}
