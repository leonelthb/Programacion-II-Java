
package ejercicio9_p5;


public class Ejercicio9_P5 {

 
     public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana López", "ana@example.com");

        Documento documento = new Documento(
            "Contrato de Servicios",
            "Contenido del contrato...",
            usuario
        );

        System.out.println(documento);
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