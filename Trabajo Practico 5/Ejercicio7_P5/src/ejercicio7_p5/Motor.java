
package ejercicio7_p5;


public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor [tipo=" + tipo + ", numeroSerie=" + numeroSerie + "]";
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