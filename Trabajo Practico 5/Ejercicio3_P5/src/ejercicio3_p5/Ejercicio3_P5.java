
package ejercicio3_p5;


public class Ejercicio3_P5 {

  
    public static void main(String[] args) {
      Autor autor = new Autor("Oscar Benedetti", "Argentino");
      Editorial editorial = new Editorial("Editorial Bs As.", "Buenos Aires");
      Libro libro = new Libro("Harry Potter", "123-654-987", editorial, autor);
    
        System.out.println("Libro " + libro.getTitulo());
        System.out.println("Autor " + libro.getAutor().getNombre());
        System.out.println("Editorial " + libro.getEditorial().getNombre());
    }
    
}   




//            Libro - Autor - Editorial 
//            a. Asociación unidireccional: Libro → Autor 
//            b. Agregación: Libro → Editorial 
//            Libro: titulo, isbn 
//            Autor: nombre, nacionalidad 
//            Editorial: nombre, direccion 