
package ejercicio13_p5;


public class GeneradorQr {
    public void generar(String valor, Usuario usuario) {
        // Dependencia de creación: se crea el objeto aquí
        CodigoQr codigo = new CodigoQr(valor, usuario);
        codigo.mostrar();
        // No se guarda el objeto como atributo
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