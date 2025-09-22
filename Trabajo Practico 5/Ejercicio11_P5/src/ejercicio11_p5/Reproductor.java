
package ejercicio11_p5;


public class Reproductor {
    public void reproducir(Cancion cancion) {
        // Aquí se usa la clase Canción, pero no se guarda como atributo
        System.out.println("Reproduciendo la canción: " + cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}


//            . Reproductor - Canción - Artista 
//            a. Asociación unidireccional: Canción → Artista 
//            b. Dependencia de uso: Reproductor.reproducir(Cancion) 
//            Clases y atributos: 
//            Canción: titulo. 
//            Artista: nombre, genero. 
//            Reproductor->método: void reproducir(Cancion cancion) 