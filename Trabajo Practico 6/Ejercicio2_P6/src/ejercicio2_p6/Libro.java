
package ejercicio2_p6;


public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // asociacion libro con autor
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    //muestra info completa del libro
    public void mostrarInfo(){
        System.out.println("ISBN: " + isbn + "Titulo: " + titulo + " Año de Publicacion " 
                + anioPublicacion + "Autor: " + autor);
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    
    
}
