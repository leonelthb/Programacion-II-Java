
package ejercicio14_p5;


public class Ejercicio14_P5 {

    
      public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Video Promocional", 5);
        EditorVIdeo editor = new EditorVIdeo();
        
        editor.exportar("MP4", proyecto);
    }
    
}



//             EditorVideo - Proyecto - Render 
//            a. Asociación unidireccional: Render → Proyecto 
//            b. Dependencia de creación: EditorVideo.exportar(String, Proyecto) 
//            c. Clases y atributos: 
//            Render: formato. 
//            Proyecto: nombre, duracionMin. 
//            EditorVideo->método: void exportar(String formato, Proyecto proyecto) 