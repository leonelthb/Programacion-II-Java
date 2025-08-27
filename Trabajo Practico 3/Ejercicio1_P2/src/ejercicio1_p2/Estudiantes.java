
package ejercicio1_p2;


public class Estudiantes {
    String nombre;
    String apellido;
    char curso;
    double calificacion;
    
    void mostrarInfo(){
    System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
      double obtenerCalifiacion() {
        return calificacion;
      }
      
      char obtenerCurso(){
          return curso;
      }
     
       void subirCalificacion(double puntos){
        if (puntos > 0) {
              calificacion = calificacion + puntos; // calificacion += nota   
        }
       }
       
         void bajarCalificacion(double puntos){
        if (puntos > 0) {
              calificacion = calificacion - puntos; // calificacion += nota   
        }
       }
}
