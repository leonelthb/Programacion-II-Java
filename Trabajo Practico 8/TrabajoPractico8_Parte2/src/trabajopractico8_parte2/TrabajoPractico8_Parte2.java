
package trabajopractico8_parte2;


public class TrabajoPractico8_Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // ejemplo 1: División por cero
              try {
            int a = 10;
            int b = 0; // divisor en cero
            int resultado = a / b; // aquí se lanza ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Se captura la excepción específica cuando se divide por cero
            System.out.println("Error: No se puede dividir por cero");
        }

      
        // ejemplo 2: Conversión de texto a número
        try {
            // Intentamos convertir una cadena no numérica a entero
            int numero = Integer.parseInt("Hola");
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            // Se lanza cuando la cadena no puede convertirse en número
            System.out.println("Error: el texto no es un número válido");
        }

   
        // ejemplo 3: Lectura de archivo con manejo de IOException
            try {
            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("archivo.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (java.io.FileNotFoundException e) {
            // Archivo no existe o ruta incorrecta
            System.out.println("Error: archivo no encontrado");
        } catch (java.io.IOException e) {
            // Error durante la lectura
            System.out.println("Error al leer el archivo");
        }

      
        // ejemplo 4: Excepción personalizada
             try {
            validarEdad(130); // Edad no válida
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

       
        // ejemplo 5: Try-with-resources        
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo con try-with-resources: " + e.getMessage());
        }
    }

    // Método que lanza una excepción personalizada si la edad no es válida
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }
}

// Clase personalizada que extiende Exception
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje); // Llama al constructor de Exception
    }
}

    
    

