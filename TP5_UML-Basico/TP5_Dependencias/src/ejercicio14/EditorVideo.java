package Ejercicio14;

public class EditorVideo {
    
//Crear Proyecto con el formato del renderizado
    
    public void exportar(String formato, Proyecto proyecto){
    Render render = new Render(formato);
    //Asignar un proyecto a renderizar
    render.setProyecto(proyecto);
    //Imprimir codigo
    System.out.println("Proyecto: " + proyecto.getNombre() + ", Duracion (min): " + proyecto.getDuracionMin() + ", Formato: " + formato);
    
    
    }
    
    
    
    
    
    
    
    
}
