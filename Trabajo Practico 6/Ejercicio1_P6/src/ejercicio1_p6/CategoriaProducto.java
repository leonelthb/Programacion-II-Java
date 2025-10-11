
package ejercicio1_p6;
  
  public enum CategoriaProducto {
    ALIMENTOS("Producto Comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");
      
    private final String descripcion;
    
    // Constructor del enum
    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
              
              
}


