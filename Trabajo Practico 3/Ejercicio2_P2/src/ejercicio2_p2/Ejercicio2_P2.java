
package ejercicio2_p2;


public class Ejercicio2_P2 {

   
    public static void main(String[] args) {
        Mascota animal = new Mascota(); 
        animal.mostrarInfo();
        animal.nombre = "Firulais";
        animal.especie = "Can";
        animal.edad = 2;
        animal.mostrarInfo();
        
        System.out.println(animal.nombre + " Ahora tiene " + animal.cumplirAnios() + " de edad");
        System.out.println(animal.nombre + " Ahora tiene " + animal.cumplirAnios() + " de edad");
        System.out.println(animal.nombre + " Ahora tiene " + animal.cumplirAnios() + " de edad");
        System.out.println(animal.nombre + " Ahora tiene " + animal.cumplirAnios() + " de edad");
    } // cierre main
    
        
    } // cierre clase
    







//        Registro de Mascotas 
//        a. Crear una clase Mascota con los atributos: nombre, especie, edad. 
//        Métodos requeridos: mostrarInfo(), cumplirAnios(). 
//        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y 
//        verificar los cambios. 