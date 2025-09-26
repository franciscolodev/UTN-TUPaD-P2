package Relacion1a1.ejercicio7;

public class Conductor {

        private String nombre;
        private String licencia;
        private Vehiculo auto;

//Constructor
        public Conductor(String nombre, String licencia) {
            this.nombre = nombre;
            this.licencia = licencia;
        }

//Getters para info y setter   
        public String getNombre() {
            return nombre;
        }

        public String getLicencia() {
            return licencia;
        }

        public Vehiculo getAuto() {
            return auto;
        }

//Setter para establecer vehiculo
        
        public void setVehiculo(Vehiculo auto){
          if (auto != null) {   
            this.auto =auto;   
            if (auto.getConductor() != this) {    
                auto.setConductor(this);
            }
}
          
        }
}


