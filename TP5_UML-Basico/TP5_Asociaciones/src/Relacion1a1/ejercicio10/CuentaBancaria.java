package Relacion1a1.ejercicio10;

import java.time.LocalDate;

public class CuentaBancaria {

    private String cbu;
    private int saldo;
    private Titular titular;
    private ClaveSeguridad clave;

//Construcor para Cuenta Bancaria
    public CuentaBancaria(String cbu, int saldo, String codigo, LocalDate ultimaMod) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaMod);
    }

//Getters para mostar informacion de cuenta y setear el titular
    public String getCbu() {
        return cbu;
    }

    public int getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

//Asignar un titular a la uenta bancaria creada y viceversa
    public void setTitular(Titular titular) {
        if (titular != null) {
            this.titular = titular;
            if (titular.getCuenta() != this) {
                titular.setCuenta(this);
            }
        }

    }

//Mostrar informacion de la cuenta
    public void mostrarInfoCuenta() {
        System.out.println("         >>>>>>>>> Cuenta Bancaria <<<<<<<<< \n"
                + "CBU:  " + (getCbu()) + "; Saldo: " + getSaldo() + "\n"
                + "Clave Seguridad > Ultima Modificacion: " + clave.getUltimaMod());
        if (titular != null) {
            System.out.println("Titular de la Cuenta >  "
                    + " Nombre:  " + titular.getNombre() + ";  Dni:  " + titular.getDni() + "\n");
        } else {
            System.out.println("Aun no se ha asociado un titular a la cuenta bancaria seleccionada\n");
        }
    }

}
