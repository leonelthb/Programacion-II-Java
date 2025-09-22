
package ejercicio10_p5;


public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}




//            CuentaBancaria - ClaveSeguridad - Titular 
//            a. Composición: CuentaBancaria → ClaveSeguridad 
//            b. Asociación bidireccional: CuentaBancaria ↔ Titular 
//            Clases y atributos: 
//            CuentaBancaria: cbu, saldo 
//            ClaveSeguridad: codigo, ultimaModificacion 
//            Titular: nombre, dni. 