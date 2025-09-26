package Ejercicio12;

public class Calculadora {
    
//Calcular Impuestos

public void calcular(Impuesto impuesto){
    if(impuesto.getContribuyente() == null){
        System.out.println("""
                       >>>>>>>Calculando Impuestos <<<<<<<<
                       El monto a pagar por: CONTRIBUYENTE NO REGISTRADO""" + " es de : " + impuesto.getMonto() + "\n");
    }else {
    System.out.println("""
                       >>>>>>>Calculando Impuestos <<<<<<<<
                       El monto a pagar por el Contribuyente:  """ + impuesto.getContribuyente().getNombre() + " es de : " + impuesto.getMonto() + "\n");
    }
}    
    
    
    
}
