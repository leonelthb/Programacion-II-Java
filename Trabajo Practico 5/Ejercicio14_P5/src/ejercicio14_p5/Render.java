
package ejercicio14_p5;


public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public void mostrarInfo() {
        System.out.println("Renderizando proyecto '" + proyecto.getNombre() +
                           "' en formato: " + formato +
                           " (" + proyecto.getDuracionMin() + " minutos)");
    }
}


//             EditorVideo - Proyecto - Render 
//            a. Asociación unidireccional: Render → Proyecto 
//            b. Dependencia de creación: EditorVideo.exportar(String, Proyecto) 
//            c. Clases y atributos: 
//            Render: formato. 
//            Proyecto: nombre, duracionMin. 
//            EditorVideo->método: void exportar(String formato, Proyecto proyecto) 