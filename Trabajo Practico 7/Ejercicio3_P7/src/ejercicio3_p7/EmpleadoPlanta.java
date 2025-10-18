
package ejercicio3_p7;


public class EmpleadoPlanta extends Empleado {
    // atributos tipicos de empleado fijo para diferenciar con el temporal
    private double sueldoBase;
    private double bonificacion;

    public EmpleadoPlanta(String nombre, double bonificacion, double par1) {
        super(nombre); // llama al consturctor de la clase padre
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }
    
    
    @Override
    public double calcularSueldo(){
        return sueldoBase + bonificacion;
    }
}
