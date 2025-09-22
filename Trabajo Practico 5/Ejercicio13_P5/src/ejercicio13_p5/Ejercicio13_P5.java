
package ejercicio13_p5;

public class Ejercicio13_P5 {


   public static void main(String[] args) {
        Usuario usuario = new Usuario("Leonel Aballay", "leonel@example.com");
        GeneradorQr generador = new GeneradorQr();
        
        generador.generar("https://example.com/perfil/leonel", usuario);
    }
}


//
//            DEPENDENCIA DE CREACIÓN 
//            La clase crea otra dentro de un método, pero no la conserva como atributo.. 
//            Ejercicios de Dependencia de Creación 
//            13. GeneradorQR - Usuario - CódigoQR 
//            a. Asociación unidireccional: CódigoQR → Usuario 
//            b. Dependencia de creación: GeneradorQR.generar(String, Usuario) 
//            Clases y atributos: 
//            CodigoQR: valor. 
//            Usuario: nombre, email. 
//            GeneradorQR->método: void generar(String valor, Usuario usuario) 