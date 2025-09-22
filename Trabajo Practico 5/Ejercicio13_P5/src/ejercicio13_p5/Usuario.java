
package ejercicio13_p5;


public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
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