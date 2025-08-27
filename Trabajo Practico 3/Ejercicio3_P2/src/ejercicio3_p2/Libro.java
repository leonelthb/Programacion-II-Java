
package ejercicio3_p2;


public final class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    
    
    public Libro(String titulo, String autor, int anioPublicacion){
    this.titulo = titulo;
    this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0  && anioPublicacion <= 2025){
            this.anioPublicacion = anioPublicacion;
        } else{ 
            System.out.println("Anio de publicacion incorrecto: " + anioPublicacion);
        }
        this.anioPublicacion = anioPublicacion;
    }
    
    
    void mostrarInfo(){
    System.out.println("Titulo: " + titulo + " Autor: " + autor + " Anio de publicacion: " + anioPublicacion);
    }
    
    
    
    
    
}


//            Encapsulamiento con la Clase Libro 
//            a. Crear una clase Libro con atributos privados: titulo, autor, 
//            añoPublicacion. 
//            Métodos requeridos: Getters para todos los atributos. Setter con validación 
//            para añoPublicacion. 
//            Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
//            uno válido, mostrar la información final