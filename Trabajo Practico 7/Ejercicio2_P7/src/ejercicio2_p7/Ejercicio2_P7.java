
package ejercicio2_p7;


public class Ejercicio2_P7 {

  
    public static void main(String[] args) {
       // se crea un array 
       Figura[] figuras = new Figura[3];
       
       
       // Instancias de diferentes figuras
       figuras[0] = new Circulo("Circulo", 3.0);
       figuras[1] = new Rectangulo("Rectangulo", 4.0, 2.5);
       figuras[2] = new Circulo("Circulo Grnade", 5.0);
       
       
       // ciclo for para recorrer el array con polimorfismo
        for (Figura f : figuras) {
            f.mostrarNombre();
            System.out.println("Area: " + f.calcularArea());
            System.out.println("********************");
        }
       
    }
    
}
