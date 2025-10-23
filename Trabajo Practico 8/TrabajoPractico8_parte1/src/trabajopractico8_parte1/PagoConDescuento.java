
package trabajopractico8_parte1;

// interfaaz pagoConDecuento ampliada de la interfaz de PAgo
// agregando un metodo para aplicar descuentos
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
    
}
