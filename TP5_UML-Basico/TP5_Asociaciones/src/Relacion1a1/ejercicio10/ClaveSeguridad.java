package Relacion1a1.ejercicio10;

import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaMod;
    
    
//Constructor para Clave de Seguridad

    public ClaveSeguridad(String codigo, LocalDate ultimaMod) {
        this.codigo = codigo;
        this.ultimaMod = ultimaMod;
    }

//Getters para informacion de cuenta bancaria

    public LocalDate getUltimaMod() {
        return ultimaMod;
    }
    
}
