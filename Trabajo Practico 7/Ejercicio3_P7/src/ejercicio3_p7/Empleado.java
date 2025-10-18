
package ejercicio3_p7;


public abstract class Empleado {
    protected String nombre; //Atributo general para todos
    
    // Constructor

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    
    // metodo abstracto, para cada empleado 
    public abstract double calcularSueldo();
    
    // metodo comun
    public void mostrarInfo(){
        System.out.println("Empleado: " + nombre);
    }
    
}
