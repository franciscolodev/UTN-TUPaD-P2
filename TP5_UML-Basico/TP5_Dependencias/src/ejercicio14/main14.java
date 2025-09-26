package Ejercicio14;

public class main14 {

    public static void main(String[] args) {
        // Asociacion unidireccional: Render > Proyecto
        //Dependencia de creacion: EditorVideo > (Render-Proyecto)
        
                
        Proyecto proyecto1= new Proyecto("Video Graduacion", 29);
        EditorVideo editor1 = new EditorVideo();
        

        //Renderiza un proyecto a un formato determinado
        //Imprimir datos del codigoQR
        editor1.exportar("mp4", proyecto1);
        
        
    }
    
}
