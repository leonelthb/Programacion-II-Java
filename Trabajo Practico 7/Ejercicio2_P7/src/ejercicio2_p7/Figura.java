
package ejercicio2_p7;

public abstract class Figura {
    protected String nombre; // Atributo general apra todas las figuras
    
    // constructor 

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // metodo abstracto
    public abstract double calcularArea();
    
    // metodo comun para todas las figuras
    public void mostrarNombre(){
        System.out.println("Figura: " + nombre);
    }
}
