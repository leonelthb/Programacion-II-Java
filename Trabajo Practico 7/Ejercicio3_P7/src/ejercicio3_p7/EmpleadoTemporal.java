
package ejercicio3_p7;


public class EmpleadoTemporal extends Empleado{
    // atributos diferentes para diferenciar del empleado de planta
    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(String nombre, int diasTrabajados, int pagoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }
    
    @Override
    public double calcularSueldo(){
        return diasTrabajados * pagoPorDia;
    }
    
}
