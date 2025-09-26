package Ejercicio11;

public class Cancion {
    private String titulo;
    private Artista artista;

    //Constructor que requiere titulo
    public Cancion(String titulo) {
        this.titulo = titulo;
    }

//Para que lo use el reproductor
    public String getTitulo() {
        return titulo;
    }
    
    //Setear el valor de artista en cancion
    public void setArtista(Artista artista){
        if(artista != null){
            this.artista = artista;
        }
    }

    //Mostrar informacion de la cancion
    
    public void mostrarInfoCancion(){
         System.out.println(" Titulo: " + getTitulo() + "\n");
         if(artista != null){
             System.out.println("Artista: " + artista.getNombre() + " Genero: " + artista.getGenero());
         }else{
             System.out.println("No hay artista asociaciodo a la cancion: " + getTitulo() );
         }  
}
    
    
    
}
