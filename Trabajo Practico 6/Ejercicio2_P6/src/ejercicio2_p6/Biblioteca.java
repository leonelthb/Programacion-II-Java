
package ejercicio2_p6;

import java.util.ArrayList;


public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();
    
public Biblioteca(String nombre){
    this.nombre = nombre;
    }

// metodo agregar libro
public void agegarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
    libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
}

//Listar todos los libros
public void listarLibros(){
    for (Libro l : libros) {
        l.mostrarInfo();
        }
    }

//Busca libro por ISBN
public Libro buscarLibroPorIsbn(String isbn){
    for (Libro l : libros) {
        if (l.getIsbn().equals(isbn)) {
            return l;
        }
    }
    return null;
}

//eliminar libro por ISBN
public void eliminarLibro(String isbn){
    libros.removeIf(l -> l.getIsbn().equals(isbn));
}
        
// Obtener cantidad de libros
public int obtenerCantidadLibros(){
    return libros.size();
}

// Filtrar libros por anio de publicacion
public void filtrarLibroPorAnio(int anio){
    for (Libro l : libros) {
        if(l.getAnioPublicacion() == anio){
        l.mostrarInfo();
        }
    }
}

// Mostrar autos disponles sin repetir 
public void mostrarAutoresDisponibles(){
    System.out.println("Autores en la Biblioteca");
    for (Libro l : libros) {
        System.out.println("- " + l.getAutor());
        
    }
}
}
        




//        String nombre 
//        • List<Libro> libros → Colección de libros de la biblioteca. 
//
//
//        • agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) 
//        • listarLibros() 
//        • buscarLibroPorIsbn(String isbn) 
//        • eliminarLibro(String isbn) 
//        • obtenerCantidadLibros() 
//        • filtrarLibrosPorAnio(int anio) 
//        • mostrarAutoresDisponibles() 