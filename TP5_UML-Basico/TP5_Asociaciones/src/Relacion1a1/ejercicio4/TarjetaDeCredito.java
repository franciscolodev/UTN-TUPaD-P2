package Relacion1a1.ejercicio4;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    //Requiere el valor de banco
    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
   //Getters para luego imprimir informacion
    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    //Para usarlo en el setter de setCliente(Cliente)

    public Cliente getCliente() {
        return cliente;
    }


    //Set Cliente en Tarjeta de Credito
    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
            if (cliente.getTarjeta() != this) { //Si el cliente de la tarketa no existe lo crea con setTarjeta
                cliente.setTarjeta(this);
            }
        }

    }
    
          public void mostrarInfoTarjeta() {
        System.out.println("Tarjeta de Credito > "
                + "Numero:  " + (this.getNumero()) + " Fecha de Vencimiento: " + (this.getFechaVencimiento())
                + "\nBanco: " + (this.banco.getNombre()) + ", CUIT: " + (this.banco.getCuit()) + "\n");
        if(this.cliente != null){
            System.out.println("Nombre del Cliente: " + (this.cliente.getNombre()) + " ,DNI: " + (this.cliente.getDni()));
        }else {
            System.out.println("Aun no se ha asignado un Cliente a la tarjeta\n");
        }
    
        }
    
}
