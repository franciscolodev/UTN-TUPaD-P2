package parte2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsoDeTryWithResources {
    
    public static void main(String[] args) {
        String ruta = "src/parte2/datos.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            System.out.println("=== Contenido del archivo ===");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al acceder o leer el archivo: " + e.getMessage());
        }

        System.out.println("Lectura finalizada correctamente.");
    }  
}