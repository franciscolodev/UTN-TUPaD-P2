package Ejercicio11;

public class main11 {

    public static void main(String[] args) {
        // Necesito crear instancias de las tres clases ya que Reproductor usa a cancion y Cancion tiene a artista como atributo
        Cancion song1 = new Cancion("Jijiji");
        Artista art1 = new Artista("Los Redondos", "Rock");
        Reproductor rep1 = new Reproductor();
        
        //Reproducir
        rep1.reproducir(song1);
        
        //Mostrar informacion cancion
        song1.mostrarInfoCancion();
        
        //Asociar artista a una cancion
        song1.setArtista(art1);
        
       //Mostrar informacion cancion
        song1.mostrarInfoCancion();
        
        
        
    }
    
}
