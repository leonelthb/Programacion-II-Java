
package ejercicio12_p5;


public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }
}

//
//            Impuesto - Contribuyente - Calculadora 
//            a. Asociación unidireccional: Impuesto → Contribuyente 
//            b. Dependencia de uso: Calculadora.calcular(Impuesto) 
//            Clases y atributos:  
//            Impuesto: monto. 
//            Contribuyente: nombre, cuil. 
//            Calculadora->método: void calcular(Impuesto impuesto) 