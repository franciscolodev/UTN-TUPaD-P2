package Relacion1a1.ejerecicio1;

import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular;
    
    
public Pasaporte (String numero, LocalDate fechaEmision, String imagen, String formato) {
    this.numero = numero;  //El numr del objeto this(pas1) sera igual al argumento numero introducido
    this.fechaEmision = fechaEmision;
    this.foto = new Foto (imagen, formato);
}    

 public Titular getTitular(){
       return titular;
    }

    public String getNumeroPasaporte() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }
 
    public void setTitular(Titular titular) {
        if (titular != null) {
            this.titular = titular;
            //getPasaporte > devuelve los datos del objeto pasaporte del titular actual > si el pasaporte guardado es distinto que el pass actual (this= pass actual)
            //si es el mismo objeto pasaporte entonces titular ya tiene seteado un pasaporte y no se ejecuta el setPasaporte() del if
            if (titular.getPasaporte() != this) { 
                titular.setPasaporte(this); //setear el titular con el pasaporte actual > 
            }

        }
    }
    
    public void mostrarInfoPasaporte() {
        System.out.println("Pasaporte > "
                + "numero:  " + (this.getNumeroPasaporte()) + " Fecha de Emision: " + (this.getFechaEmision())
                + "\nFoto > "
                + "Imagen: " + (this.foto.getImagen()) + " Formato: " + (this.foto.getFormato()));
        if (this.titular != null) {
            System.out.println("Titular > "
                + " Nombre:  " + (this.titular.getNombreTitular()) + "  Dni:  " + (this.titular.getDni()));
        } else {
            System.out.println("El pasaporte aun no tiene un titular asignado\n");
        }
        
    }
    

    
    
}
