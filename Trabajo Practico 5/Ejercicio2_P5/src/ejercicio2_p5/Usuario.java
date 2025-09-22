
package ejercicio2_p5;


public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular; // bidereccional
    
    public Usuario(String nombre, int dni){
    this.nombre = nombre;
    this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
