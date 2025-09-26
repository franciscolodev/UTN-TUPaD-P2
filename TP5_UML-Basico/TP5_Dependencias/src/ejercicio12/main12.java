package Ejercicio12;

public class main12 {

    public static void main(String[] args) {

        // Necesito crear instancias de las tres clases ya que Reproductor usa a cancion y Cancion tiene a artista como atributo
        Contribuyente persona1 = new Contribuyente("Francisco L", "29378765437");
        Impuesto imp1 = new Impuesto(130);
        Calculadora calc1 = new Calculadora();
        
        //Calcular
        calc1.calcular(imp1);
        
        //Mostrar informacion de los Impuestos
        imp1.mostrarInfoImpuestos();
        
        //Asociar un contribuyente a ciertos impuestos
        imp1.setContribuyente(persona1);
        
       //Mostrar informacion de los Impuestos
       imp1.mostrarInfoImpuestos();
        
        //Calcular
        calc1.calcular(imp1);
    }
    
}
