
package ejercicio2_p7;


public class Circulo extends Figura{
    private final double radio;

    public Circulo(String nombre, double radio) {
        super(nombre); // llamada al constructor de figura
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}
