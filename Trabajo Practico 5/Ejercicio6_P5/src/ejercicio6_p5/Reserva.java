
package ejercicio6_p5;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional
    private Mesa mesa;       // Agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva: " + fecha + " a las " + hora + "\n" +
               cliente.toString() + "\n" +
               mesa.toString();
    }
}

    





//            Reserva - Cliente - Mesa 
//            a. Asociación unidireccional: Reserva → Cliente 
//            b. Agregación: Reserva → Mesa 
//            Clases y atributos: 
//            Reserva: fecha, hora 
//            Cliente: nombre, telefono 
//            Mesa: numero, capacidad 