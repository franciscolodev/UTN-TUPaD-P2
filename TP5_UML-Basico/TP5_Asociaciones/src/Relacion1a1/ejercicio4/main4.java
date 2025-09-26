package Relacion1a1.ejercicio4;

import java.time.LocalDate;

public class main4 {

    public static void main(String[] args) {
       
        //Asociacion bidireccional:Tarjeta - Cliente
        //Agregacion: Tarjeta - Banco
        
        Banco banco1 = new Banco("BBA", "273787659");
        //Agregacion > el dato de banco se agrega a tarjeta desde el constructor
        TarjetaDeCredito tarj1 = new TarjetaDeCredito("1335648956132", LocalDate.of(2035, 10, 19), banco1); 
        Cliente cliente1 = new Cliente("Francisco L", "39327419");
        
        //Mostrar la informacion de la tarjeta
        tarj1.mostrarInfoTarjeta();
        
        //Setear una tarjeta para un cliente
        cliente1.setTarjeta(tarj1);
        
        //El otro setter para asociar cliente con tarjeta
        //tarj1.setCliente(cliente1);
        
        
        //Mostrar la informacion de la tarjeta
         tarj1.mostrarInfoTarjeta();
        
    }
    
}
