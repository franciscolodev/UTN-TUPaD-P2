package Ejercicio13;

public class main13 {


    public static void main(String[] args) {
        //El generadorQR crea el CodigoQR y lo asocia  a un usuario
        //El CodigoQR esta asociado a un usuario
        
        Usuario user1= new Usuario("Francisco L", "franL@gmail.com");
        GeneradorQR gen1 = new GeneradorQR();
        

        //Crear Codigo y asociar al usuario
        //Imprimir datos del codigoQR
        gen1.generarCodigo("OK-1337", user1);
        

    }
    
}
