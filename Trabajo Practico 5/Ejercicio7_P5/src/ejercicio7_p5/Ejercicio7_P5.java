
package ejercicio7_p5;


public class Ejercicio7_P5 {

   
public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Diesel", "M12345");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);
        Conductor conductor = new Conductor("Juan Pérez", "LIC789");

        // Asociación bidireccional
        vehiculo.setConductor(conductor);

        System.out.println(vehiculo);
        System.out.println(conductor);
        System.out.println("El conductor " + conductor.getNombre() +
                           " maneja el vehículo con patente " + conductor.getVehiculo().getPatente());
    }
    
}





//
//                Vehículo - Motor - Conductor 
//                a. Agregación: Vehículo → Motor 
//                b. Asociación bidireccional: Vehículo ↔ Conductor 
//                Clases y atributos: 
//                Vehículo: patente, modelo 
//                Motor: tipo, numeroSerie 
//                Conductor: nombre, licencia 