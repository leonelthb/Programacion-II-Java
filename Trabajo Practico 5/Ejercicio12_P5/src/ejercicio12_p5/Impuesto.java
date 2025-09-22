
package ejercicio12_p5;


public class Impuesto {
    private double monto;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
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