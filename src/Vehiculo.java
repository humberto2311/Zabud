public abstract class Vehiculo {
     private String marca ;
    final String modelo ;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void datos();
}


