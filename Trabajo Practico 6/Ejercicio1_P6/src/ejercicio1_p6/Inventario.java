
package ejercicio1_p6;

import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    // Metodo para agregar un producto a la lista
    public void agregarProducto(Producto p){
    productos.add(p);
    }
    
    // listas de todos los productos llamando el motodo mostrarInfo()
    public void listarProductos(){
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    // Busca un producto por su ID y lo devuelve (Si no lo encuentra devuelve NULL
   public Producto buscarProductoPorId(String id){
       for (Producto p : productos) {
           if (p.getId().equals(id)) {
               return p;
           }
       }
       
        return null;

   }
   // Elimina un producto de la lista segun ID
   public void eliminarProducto(String id){
       productos.removeIf(p -> p.getId().equals(id));
   }
   
   //Metodo para actualizar la cantidad de estick de un producto
   public void actualizarStock(String id, int nuevaCantidad){
       Producto p = buscarProductoPorId(id); // Lo busca por id
       if (p != null){
       p.setCantidad(nuevaCantidad);
       }
   }
   
   //MEtodo para filtrar y muesta los productos que pertenecen a una categoria
   public void filtrarPorCategoria(CategoriaProducto categoria){
       for (Producto p : productos) {
           if(p.getCategoria()== categoria){
                p.mostrarInfo();
           }
       }
   }
   // metodo para calcular el total de stock sumado la can tida de todos los productos
   public int obtenerTotalStock(){
       int total = 0;
       for (Producto p : productos) {
           total += p.getCantidad();
       }
       return total;
   }
   
   //Devuelve el producto que tiene mayor cantidad en stock
   public Producto obtenerProductoConMayorStock(){
       if(productos.isEmpty()) return null;
       Producto mayor = productos.get(0); // empieuza con el primero
        for (Producto p : productos) {
           if(p.getCantidad() > mayor.getCantidad()){
               mayor = p;
           }
       }
        return mayor;
   }
   
   //muestra los productos cuyo precio este dentro de un rango
   public void filtrarProductosPorPrecio(double min, double max) {
   for(Producto p : productos){
       if(p.getPrecio() >= min && p.getPrecio() <= max){
             p.mostrarInfo();
            }
        }
   }
   
   //Muestra todas las categorias disponibles (reccorre el enum)
   public void mostrarCategoriasDisponibles(){
       for (CategoriaProducto c : CategoriaProducto.values()) {
           System.out.println(c + " >> " + c.getDescripcion() );
       }
   }
}

