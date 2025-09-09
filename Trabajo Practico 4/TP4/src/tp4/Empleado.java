
package tp4;


public class Empleado {
    // atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
   
    
    // Atributos estatico para contar empleados
    private static int totalEmpleados = 0;
    
    // Contructor que recibe los atributos
    public Empleado(int id, String nombre, String puesto, double salario){
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = salario;
    totalEmpleados++;
    }
    
    // constructor sobrecargar
    public Empleado(String nombre, String puesto) {
    this.id = totalEmpleados + 1; // id automatico basado en totalEmpleados
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 30000; // salario por defecto
    totalEmpleados++;
    }
    
    // metodo sobrecargado para actualizar 
    public void actualizarSalario(double porcentajeAumento){
        if(porcentajeAumento > 0) {
            this.salario += this.salario * (porcentajeAumento / 100);
    }
    }
    
    //  Metodo sobrecargado para actualizar salario
    public void actualizarSalario(int aumentoFijo){
        if (aumentoFijo > 0){
            this.salario += aumentoFijo;
    }
    }
    // metodo toString
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    // metodo estatico para monstrar el total de empleados
    public static int mostrarTotalEmpleados(){
    return totalEmpleados;
    }
    // getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
