
package ejercicio3_p7;

import java.util.ArrayList;


public class Ejercicio3_P7 {

    public static void main(String[] args) {
       // array para la lista de empleados 
        ArrayList<Empleado> emp = new ArrayList<>();
        
        // tipos de empleados
        emp.add(new EmpleadoPlanta("Leonel", 15000, 1000));
        emp.add(new EmpleadoTemporal("Jesus", 20, 150));
        emp.add(new EmpleadoPlanta("Carla", 100000, 15000));
        emp.add(new EmpleadoTemporal("Maria", 15, 150));
       
       
        // se recorre la lista con ciclo for polimorfismo
  for (Empleado e : emp) {
            e.mostrarInfo();
            System.out.println("Sueldo: $" + e.calcularSueldo());

            // Clasificación con instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado temporal");
            }

            System.out.println("*****************************");
        }
    }
}

