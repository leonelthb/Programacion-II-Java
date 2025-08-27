
package ejercicio5_p2;


public class Ejercicio5_P2 {

   
    public static void main(String[] args) {
       NaveEspacial nave = new NaveEspacial("Nostromo", 50);
       
       // Acciones
       nave.despegar();
       nave.avanzar(10);
       nave.recargarCombustible(30);
       nave.avanzar(20);
       nave.estado();
       
        
  
        
    } //cierre main
    
}// cierre clase





//
//            Simulación de Nave Espacial 
//            Crear una clase NaveEspacial con los atributos: nombre, combustible. 
//            Métodos requeridos: despegar(), avanzar(distancia), 
//            recargarCombustible(cantidad), mostrarEstado(). 
//            Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
//            se supere el límite al recargar. 
//            Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
//            recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.