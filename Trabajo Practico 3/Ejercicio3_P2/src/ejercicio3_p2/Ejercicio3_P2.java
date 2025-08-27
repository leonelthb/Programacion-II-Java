
package ejercicio3_p2;


public class Ejercicio3_P2 {

   
    public static void main(String[] args) {
      Libro nuevoLibro = new Libro("Godzilla", "Toho Studios", 1950);
      
      nuevoLibro.setAnioPublicacion(-50);
      nuevoLibro.setAnioPublicacion(3080);
      
      nuevoLibro.setAnioPublicacion(1960);
      
      nuevoLibro.mostrarInfo();
      
    } // Coerre main
    
} // cierre clase




//            Encapsulamiento con la Clase Libro 
//            a. Crear una clase Libro con atributos privados: titulo, autor, 
//            añoPublicacion. 
//            Métodos requeridos: Getters para todos los atributos. Setter con validación 
//            para añoPublicacion. 
//            Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
//            uno válido, mostrar la información final