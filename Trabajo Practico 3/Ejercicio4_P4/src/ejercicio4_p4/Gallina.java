
package ejercicio4_p4;


public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    // construccion
    public Gallina(int idGallina, int edadInicial){
    this.idGallina = idGallina;
    this.edad = edadInicial;
    this.huevosPuestos = 0; 
    }
    
    // metodo poner huevos
    public void ponerHuevo(){
        huevosPuestos++;
        System.out.println("La gallina: " + idGallina + " Puso: " + huevosPuestos + " Huevos");
        
    }    
    //envejeces
    public void envejecer(){
     edad++;
        System.out.println("La gallina: " + idGallina + " ahora tiene: " + edad + " edad");
   
    }
    
    // Estado de las gallinas
     public void mostrarEstado(){
         System.out.println("La gallina: " + idGallina + " Puso una cantidad de: " + huevosPuestos + " Huevos" + " y tiene: " + edad + " de edad");
     
     
     }
    }









//            Gestión de Gallinas en Granja Digital 
//            a. Crear una clase Gallina con los atributos: idGallina, edad, 
//            huevosPuestos. 
//            Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
//            Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y 
//            mostrar su estado. 