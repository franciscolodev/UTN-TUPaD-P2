
package Relacion1a1.ejercicio2;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    //Constructor Usuario
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Getters Usuario para imprimir
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    //Para usarlo en el setter de setUsuario (Celular)
    public Celular getCelular() {
        return celular;
    }
   
    
    //Setear un celular para el usuario

    public void setCelular(Celular celular) {
        if(celular != null) {
        this.celular = celular;
        if(celular.getUsuario() != this){
            celular.setUsuario(this);
        }
        }
    }
    
    
   
    
}


