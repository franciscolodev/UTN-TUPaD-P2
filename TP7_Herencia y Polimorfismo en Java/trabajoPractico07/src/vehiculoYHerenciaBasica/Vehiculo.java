package vehiculoYHerenciaBasica;


public class Vehiculo {
    
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String mostrarInfo(){
        return "Marca: " + marca + " ,Modelo: " + modelo;
    }    
    
}
