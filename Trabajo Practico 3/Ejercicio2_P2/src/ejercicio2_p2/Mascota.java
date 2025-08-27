
package ejercicio2_p2;


public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
    System.out.println("nombre: " + nombre + " " + "Especie: " + especie + " " + "edad: " + edad);
    }
    
    int cumplirAnios(){
        return edad++;
    }
    
}
