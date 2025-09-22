
package ejercicio12_p5;


public class Ejercicio12_P5 {

  
       public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(1000.0);  // Monto de 1000 unidades
        Calculadora calculadora = new Calculadora();
        
        // El calculador usa el Impuesto pero no lo guarda
        calculadora.calcular(impuesto);
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