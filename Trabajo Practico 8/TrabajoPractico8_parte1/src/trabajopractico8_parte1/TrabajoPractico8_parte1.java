
package trabajopractico8_parte1;

import java.util.ArrayList;


public class TrabajoPractico8_parte1 {

    
    public static void main(String[] args) {
       
     
      
        // Se crea el cliente
        Cliente cliente = new Cliente("Leonel");

        // Se crea el pedido asociado al cliente
        Pedido p = new Pedido(cliente);

        // Se agrega un producto al pedido
        p.agregarProducto(new Producto("Mouse", 3500));
        p.agregarProducto(new Producto("Teclado", 7000));

        // calcular total del pedido
        double total = p.calcularTotal();
        System.out.println("Total del pedido: $" + total);
        
        // pago con tarjeta con descuento
        TarjetaCredito tarjeta = new TarjetaCredito("Leonel Gómez");
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        // Se muestra el total del pedido
        System.out.println("Total del pedido: $" + p.calcularTotal());
        
        // Cambio de estado y notificación al cliente
        p.cambiarEstado("Enviado");
    }
    
}
