package Relacion1a1.ejercicio5;

public class main5 {

    public static void main(String[] args) {
      
        //Asociacion bidireccional:Computadora - Propietario
        //Composicion: Computadora - PlacaMadre
        
        Computadora pc1 = new Computadora("Lenovo", "Y39967", "HHTG LA-H610 ", "Intel HM5");
        Propietario prop1 = new Propietario("Francisco L", "39327419");
        
        //Mostrar la informacion de la computadora de acuerdo al propietario
       pc1.mostrarInfoComputadora();
        
        //Setear una computadora para un propietario
        prop1.setComputadora(pc1);
       

         //Mostrar la informacion de la computadora de acuerdo al propietario
         pc1.mostrarInfoComputadora();
        

    }
    
}
