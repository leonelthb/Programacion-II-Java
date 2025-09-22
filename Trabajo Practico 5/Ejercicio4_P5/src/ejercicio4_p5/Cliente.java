
package ejercicio4_p5;


public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;
    
    public Cliente(String nombre, int dni){
    this.nombre = nombre;
    this.dni = dni;
   
    }
 public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }


    
}


//            TarjetaDeCrédito - Cliente - Banco 
//            a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente 
//            b. Agregación: TarjetaDeCrédito → Banco 
//            Clases y atributos: 
//
//            TarjetaDeCrédito: numero, fechaVencimiento 
//            Cliente: nombre, dni 
//            Banco: nombre, cuit 