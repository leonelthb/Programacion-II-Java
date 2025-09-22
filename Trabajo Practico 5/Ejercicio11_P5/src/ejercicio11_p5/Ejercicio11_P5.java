
package ejercicio11_p5;


public class Ejercicio11_P5 {

   
     public static void main(String[] args) {
        Artista artista = new Artista("Adele", "Pop");
        Cancion cancion = new Cancion("Someone Like You", artista);
        Reproductor reproductor = new Reproductor();
        
        // El reproductor usa la canción para reproducirla, pero no la guarda como atributo
        reproductor.reproducir(cancion);
    }
     
}
}





//            . Reproductor - Canción - Artista 
//            a. Asociación unidireccional: Canción → Artista 
//            b. Dependencia de uso: Reproductor.reproducir(Cancion) 
//            Clases y atributos: 
//            Canción: titulo. 
//            Artista: nombre, genero. 
//            Reproductor->método: void reproducir(Cancion cancion) 