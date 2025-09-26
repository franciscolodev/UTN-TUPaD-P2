package Ejercicio13;

public class GeneradorQR {
    
//Genera un CodigoQR y lo asocia a un usuario?

    
public void generarCodigo(String valor, Usuario usuario){
    CodigoQR codigo = new CodigoQR(valor);
    //Asignar usuario a codigoQR
    codigo.setUsuario(usuario);
    //Imprimir codigo
    System.out.println("CodigoQR: " + valor + ", Usuario: " + usuario.getNombre() + ", Email: " + usuario.getEmail() );
}    
    
    
    
}
