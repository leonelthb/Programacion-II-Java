
package ejercicio2_p6;


public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    
    public Autor(String id, String nombre, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        
    }
    // info del autor
    public void InfoAutor(){
        System.out.println("Autor: " + nombre + " Nacionalidad: " + nacionalidad + " ID " + id);
        
}
// Getters necesario y 
    public String getNombre() {
        return nombre;
    }
    
@Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }    


}   