
package ejercicio5_p5;


public class Propietario {
    private String nombre;
    private int dni;
    private Computadora computadora; // asociacion bidireccional
    
    public Propietario(String nombre, int dni){
    this.nombre = nombre;
    this.dni = dni;

    }
    

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

  

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}



//                Computadora - PlacaMadre - Propietario 
//                a. Composición: Computadora → PlacaMadre 
//                b. Asociación bidireccional: Computadora ↔ Propietario 
//                Clases y atributos: 
//
//                Computadora: marca, numeroSerie 
//                PlacaMadre: modelo, chipset 
//                Propietario: nombre, dni 