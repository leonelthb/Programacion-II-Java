
package ejercicio5_p5;


public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre; // composicion
    private Propietario propietario; // bidireccional
    
      public Computadora(String marca, int numeroSerie, String modeloPlaca, String chipset, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); // composición
        this.propietario = propietario;
        propietario.setComputadora(this); // asociación bidireccional
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
      
      

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + '}';
    }
    
}


//                Computadora - PlacaMadre - Propietario 
//                a. Composición: Computadora → PlacaMadre 
//                b. Asociación bidireccional: Computadora ↔ Propietario 
//                Clases y atributos: 
//
//                Computadora: marca, numeroSerie 
//                PlacaMadre: modelo, chipset 
//                Propietario: nombre, dni 