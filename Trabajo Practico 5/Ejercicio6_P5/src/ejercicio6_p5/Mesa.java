
package ejercicio6_p5;


// Clase Mesa
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa Nº " + numero + " (capacidad: " + capacidad + ")";
    }
}





//            Reserva - Cliente - Mesa 
//            a. Asociación unidireccional: Reserva → Cliente 
//            b. Agregación: Reserva → Mesa 
//            Clases y atributos: 
//            Reserva: fecha, hora 
//            Cliente: nombre, telefono 
//            Mesa: numero, capacidad 