void
package ejercicio1_p7;


public class Vehiculo {
    // se usa protected para que las subclasds puedan acceder a los atributos
    protected String marca;
    protected String modelo;
    
    // COntrusctor

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    // metodo para mostrar en pantalla la info
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    

    }
           

