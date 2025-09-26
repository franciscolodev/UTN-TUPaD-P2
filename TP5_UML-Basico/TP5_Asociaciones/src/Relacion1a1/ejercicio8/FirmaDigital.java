package Relacion1a1.ejercicio8;

import java.time.LocalDate;

public class FirmaDigital {
    
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario;

    //FirmaDigital contiene datos de usario
    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
//Getters para informacion

    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    
    
    
}
