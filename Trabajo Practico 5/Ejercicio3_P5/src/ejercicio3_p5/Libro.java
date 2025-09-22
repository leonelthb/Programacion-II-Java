
package ejercicio3_p5;


public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial; // agregacion
    private Autor autor; // asociacion unidireccional
    
    public Libro(String titulo, String isbn, Editorial editorial, Autor autor){
    this.titulo = titulo;
    this.isbn = isbn;
    this.editorial = editorial;
    this.autor = autor;
   
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + '}';
    }


    
}



//            Libro - Autor - Editorial 
//            a. Asociación unidireccional: Libro → Autor 
//            b. Agregación: Libro → Editorial 
//            Libro: titulo, isbn 
//            Autor: nombre, nacionalidad 
//            Editorial: nombre, direccion 