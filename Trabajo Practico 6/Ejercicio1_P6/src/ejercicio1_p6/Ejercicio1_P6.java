
package ejercicio1_p6;


public class Ejercicio1_P6 {

  
    public static void main(String[] args) {
        Inventario inventario = new Inventario(); // se crea el inventario

        // 1. Crear productos con diferentes categorías
        Producto p1 = new Producto("P01", "Leche", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P02", "Celular", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P03", "Remera", 1500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P04", "Silla", 2000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P05", "Pan", 800, 100, CategoriaProducto.ALIMENTOS);

        // Agregarlos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("\nBuscar P03:");
        System.out.println(inventario.buscarProductoPorId("P03"));

        // 4. Filtrar por categoría
        System.out.println("\nProductos de ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar un producto
        inventario.eliminarProducto("P02");
        System.out.println("\nInventario tras eliminar P02:");
        inventario.listarProductos();

        // 6. Actualizar stock
        inventario.actualizarStock("P01", 70);

        // 7. Mostrar el total de stock
        System.out.println("\nTotal stock disponible: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\nProducto con mayor stock: " + inventario.obtenerProductoConMayorStock());

        // 9. Filtrar productos por precio
        System.out.println("\nProductos entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
