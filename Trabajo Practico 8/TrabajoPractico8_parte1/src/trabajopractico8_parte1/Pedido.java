
package trabajopractico8_parte1;

// clase pedido reperesenta que un pedido contiene varios productos
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    // constructor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

  
    // metodo agrgar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // calcular total
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // cambiar estado dle producto
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambio("El pedido cambió de estado a: " + nuevoEstado);
    }
    }
    
 
    
    
    

