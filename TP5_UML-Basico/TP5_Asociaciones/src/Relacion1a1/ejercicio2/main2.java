package Relacion1a1.ejercicio2;

public class main2 {

    public static void main(String[] args) {
        // Asociacion Bidireccional Celular-usuario
        //Agregacion  Celular- bateria
    
    Bateria bat1 =new Bateria("VG89", "3000") ;
    Celular cel1 = new Celular("8493584126599", "Samsung", "s20", bat1); //Pasar valor de bateria al instanciar (Agregacion)
    Usuario user1= new Usuario("Francisco L", "39327419");
    
    cel1.mostrarInfoCelular();    
    
     //set usario en celular (Asociacion bidireccional)
    user1.setCelular(cel1);
    
    
    cel1.mostrarInfoCelular();
    
    
    
    //"a-zA-Z]+"  Significa uno o más caracteres que sean letras mayúsculas o minúsculas
    // "[a-zA-Z ]+" Permite espacios, por ejemplo entre nombres
    //"\\p{L}+"  Significa cualquier letra en cualquier idioma (incluye letras acentuadas, ñ, etc.)
    //"\\p{L }+" Permite los espacios
    }
}
