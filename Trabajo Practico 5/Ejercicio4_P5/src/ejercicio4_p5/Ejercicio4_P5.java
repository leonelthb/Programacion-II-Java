
package ejercicio4_p5;

public class Ejercicio4_P5 {

 
    public static void main(String[] args) {
        Banco banco = new Banco("Banco de Cordoba", 253601480);
        Cliente cliente = new Cliente("Leonel Aballay", 36185972);
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(123458966, "15/27", cliente,banco);
        
        
        
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco: " + cliente.getTarjeta().getBanco().getNombre());
    } // cierre main
    
}// cierre clase





//            TarjetaDeCrédito - Cliente - Banco 
//            a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente 
//            b. Agregación: TarjetaDeCrédito → Banco 
//            Clases y atributos: 
//
//            TarjetaDeCrédito: numero, fechaVencimiento 
//            Cliente: nombre, dni 
//            Banco: nombre, cuit 