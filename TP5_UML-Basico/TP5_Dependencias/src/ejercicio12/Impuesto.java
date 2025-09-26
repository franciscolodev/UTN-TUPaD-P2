package Ejercicio12;

public class Impuesto {
    private int monto;
    private Contribuyente contribuyente;

    //Construir impuesto 
    public Impuesto(int monto) {
        this.monto = monto;
    }
   
//Obtener los datos del contribuyente

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    
  //Para pasarle el valor al calculador
    public int getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
    
    
    
    // Mostrar datos de Impuestos
    
        public void mostrarInfoImpuestos(){
         System.out.println(" Monto Impuestos: " + getMonto());
         if(contribuyente!= null){
             System.out.println("Nombre del Contribuyente: " + contribuyente.getNombre()+ " CUIL: " + contribuyente.getCuil() + "\n");
         }else{
             System.out.println("Aun no se ha establecido la relacion Impuesto-Contribuyente \n");
         }  
        }
    
    
    
    
}
