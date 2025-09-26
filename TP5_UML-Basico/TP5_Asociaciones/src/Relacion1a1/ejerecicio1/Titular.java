package Relacion1a1.ejerecicio1;

public class Titular {

    private String nombre;
    private int dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombreTitular() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
   
    public void setPasaporte(Pasaporte pasaporte) {
        //Solo le asigno el valor del parametro si no es null
        if (pasaporte != null) {
            this.pasaporte = pasaporte;
            //Si el objeto titular para el valor de pasaporte no es igual que el actual (no esta creado)  
            if (pasaporte.getTitular() != this) {
                //Le da a pasaporte un valor de titular
                pasaporte.setTitular(this);
            }

        }
    }


    

    }


