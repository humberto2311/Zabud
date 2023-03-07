import interfac.*;
final class Auto extends Vehiculo implements Accelerate, Frenar, Marcha {

    protected String motor;
    protected int puertas;

    public Auto(String marca, String modelo, String motor, int puertas) {
        super(marca, modelo);
        this.motor = motor;
        this.puertas = puertas;
    }
    public void datos(){
        System.out.println("Has escogido Auto"+
                "\nMarca: "+getMarca()+
                "\nModelo: "+modelo+
                "\nMotor: "+motor+
                "\npuerta: "+puertas);
        marcha();
        acelerar();
        frenar();

    }
}

