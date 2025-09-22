
package ejercicio8_p5.ejercicio.pkg9;


public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;        // Asociación unidireccional
    private Profesional profesional;  // Asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica [fecha=" + fecha + ", hora=" + hora + ", " +
                paciente + ", " + profesional + "]";
    }
}



//            CitaMédica - Paciente - Profesional 
//            a. Asociación unidireccional: CitaMédica → Paciente,  
//            b. Asociación unidirecciona: CitaMédica → Profesional 
//            Clases y atributos: 
//            CitaMédica: fecha, hora 
//            Paciente: nombre, obraSocial 
//            Profesional: nombre, especialidad 