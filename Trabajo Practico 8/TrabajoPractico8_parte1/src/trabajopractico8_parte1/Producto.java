
package trabajopractico8_parte1;

// implementa la interfaz de Pagable porque puede devolver su precio total
public class Producto implements Pagable{
    private String nombre;
    private double precio;
    
    // constructor

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    // imprementacion del metodo de la interfaz, retorna el precio del producto
    @Override
    public double calcularTotal() {
        return precio;
    }

        // para obtener el nombre del producto
    
    public String getNombre() {
        return nombre;
    }
    
    
}
