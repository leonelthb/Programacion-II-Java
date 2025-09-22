
package ejercicio14_p5;


public class EditorVIdeo {
    public void exportar(String formato, Proyecto proyecto) {
        // Dependencia de creación: se crea el Render aquí
        Render render = new Render(formato, proyecto);
        render.mostrarInfo();
        // No se guarda como atributo del EditorVideo
    }
}


//             EditorVideo - Proyecto - Render 
//            a. Asociación unidireccional: Render → Proyecto 
//            b. Dependencia de creación: EditorVideo.exportar(String, Proyecto) 
//            c. Clases y atributos: 
//            Render: formato. 
//            Proyecto: nombre, duracionMin. 
//            EditorVideo->método: void exportar(String formato, Proyecto proyecto) 
