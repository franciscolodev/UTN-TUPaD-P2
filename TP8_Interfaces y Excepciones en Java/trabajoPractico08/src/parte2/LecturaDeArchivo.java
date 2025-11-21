package parte2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivo {

    public static void main(String[] args) {
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader("archivo.txt"));
            String linea;

            while ((linea = buffRead.readLine()) != null) {
                System.out.println(linea);
            }

            buffRead.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: el archivo no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

}