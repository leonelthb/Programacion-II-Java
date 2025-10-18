
package ejercicio4_p7;


public class Vaca extends Animal{
    public Vaca(String nombre){
        super(nombre); // llama al constructor de animal
       
    }
    
    
    @Override
    public void hacerSonido(){
        System.out.println("Muuuuu....");
    }
    
}
