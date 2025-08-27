
package ejercicio1_p2;


public class Ejercicio1_P2 {

   
    public static void main(String[] args) {
        Estudiantes es = new Estudiantes();
        es.mostrarInfo();
        es.apellido = "Aballay";
        es.nombre = "Leonel";
        es.curso = 'A';
        es.calificacion = 9.25;
        es.mostrarInfo();
        
        System.out.println(es.calificacion);
        es.subirCalificacion(1);
        System.out.println(es.calificacion);
        es.bajarCalificacion(5);
        System.out.println(es.calificacion);
        
        es.mostrarInfo();
        
    }
    
    
}





//    Registro de Estudiantes 
//    a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, 
//    calificación. 
//    Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), 
//    bajarCalificacion(puntos). 
//    Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir 
//    calificaciones. 