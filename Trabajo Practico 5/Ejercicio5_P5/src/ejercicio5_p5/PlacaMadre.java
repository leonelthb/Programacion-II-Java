
package ejercicio5_p5;


public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    public PlacaMadre(String modelo, String chipset){
    this.modelo = modelo;
    this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    
    
}


//            Computadora - PlacaMadre - Propietario 
//            a. Composición: Computadora → PlacaMadre 
//            b. Asociación bidireccional: Computadora ↔ Propietario 
//            Clases y atributos: 
//
//            Computadora: marca, numeroSerie 
//            PlacaMadre: modelo, chipset 
//            Propietario: nombre, dni 