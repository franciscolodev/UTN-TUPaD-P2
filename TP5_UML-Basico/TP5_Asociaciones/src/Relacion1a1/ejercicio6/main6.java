package Relacion1a1.ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;
        
public class main6 {

    public static void main(String[] args) {
//Asociación unidireccional: Reserva → Cliente
// Agregación: Reserva → Mesa

        //Instanciar un objeto de cada clase
        
         //Instancio Mesal antes de Reserva ya que lo necesito para construir la reserva
        Mesa mesa1 = new Mesa (1, 4);
        
        //Crear la reserva con los datos del objeto mesa
        Reserva res1 = new Reserva(LocalDate.of(2025, 9, 17), LocalTime.of(17, 3, 0), mesa1);
        Cliente cliente1 = new Cliente("Francisco L", "3932741999");
        
        //Mostrar datos de Reserva
        res1.mostrarInfoReserva();
        
        //Seter cliente para una reserva
        res1.setCliente(cliente1); 
        
        //Mostrar datos de Reserva
        res1.mostrarInfoReserva();
        
        
    }
    
}
