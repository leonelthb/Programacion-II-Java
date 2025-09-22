
package ejercicio4_p5;


public class Banco {
    private String nombre;
    private int cuit;
    
    public Banco(String nombre, int cuit){
    this.nombre = nombre;
    this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
    
}



//            TarjetaDeCrédito - Cliente - Banco 
//            a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente 
//            b. Agregación: TarjetaDeCrédito → Banco 
//            Clases y atributos: 
//
//            TarjetaDeCrédito: numero, fechaVencimiento 
//            Cliente: nombre, dni 
//            Banco: nombre, cuit 