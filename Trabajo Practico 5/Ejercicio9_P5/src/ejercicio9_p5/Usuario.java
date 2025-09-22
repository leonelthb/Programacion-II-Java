
package ejercicio9_p5;


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

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", email=" + email + "]";
    }
}


//
//            Documento - FirmaDigital - Usuario 
//            a. Composición: Documento → FirmaDigital 
//            b. Agregación: FirmaDigital → Usuario 
//            Clases y atributos: 
//            Documento: titulo, contenido 
//            FirmaDigital: codigoHash, fecha 
//            Usuario: nombre, email 