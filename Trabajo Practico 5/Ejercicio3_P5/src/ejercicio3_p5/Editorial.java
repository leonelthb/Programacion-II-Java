
package ejercicio3_p5;


public class Editorial {
    private String nombre;
    private String direccion;
    
    public Editorial(String nombre, String direccion){
    this.nombre = nombre;
    this.direccion = direccion;
         
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
      
}




//            Libro - Autor - Editorial 
//            a. Asociación unidireccional: Libro → Autor 
//            b. Agregación: Libro → Editorial 
//            Libro: titulo, isbn 
//            Autor: nombre, nacionalidad 
//            Editorial: nombre, direccion 