
package ejercicio8_p5.ejercicio.pkg9;


public class Ejercicio8_P5EJERCICIO9 {

   
    public static void main(String[] args) {
      Paciente paciente = new Paciente("Carlos Gómez", "OSDE");
        Profesional profesional = new Profesional("Dra. María Pérez", "Cardiología");

        CitaMedica cita = new CitaMedica("20/09/2025", "10:30", paciente, profesional);

        System.out.println(cita);
    }
}





//            CitaMédica - Paciente - Profesional 
//            a. Asociación unidireccional: CitaMédica → Paciente,  
//            b. Asociación unidirecciona: CitaMédica → Profesional 
//            Clases y atributos: 
//            CitaMédica: fecha, hora 
//            Paciente: nombre, obraSocial 
//            Profesional: nombre, especialidad 