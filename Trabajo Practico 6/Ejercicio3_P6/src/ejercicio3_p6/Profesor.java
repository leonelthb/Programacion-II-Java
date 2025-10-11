
package ejercicio3_p6;

import java.util.ArrayList;


public class Profesor {
 private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Agregar curso y sincronizar ambos lados
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincroniza desde el otro lado
            }
        }
    }

    // Eliminar curso y sincronizar
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // rompe la relación del otro lado
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id +
                " | Especialidad: " + especialidad +
                " | Cantidad de cursos: " + cursos.size());
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public ArrayList<Curso> getCursos() { return cursos; }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}

