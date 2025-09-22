
package ejercicio3_p5;


public class Autor {
    private String nombre;
    private String nacionalidad;
   
    
    public Autor(String nombre, String nacionalidad){
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }



    
    
    
}



//            Libro - Autor - Editorial 
//            a. Asociación unidireccional: Libro → Autor 
//            b. Agregación: Libro → Editorial 
//            Libro: titulo, isbn 
//            Autor: nombre, nacionalidad 
//            Editorial: nombre, direccion 