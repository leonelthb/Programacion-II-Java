
package ejercicio3_p6;


public class Ejercicio3_P6 {

    
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Naciona");
        
        
        // Crear profesores
        Profesor p1 = new Profesor("P01", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P02", "Carlos Díaz", "Programación");
        Profesor p3 = new Profesor("P03", "Laura Gómez", "Historia");

        // Crear cursos
        Curso c1 = new Curso("C01", "Álgebra");
        Curso c2 = new Curso("C02", "Java Básico");
        Curso c3 = new Curso("C03", "Historia Moderna");
        Curso c4 = new Curso("C04", "Cálculo I");
        Curso c5 = new Curso("C05", "Estructuras de Datos");

        // Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores
        uni.asignarProfesorACurso("C01", "P01");
        uni.asignarProfesorACurso("C04", "P01");
        uni.asignarProfesorACurso("C02", "P02");
        uni.asignarProfesorACurso("C05", "P02");
        uni.asignarProfesorACurso("C03", "P03");

        // Listar
        uni.listarProfesores();
        uni.listarCursos();

        // Cambiar profesor de un curso
        System.out.println("\nCambiando profesor del curso C02:");
        uni.asignarProfesorACurso("C02", "P01");

        // Verificar sincronización
        uni.listarProfesores();

        // Eliminar curso
        System.out.println("\nEliminando curso C04:");
        uni.eliminarCurso("C04");
        uni.listarProfesores();

        // Eliminar profesor
        System.out.println("\nEliminando profesor P03:");
        uni.eliminarProfesor("P03");
        uni.listarCursos();

        // Reporte final
        uni.reporteCursosPorProfesor();
    }
    
}














//            +-----------------------------------+
//            |            Universidad            |
//            +-----------------------------------+
//            | - nombre : String                 |
//            | - profesores : List<Profesor>     |
//            | - cursos : List<Curso>            |
//            +-----------------------------------+
//            | + agregarProfesor(p: Profesor)    |
//            | + agregarCurso(c: Curso)          |
//            | + buscarProfesorPorId(id: String) |
//            | + buscarCursoPorCodigo(cod:String)|
//            | + asignarProfesorACurso(cod, id)  |
//            | + listarProfesores()              |
//            | + listarCursos()                  |
//            | + eliminarCurso(codigo: String)   |
//            | + eliminarProfesor(id: String)    |
//            | + reporteCursosPorProfesor()      |
//            +-----------------------------------+
//                             |
//                             | administra
//                             |
//                             +--------------------+
//                                                  |
//                                                  v
//            +-----------------------------------+
//            |            Profesor               |
//            +-----------------------------------+
//            | - id : String                     |
//            | - nombre : String                 |
//            | - especialidad : String           |
//            | - cursos : List<Curso>            |
//            +-----------------------------------+
//            | + agregarCurso(c: Curso)          |
//            | + eliminarCurso(c: Curso)         |
//            | + listarCursos()                  |
//            | + mostrarInfo()                   |
//            | + getId(): String                 |
//            | + getNombre(): String             |
//            | + getCursos(): List<Curso>        |
//            +-----------------------------------+
//                             ^   1
//                             |   
//                             |  (1 profesor)
//                             |
//                         (N cursos)
//                             |
//                             v
//            +-----------------------------------+
//            |               Curso               |
//            +-----------------------------------+
//            | - codigo : String                 |
//            | - nombre : String                 |
//            | - profesor : Profesor             |
//            +-----------------------------------+
//            | + setProfesor(p: Profesor)        |
//            | + mostrarInfo()                   |
//            | + getCodigo(): String             |
//            | + getNombre(): String             |
//            | + getProfesor(): Profesor         |
//            +-----------------------------------+







