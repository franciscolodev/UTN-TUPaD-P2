package Relacion1a1.ejercicio2;

public class Celular {

    private String imei; //Lo defino como String porque no voy a hacer operaciones
    private String marca;
    private String modelo;
    private Bateria bateria; //Agregacion
    private Usuario usuario; //Bidireccional

    //Construir celular CON BATERIA dentro del constructor 
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.setImei(imei);
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    //Los imei tienen entre 15 y 17 digitos
    private void setImei(String imei) {
        if (imei.matches("\\d+")) { //uno o más dígitos (0-9)
            this.imei = imei;
        }
    }

    //Getters para luego imprimir informacion
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //Para usarlo en el setter de setUsuario(Usuario)
    public Usuario getUsuario() {
        return usuario;
    }

    //Set Usuario en el celular
    public void setUsuario(Usuario usuario) {
        if (usuario != null) {
            this.usuario = usuario;
            if (usuario.getCelular() != this) {
                usuario.setCelular(this);
            }
        }

    }

    public void mostrarInfoCelular() {
        System.out.println("Celular > "
                + "imei:  " + (this.getImei()) + " Marca: " + (this.getMarca()) + ", Modelo: " + (this.getModelo())
                + "\nBateria > "
                + "Modelo: " + (this.bateria.getModelo()) + ", Capacidad: " + (this.bateria.getCapacidad())
        );
        if (this.usuario != null) {
            System.out.println("Usuario > "
                    + " Nombre:  " + (this.usuario.getNombre()) + ",  Dni:  " + (this.usuario.getDni()));
        } else {
            System.out.println("El usuario aun no tiene un celular asignado\n");
        }

    }
}