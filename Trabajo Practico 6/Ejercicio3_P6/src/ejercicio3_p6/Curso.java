
package ejercicio3_p6;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // relacion 1a1 con profesor
    
    public Curso(String codigo, String nomnbre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    // asignar o cambiar profesor sincronizado por ambos lados
    public void setProfesor(Profesor p){
        if(this.profesor == p)
            return; //para evitar bucles proteccion logica
        
        // si ya tenia profesor, se elimina de su lista
        if(this.profesor != null){
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }
        this.profesor = p; //asignar nuevo profesor
        
        // si no es null agrega lo agrega a su lista
        if(p != null && !p.getCursos().contains(this)){
            p.agregarCurso(this);
        }          

    }
    
    public void mostrarInfo(){
        System.out.println("Curso: " + nombre + "(" + codigo + ")" +
                "Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
          
    }
    
    //getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }
    
    
    
}
