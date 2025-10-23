
package trabajopractico8_parte1;

// clase que represanta su pago mednate paypal
// con le interfaz de pago
public class Paypal implements Pago {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }
 
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago por via Paypal por $" + monto + " desde la cuenta " + email);
    }
    
    
}
