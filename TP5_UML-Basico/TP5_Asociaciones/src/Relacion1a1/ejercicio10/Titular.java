package Relacion1a1.ejercicio10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    
    //Constructor para titular

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
  
 //Asignar una cuenta bancaria al titular creado y viceversa

    public void setCuenta(CuentaBancaria cuenta) {
        if (cuenta != null) {
        this.cuenta = cuenta;
        if(cuenta.getTitular() != this){
            cuenta.setTitular(this);
        }
    }
    }
    
//Getters para mostrar informacion

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    
}
