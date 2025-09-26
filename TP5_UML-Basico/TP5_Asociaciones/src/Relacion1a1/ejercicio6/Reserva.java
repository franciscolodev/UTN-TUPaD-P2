package Relacion1a1.ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Mesa mesa;
    private Cliente cliente;
    
//Generar constructor con los atributos necesarios   

    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) { //Agregacion
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
//Getters para mostar informacion

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
    
//Asociacion directa > Asociar cliente con la reserva
    public void setCliente(Cliente cliente) { 
        this.cliente = cliente;
    }
    
    
// Mostrar informacion

      public void mostrarInfoReserva() {
        System.out.println("Reserva > "
                + "Fecha:  " + (getFecha()) + " Hora: " + (getHora())
                + "\nMesa numero: " + (mesa.getNumero()) + ", Capacidad: " + (mesa.getCapacidad()) + "\n");
        if(this.cliente != null){
            System.out.println("Nombre del Cliente: " + (cliente.getNombre()) + " ,Telefono: " + (cliente.getTelefono()));
        }else {
            System.out.println("La reserva aun no contiene datos del cliente: \n");
        }    
    
      }
}
