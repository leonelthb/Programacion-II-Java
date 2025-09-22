
package ejercicio13_p5;


public class CodigoQr {
    private String valor;
    private Usuario usuario; // Asociación unidireccional

    public CodigoQr(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public void mostrar() {
        System.out.println("Código QR: " + valor + " para usuario: " + usuario.getNombre());
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