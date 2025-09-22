
package ejercicio1_p5;


public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociacion Bidireccional
    
    public Titular(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
    
    
}
