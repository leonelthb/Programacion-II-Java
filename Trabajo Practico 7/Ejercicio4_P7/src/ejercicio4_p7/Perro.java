
package ejercicio4_p7;


public class Perro extends Animal{
    
    public Perro(String nombre){
        super(nombre); // LLama al constructor animal
        
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau Guau");
    }
    
}
