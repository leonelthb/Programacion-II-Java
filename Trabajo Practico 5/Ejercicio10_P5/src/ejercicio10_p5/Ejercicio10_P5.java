
package ejercicio10_p5;


public class Ejercicio10_P5 {

   
   public static void main(String[] args) {
        Titular titular = new Titular("María González", "98765432");
        CuentaBancaria cuenta = new CuentaBancaria("123456789000", 25000.75, 
                                                   "CLV987", "2025-09-18", 
                                                   titular);

        System.out.println(cuenta);
        System.out.println("El titular " + titular.getNombre() + 
                           " tiene la cuenta con CBU " + titular.getCuenta().getCbu() +
                           " y clave con última modificación en " + 
                           titular.getCuenta().getClaveSeguridad().getUltimaModificacion());
    }
}




//        CuentaBancaria - ClaveSeguridad - Titular 
//        a. Composición: CuentaBancaria → ClaveSeguridad 
//        b. Asociación bidireccional: CuentaBancaria ↔ Titular 
//        Clases y atributos: 
//        CuentaBancaria: cbu, saldo 
//        ClaveSeguridad: codigo, ultimaModificacion 
//        Titular: nombre, dni. 