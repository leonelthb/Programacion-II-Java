
package ejercicio8_p5.ejercicio.pkg9;


public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", obraSocial=" + obraSocial + "]";
    }
}




//            CitaMédica - Paciente - Profesional 
//            a. Asociación unidireccional: CitaMédica → Paciente,  
//            b. Asociación unidirecciona: CitaMédica → Profesional 
//            Clases y atributos: 
//            CitaMédica: fecha, hora 
//            Paciente: nombre, obraSocial 
//            Profesional: nombre, especialidad 