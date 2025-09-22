
package ejercicio8_p5.ejercicio.pkg9;


public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesional [nombre=" + nombre + ", especialidad=" + especialidad + "]";
    }
}




//            CitaMédica - Paciente - Profesional 
//            a. Asociación unidireccional: CitaMédica → Paciente,  
//            b. Asociación unidirecciona: CitaMédica → Profesional 
//            Clases y atributos: 
//            CitaMédica: fecha, hora 
//            Paciente: nombre, obraSocial 
//            Profesional: nombre, especialidad 