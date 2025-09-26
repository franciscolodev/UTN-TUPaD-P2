package Relacion1a1.ejercicio7;

public class main7 {

    public static void main(String[] args) {
        // a. Agregación: Vehículo → Motor
        //b. Asociación bidireccional: Vehículo ↔ Conductor
 
        //Instanciar un objeto de cada clase
       
        Vehiculo auto1 = new Vehiculo ("ABC123", "Qwid", "Nafta", "ABC1337");
        Conductor cond1 = new Conductor("Francisco L", "ABCD133759");
        
        //Mostrar datos de auto
        auto1.mostrarInfoAuto();
        
        //Setear Conductor en un vehiculo
        auto1.setConductor(cond1); 
        
        //Mostrar datos de Reserva
        auto1.mostrarInfoAuto();
        
        
        
    }
    
}
