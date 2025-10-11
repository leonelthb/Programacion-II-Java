
package ejercicio2_p6;


public class Ejercicio2_P6 {

  
    public static void main(String[] args) {
      // creacion de la biblioteca
      Biblioteca biblio = new Biblioteca("Biblioteca Central");
      
      // Se crean Autores
      Autor a1 = new Autor("A01", "Gabriel Marqiez", "Colombiano");
      Autor a2 = new Autor("A02", "Jorge Borges", "Argentino");
      Autor a3 = new Autor("A03", "Isabel Allende", "Chilena");
      
      // se agregan libros
      biblio.agegarLibro("ISBN01", "Cien anios de soledad", 1967, a1);
      biblio.agegarLibro("ISBN02", "El amor en los tiempos de colera", 0, a1);
      biblio.agegarLibro("ISBN03", "FIcciones", 1944, a2);
      biblio.agegarLibro("ISBN04", "El Aleph", 1949, a2);
      biblio.agegarLibro("ISBN05", "La casa de los espiritus", 1982, a3);
      
      //Lista de libros
        System.out.println("Todos los libros");
        biblio.listarLibros();
        
      // BUscar por ISBN
        System.out.println("\n BUscar libro ISBN03:");
        biblio.buscarLibroPorIsbn("ISBN03");
        
        // Filtrar por anio
        System.out.println("\n LIbros de 1949:");
        biblio.filtrarLibroPorAnio(1949);
        
        // Eliminar libro
        biblio.eliminarLibro("ISBN02");
        System.out.println("Se elimino el libro ID: ISBN02");
        biblio.listarLibros();
        
        //suma total 
        System.out.println("Total de libros: " + biblio.obtenerCantidadLibros());
        
        // Autores
        System.out.println("Autores disponibles");
        biblio.mostrarAutoresDisponibles();
                
    }
    
}
