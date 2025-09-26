package Relacion1a1.ejercicio10;

import java.time.LocalDate;

public class main10 {

    public static void main(String[] args) {
        // Composicion: CuentaBancaria > ClaveSeguridad
        //Asociacion Bidireccional: CuentaBancaria > Titular

        //Instanciar CuentaBancaria y Titular
        CuentaBancaria cuenta1 = new CuentaBancaria("9035387530234", 0, "9834ujrfa", LocalDate.of(2025, 9, 17));
        Titular titular1 = new Titular("Francisco L", "39327419");

        //Mostrar datos de la cuenta bancaria
        cuenta1.mostrarInfoCuenta();

        //Asociar titular y cuenta bancaria
        cuenta1.setTitular(titular1);

        //Mostrar datos de la cuenta bancaria luego de asociar cuenta-titular con setter
        cuenta1.mostrarInfoCuenta();

    }
}
