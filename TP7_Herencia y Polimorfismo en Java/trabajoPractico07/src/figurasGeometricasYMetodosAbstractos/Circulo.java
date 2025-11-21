package figurasGeometricasYMetodosAbstractos;


public class Circulo extends Figura {
    
    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Radio = " + radio;
    }
    
    
    
}
