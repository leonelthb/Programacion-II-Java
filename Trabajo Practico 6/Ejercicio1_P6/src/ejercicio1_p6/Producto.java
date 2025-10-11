
package ejercicio1_p6;


public class Producto {
    // Atributos privados encapsulados
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria; // Llama el enum
    
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria){
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
    this.categoria = categoria;
    
    }
    
    // Metodo mostrar informacion en consola
    public void mostrarInfo(){
        System.out.println("ID: " + id + " Nombre: " + nombre 
        + " Precio: $" + precio + " Stock: " + cantidad + "Categoria: " + categoria
        + "(" + categoria.getDescripcion() + ")");
    }
    // getters y setters para acceder o modificar atributos

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    // version corta del producto

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + '}';
    }
   
    }

