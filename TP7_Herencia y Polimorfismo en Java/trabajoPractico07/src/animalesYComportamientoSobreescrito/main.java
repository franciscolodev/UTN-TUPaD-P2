package animalesYComportamientoSobreescrito;


public class main {
    
    public static void main(String[] args) {
        
        Animal[] animales = {
            new Perro("Firulais"),
            new Gato("Michigan"),
            new Vaca("Lola")
        };
        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();            
        }
    }
    
}
