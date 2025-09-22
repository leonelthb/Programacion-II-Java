
package ejercicio10_p5;


public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular;               // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, 
                          String codigoClave, String ultimaModificacion, 
                          Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion); // composición
        this.titular = titular;
        titular.setCuenta(this); // bidireccionalidad
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + 
               ", " + claveSeguridad + ", " + titular + "]";
    }
}


//            CuentaBancaria - ClaveSeguridad - Titular 
//            a. Composición: CuentaBancaria → ClaveSeguridad 
//            b. Asociación bidireccional: CuentaBancaria ↔ Titular 
//            Clases y atributos: 
//            CuentaBancaria: cbu, saldo 
//            ClaveSeguridad: codigo, ultimaModificacion 
//            Titular: nombre, dni. 