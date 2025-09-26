package Relacion1a1.ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Getters para luego imprimir informacion

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
//Getter para setear tarjeta en cliente
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
   //Setear una Tarjeta en un Cliente
    
        public void setTarjeta(TarjetaDeCredito tarjeta) {
        if (tarjeta != null) {
            this.tarjeta = tarjeta;
            if (tarjeta.getCliente() != this) { //crear en cliente
                tarjeta.setCliente(this);
            }
        }

    }
    
    
    
    
    
}
