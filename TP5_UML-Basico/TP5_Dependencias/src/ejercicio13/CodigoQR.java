package Ejercicio13;

public class CodigoQR {
    private String valor;
    private Usuario usuario;

    //Constructor CodigoQR para que lo cree el generador
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
//Asignar usuario al codigo QR
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    //getter Valor
    public String getValor() {
        return valor;
    }

    
      
    //Mostrar Datos del CodigoQR
    
    public void mostrarInfoCodigo(){
        System.out.println("CodigoQR: " + getValor() 
        + "Nombre de Usuario: " +  usuario.getNombre() + "Email: " + usuario.getEmail());
        
    }
    
}
