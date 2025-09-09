
package tp4;


public class TP4 {

    
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(101, "Leonel Aballay", "Encargado", 75000);
        Empleado e2 = new Empleado("Luis Barrionuevo", "Despachador");
        Empleado e3 = new Empleado("Carla Ruiz", "Distribuidora");
        
        // aplicar aumentos de salario
        e2.actualizarSalario(10.0);
        e3.actualizarSalario(5000);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados()  );
    }
    
}
