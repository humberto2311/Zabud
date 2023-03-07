import interfac.*;
final class Moto extends Vehiculo implements Accelerate, Frenar, Marcha {

    protected double cilindraje;

    protected boolean electronica;

    public Moto(String marca, String modelo, double cilindraje, boolean es_Electrico) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
        this.electronica = es_Electrico;
    }
    public void datos(){
        System.out.println("Has escogido Moto"+
                "\nMarca: "+getMarca()+
                "\nModelo: "+modelo+
                "\nCilindraje: "+cilindraje+"cc"+
                "\nelectrico "+ electronica);
        marcha();
        acelerar();
        frenar();

    }
}
