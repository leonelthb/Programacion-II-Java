
package ejercicio7_p5;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;         // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this); // vínculo bidireccional
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", modelo=" + modelo + ", " + motor + "]";
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