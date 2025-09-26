package Relacion1a1.ejerecicio1;

import java.time.LocalDate;

public class main1 {

    public static void main(String[] args) {
        //Crea el pasaporte 1
        Pasaporte pas1 = new Pasaporte("DD1337K", LocalDate.of(2025, 9, 17), "imagen", "png");
        //Crea el titular 1
        Titular titular1 = new Titular("Francisco L", 39327419);
        
       pas1.mostrarInfoPasaporte();
        
        //Le asigna un objeto titular a pasaporte (el titular1)
        //Asigna a titular1 el objeto pas1 como pasaporte
        pas1.setTitular(titular1);
        
        pas1.mostrarInfoPasaporte();


    }

}
