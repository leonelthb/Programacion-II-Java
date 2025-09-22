
package ejercicio1_p5;



public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composicion
    private Titular titular; // Asociacion bidireccional
    
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.getPasaporte();
    }

        public String getNumero() {
            return numero;
        }

        public String getFechaEmision() {
            return fechaEmision;
        }

        public Foto getFoto() {
            return foto;
        }

        public Titular getTitular() {
            return titular;
        }
    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
    

    }


    

