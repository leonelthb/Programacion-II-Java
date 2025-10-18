
package ejercicio4_p7;

import java.util.ArrayList;


public class Ejercicio4_P7 {

  
    public static void main(String[] args) {
       // Lista polimorfica de los animales
       
       ArrayList<Animal> animales = new ArrayList<>();
       
       // agregamos todos los animales
       animales.add(new Perro("Firulais"));
       animales.add(new Gato("Raul"));
       animales.add(new Vaca("Lola"));
       
       
       
       // ciclo for para recorrer la lista
        for (Animal a : animales) {
            a.describirAnimal(); // metodo comun
            a.hacerSonido(); //metodo general
            System.out.println("************");
            
        }
       
    }
    
}
