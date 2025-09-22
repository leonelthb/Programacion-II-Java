
package ejercicio4_p5;


public class TarjetaDeCredito {
    private int numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito(int numero, String fechaVencimiento, Cliente cliente, Banco banco){
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        cliente.setTarjeta(this); // bidireccional
        this.banco = banco; // agregacion
    }

    public int getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }
    
    

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + '}';
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