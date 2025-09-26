package Relacion1a1.ejercicio7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;
    
//Constructor

    public Vehiculo(String patente, String modelo, String tipo, String numSerie) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = new Motor(tipo, numSerie); //Composicion
    }

//Getters para info y setter   

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    
    
    
//Setter para establecer conductor
    
          public void setConductor(Conductor conductor){
          if (conductor != null) {
            this.conductor =conductor;
            if (conductor.getAuto() != this) { 
                conductor.setVehiculo(this);
            }
        }

    }

          
//Mostrar informacion de vehiculo    

          public void mostrarInfoAuto(){
        System.out.println("Vehiculo > "
                + "Patente:  " + (getPatente()) + " Modelo: " + (getModelo())
                + "\nMotor > Tipo: " + (motor.getTipo()) + ", Numero de Serie " + (motor.getNumSerie()) + "\n");
        if(this.conductor != null){
            System.out.println("Nombre del Conductor: " + (conductor.getNombre()) + " ,Licencia: " + (conductor.getLicencia()));
        }else {
            System.out.println("El vehiculo aun no tiene un conductor asignado \n");
        }    
    
      }
}
          
          

