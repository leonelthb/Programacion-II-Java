
package ejercicio6_p5;


public class Ejercicio6_P5 {

  
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "123456789");
        Mesa mesa = new Mesa(5, 4);

        Reserva reserva = new Reserva(
            "22/09/2025",  // fecha como String
            "20:30",       // hora como String
            cliente,
            mesa
        );

        System.out.println(reserva);
    }
}




//            Reserva - Cliente - Mesa 
//            a. Asociación unidireccional: Reserva → Cliente 
//            b. Agregación: Reserva → Mesa 
//            Clases y atributos: 
//            Reserva: fecha, hora 
//            Cliente: nombre, telefono 
//            Mesa: numero, capacidad 