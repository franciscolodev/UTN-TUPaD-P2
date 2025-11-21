package empleadosYPolimorfismo;


public class EmpleadoPlanta extends Empleado {
    
    private double salarioBase;
    private double adicionalAntiguedad;

    public EmpleadoPlanta(String nombre, double salarioBase, double adicionalAntiguedad) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.adicionalAntiguedad = adicionalAntiguedad;
    }
    
    @Override
    public double calcularSueldo(){
        return salarioBase + adicionalAntiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Planta | Sueldo: $" + calcularSueldo();
    }
    
    
    
    
}
