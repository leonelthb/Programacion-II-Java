
package ejercicio2_p5;


public class Ejercicio2_P5 {

    
    public static void main(String[] args) {
        
        Bateria bateria = new Bateria("LJA456", "4500 mahn");
        
        Usuario user = new Usuario("Leonel Aballay", 36185972);
        
        Celular cel = new Celular("456789", "Motorola", "G50", bateria, user);
       
        
        System.out.println(bateria);
        System.out.println(user);
        System.out.println(cel);
    }
    
}




//
//        Celular: imei, marca, modelo 
//        Batería: modelo, capacidad 
//        Usuario: nombre, dni 


//        Agregación: Celular → Batería 
//        Asociación bidireccional: Celular ↔ Usuario 