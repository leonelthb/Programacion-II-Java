
package ejercicio6_p5;


// Clase Cliente
public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Tel: " + telefono;
    }
}





//            Reserva - Cliente - Mesa 
//            a. Asociación unidireccional: Reserva → Cliente 
//            b. Agregación: Reserva → Mesa 
//            Clases y atributos: 
//            Reserva: fecha, hora 
//            Cliente: nombre, telefono 
//            Mesa: numero, capacidad 