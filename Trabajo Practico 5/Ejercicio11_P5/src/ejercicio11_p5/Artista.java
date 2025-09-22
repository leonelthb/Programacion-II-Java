
package ejercicio11_p5;


public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}



//            . Reproductor - Canción - Artista 
//            a. Asociación unidireccional: Canción → Artista 
//            b. Dependencia de uso: Reproductor.reproducir(Cancion) 
//            Clases y atributos: 
//            Canción: titulo. 
//            Artista: nombre, genero. 
//            Reproductor->método: void reproducir(Cancion cancion) 