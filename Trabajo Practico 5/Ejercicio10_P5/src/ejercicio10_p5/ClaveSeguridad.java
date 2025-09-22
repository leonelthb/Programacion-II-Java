
package ejercicio10_p5;


public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=" + codigo + 
               ", ultimaModificacion=" + ultimaModificacion + "]";
    }
}




//            CuentaBancaria - ClaveSeguridad - Titular 
//            a. Composición: CuentaBancaria → ClaveSeguridad 
//            b. Asociación bidireccional: CuentaBancaria ↔ Titular 
//            Clases y atributos: 
//            CuentaBancaria: cbu, saldo 
//            ClaveSeguridad: codigo, ultimaModificacion 
//            Titular: nombre, dni. 