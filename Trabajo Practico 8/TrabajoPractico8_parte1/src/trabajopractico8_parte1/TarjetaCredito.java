
package trabajopractico8_parte1;

// clase que representa un pago con tarjeta de credito
// con implementacion de PagoConDescuento
public class TarjetaCredito implements PagoConDecuento{
    private String titular;

    // constructor
    public TarjetaCredito(String titular) {
        this.titular = titular;
    }
    
    //implementacion del metodo procesarPago de Pago
    public void procesarPago(double monto){
        System.out.println("Pago con tarjeta procesado por $" + monto);
    }
    
    // implementacion del metodo AplicarDecuento de PagarConDecuentos
    public double aplicarDescuento(double monto){
        return monto * 0.9;
    }
    
}
