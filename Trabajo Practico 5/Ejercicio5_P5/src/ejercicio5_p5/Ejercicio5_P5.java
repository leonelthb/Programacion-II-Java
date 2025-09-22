
package ejercicio5_p5;


public class Ejercicio5_P5 {

   
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Leonel", 36185972);
        Computadora compu = new Computadora("Asus", 45123, "B450", "AMD", propietario);

        System.out.println("Propietario: " + propietario.getNombre() + " - DNI: " + propietario.getDni());
        System.out.println("Computadora: " + compu.getMarca() + " - Serie: " + compu.getNumeroSerie());
        System.out.println("Placa Madre: " + compu.getPlacaMadre().getModelo() + " - Chipset: " + compu.getPlacaMadre().getChipset());
        System.out.println("La computadora pertenece a: " + compu.getPropietario().getNombre());
    
        
        
    }// cierre main
    
}// cierre clase



//
//            Computadora - PlacaMadre - Propietario 
//            a. Composición: Computadora → PlacaMadre 
//            b. Asociación bidireccional: Computadora ↔ Propietario 
//            Clases y atributos: 
//
//            Computadora: marca, numeroSerie 
//            PlacaMadre: modelo, chipset 
//            Propietario: nombre, dni 