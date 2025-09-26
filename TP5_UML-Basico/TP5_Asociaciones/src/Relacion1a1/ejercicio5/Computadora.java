package Relacion1a1.ejercicio5;


public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;
    
    
//Generar constructor con los atributos necesarios   

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }
    
    
 //Getters para luego imprimir informacion

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
//Obtener dato propietario
    public Propietario getPropietario() {
        return propietario;
    }
    
//Setear una Propietario para una PC
    
        public void setPropietario(Propietario propietario) {
        if (propietario != null) {
            this.propietario =propietario;
            if (propietario.getComputadora() != this) { 
                propietario.setComputadora(this);
            }
        }

    }
    
        //Mostrar informacion de la PC
        
    public void mostrarInfoComputadora() {
        System.out.println("Computadora > "
                + "Marca:  " + (this.getMarca()) + " ,Numero de Serie: " + (this.getNumeroSerie())
                + "\nPlaca Madre Modelo: " + (this.placaMadre.getModelo()) + ", Chipset: " + (this.placaMadre.getChipset()) + "\n");
        if (this.propietario != null) {
            System.out.println("Nombre del Propietario: " + (this.propietario.getNombre()) + " ,DNI: " + (this.propietario.getDni()));
        } else {
            System.out.println("La computadora aun no tiene un propietario asignado\n");
        }

    }

}

    
