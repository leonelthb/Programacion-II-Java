
package ejercicio4_p4;


public class Ejercicio4_P4 {

    
    public static void main(String[] args) {
        Gallina Gallina1 = new Gallina(1, 2);
        Gallina Gallina2 = new Gallina(2, 4);
        //Accion gallina 1
        Gallina1.ponerHuevo();
        Gallina1.ponerHuevo();
        Gallina1.envejecer();
        
        // Accion gallina2
        Gallina2.ponerHuevo();
        Gallina2.ponerHuevo();
        Gallina2.ponerHuevo();
        Gallina2.ponerHuevo();
        Gallina2.envejecer();
        Gallina2.envejecer();
        
        // Estado de las gallinas
        System.out.println("Estado de las gallinas");
        Gallina1.mostrarEstado();
        Gallina2.mostrarEstado();
        
    } // Cierre main
    
} // cierra clase





//            Gestión de Gallinas en Granja Digital 
//            a. Crear una clase Gallina con los atributos: idGallina, edad, 
//            huevosPuestos. 
//            Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
//            Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y 
//            mostrar su estado. 