package Relacion1a1.ejercicio8;

import java.time.LocalDate;

public class main8 {


    public static void main(String[] args) {
        // a. Composición: Documento → FirmaDigital
        //b. Agregación: FirmaDigital → Usuario
        
        Usuario user1 = new Usuario ("Francisco L", "franL@gmail.com"); //Creo usuario primero porque esta agregado dentro de FirmaDigital
        
        Documento doc1 = new Documento("Documento_Francisco", "Plan de Estudio 2025", "codigoHash", LocalDate.of(2025, 9, 17), user1);
        
        //Mostrar informacioin de las instancias
        System.out.println(doc1.getFirma().getCodigoHash());
        System.out.println(doc1.getFirma().getFecha());
        System.out.println(doc1.getContenido());
        System.out.println(doc1.getTitulo());
        System.out.println(user1.getNombre());
        System.out.println(user1.getEmail());
         
        
    }
    
}
