
package ejercicio9_p5;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // La firma se crea dentro del documento → composición
        this.firma = new FirmaDigital("ABC123HASH", "18/09/2025", usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido + "]\n" + firma;
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
