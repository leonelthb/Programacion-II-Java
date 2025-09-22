
package ejercicio1_p5;


public class Ejercicio1_P5 {

  
    public static void main(String[] args) {
       Foto foto = new Foto("imagen01.jpg", "JPG");
       Titular titular = new Titular("Leonel Aballlay", "36185942");
       Pasaporte pasaporte = new Pasaporte("AR123456", "15/09/25", foto, titular);
       
   
       
        System.out.println(pasaporte);
        System.out.println(titular.getPasaporte());
       
    } // cierre clase
    
} // cierre main
