
package ejercicio11_p5;


public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
}



//            . Reproductor - Canción - Artista 
//            a. Asociación unidireccional: Canción → Artista 
//            b. Dependencia de uso: Reproductor.reproducir(Cancion) 
//            Clases y atributos: 
//            Canción: titulo. 
//            Artista: nombre, genero. 
//            Reproductor->método: void reproducir(Cancion cancion) 