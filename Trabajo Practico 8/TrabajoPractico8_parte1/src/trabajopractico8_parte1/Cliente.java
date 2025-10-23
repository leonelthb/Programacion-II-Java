
package trabajopractico8_parte1;

// la clase representa al comprador en el sistema
// con implementacion Notificable para recibir avisos del sistema
public class Cliente implements Notificable{
    private String nombre;

    // constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void notificarCambio(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
    
}
