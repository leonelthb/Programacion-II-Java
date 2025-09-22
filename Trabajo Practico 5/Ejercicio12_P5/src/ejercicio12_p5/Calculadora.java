
package ejercicio12_p5;


public class Calculadora {
    public void calcular(Impuesto impuesto) {
        // Aquí calculamos el impuesto, solo usamos el parámetro y no lo almacenamos
        double resultado = impuesto.getMonto() * 0.21; // Ejemplo: calcular un 21% de impuesto
        System.out.println("El impuesto calculado es: " + resultado);
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