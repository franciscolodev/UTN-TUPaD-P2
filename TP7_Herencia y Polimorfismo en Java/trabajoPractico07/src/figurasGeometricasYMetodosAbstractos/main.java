package figurasGeometricasYMetodosAbstractos;

public class main {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[]{
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(2.5),
            new Rectangulo(10, 3)
        };

        for (Figura f : figuras) {
            System.out.println(f.toString());
        }

    }

}
