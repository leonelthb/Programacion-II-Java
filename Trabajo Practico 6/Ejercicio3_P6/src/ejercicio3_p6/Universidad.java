
package ejercicio3_p6;

import java.util.ArrayList;


public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    // Asigna profesor a curso, sincronizando ambos lados
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profe = buscarProfesorPorId(idProfesor);

        if (curso != null && profe != null) {
            curso.setProfesor(profe);
        }
    }

    public void listarProfesores() {
        System.out.println("Profesores en la universidad:");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("Cursos en la universidad:");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Eliminar curso (rompe relación con profesor)
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.setProfesor(null); // romper vínculo
            }
            cursos.remove(c);
        }
    }

    // Eliminar profesor (rompe relación con cursos)
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null); // dejar cursos sin profesor
            }
            profesores.remove(p);
        }
    }

    // Reporte: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("Reporte: Cursos por profesor");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
    
}
