
package ejercicio4_p7;


public class Animal {
    protected String nombre;
    
    //Constructor

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    
    // metodo que sera sobrescrito por las otras subclases
    public void hacerSonido(){
        System.out.println("Animal hace su sonido: ");
        
    }
    
    // Metodo para todos los animales
    public void describirAnimal(){
        System.out.println("Animal: " + nombre);
        
        
    }
    
    
    
    }

