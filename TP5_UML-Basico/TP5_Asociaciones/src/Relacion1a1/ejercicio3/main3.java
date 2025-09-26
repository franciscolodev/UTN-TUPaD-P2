package Relacion1a1.ejercicio3;

public class main3 {

    public static void main(String[] args) {
        // Asociacion unidireccional: Libro Autor
        // Agregacion: Libro Editorial
        
        //Instanciar un objeto de cada clase
        
         //Instancio Editorial antes de libro ya que lo necesito para construir a libro
        Editorial ed1 = new Editorial("Editorial Pluma", "Metodo para la interpretación de la Historia Argentina");
        
        //Crear el libro con los datos del objeto editorial
        Libro lib1 = new Libro("HP", "jis1337", ed1);
        Autor aut1 = new Autor("Francisco L", "Argentina");
        
        //Mostrar datos de libro
        
        lib1.mostrarInfoLibro();
        
        //Seter el autor para libro
        lib1.setAutor(aut1); 
        
        //Mostrar informacion final de libro
        lib1.mostrarInfoLibro();
    }
    
}
