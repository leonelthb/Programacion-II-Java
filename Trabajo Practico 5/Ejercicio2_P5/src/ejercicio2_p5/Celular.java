
package ejercicio2_p5;


public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregacion
    private Usuario usuario; // bidireccional
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario){
    this.imei = imei;
    this.marca = marca;
    this.modelo = modelo;
    this.bateria = bateria;
    this.usuario = usuario; // 
    usuario.setCelular(this); // establecer relacion bidireccional
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }

 
    
}
