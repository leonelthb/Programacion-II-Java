
package ejercicio5_p2;


public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int max_combustible = 50;
    
    
    // contruccion de la nave
    public NaveEspacial(String nombre, int combustibleInicial){
        this.nombre = nombre;
        if (combustibleInicial <= max_combustible){
            this.combustible = combustibleInicial;
        }else {
            this.combustible = max_combustible;
        }
    }
    // metodo para despegar
    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " a despegado " + "Combustible disponible: " + combustible);
        } else{
            System.out.println("No tiene suficiente combustible");
        }
 
    }
    
       // Metodo para avanzar
    public void avanzar(int distancia){
    int consumo = distancia *2;
    if (combustible >= consumo){
        combustible -= consumo;
        System.out.println(nombre + " Avanzo con " + distancia + " combustible disponible: " + combustible); 
    } else{ 
        System.out.println("No tienes combustible suficiente");
    } 
}
        // Metodo para recargar
    public void recargarCombustible(int cantidad){
        if (combustible + cantidad > max_combustible) {
            combustible = max_combustible;
            System.out.println("Tanque lleno");
            
        }else {
            combustible += cantidad;
            System.out.println("Se cargo: " + cantidad + " ahora puede avanzar");
        }
    }
    // estado
    public void estado(){
        System.out.println("La nave " + nombre + " Tiene de combustible: " + combustible );
    }
    
    
} // cierre clase















//            Simulación de Nave Espacial 
//            Crear una clase NaveEspacial con los atributos: nombre, combustible. 
//            Métodos requeridos: despegar(), avanzar(distancia), 
//            recargarCombustible(cantidad), mostrarEstado(). 
//            Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
//            se supere el límite al recargar. 
//            Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
//            recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

