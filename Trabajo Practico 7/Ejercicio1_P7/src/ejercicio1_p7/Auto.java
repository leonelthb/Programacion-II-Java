
package ejercicio1_p7;

// Subcalse heredada de Vehiculo
public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    //Constructor
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo); // llama al constructor de vehiculo con los mismo parametros
        this.cantidadDePuertas = cantidadDePuertas;
    }
    
   //sobrescribimos mostrarInfo con OVerride
    
    @Override
    public void mostrarInfo(){
        //LLama el metodo original de la super clase
        super.mostrarInfo(); //
        System.out.println("Cantidad de puertas: " + cantidadDePuertas);
    }
    
}
