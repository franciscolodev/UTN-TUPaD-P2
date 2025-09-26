package Relacion1a1.ejercicio8;

import java.time.LocalDate;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    
//Documento contiene una firma digital, se creal al crearse el documento    
    public Documento(String titulo, String contenido, String codigoHash, LocalDate fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    
//Getters para informacion

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    
    
    
}
