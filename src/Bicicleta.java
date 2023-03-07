import interfac.Accelerate;
import interfac.Frenar;
import interfac.Marcha;
final class Bicicleta extends Vehiculo implements Accelerate, Frenar, Marcha {
   private  String tipoLlanta;
   protected double tamano;

   protected int cambios;


    public Bicicleta(String marca, String modelo, String tipoLlanta, double tamano, int cambios) {
        super(marca, modelo);
        this.tipoLlanta = tipoLlanta;
        this.tamano = tamano;
        this.cambios = cambios;
    }

    public void datos(){
        System.out.println("Has escogido Moto"+
                           "\nMarca: "+getMarca()+
                           "\nModelo: "+modelo+
                           "\nTipo llantas: "+tipoLlanta+
                           "\nTamaño: "+tamano+
                           "\nCambios: "+cambios);
        marcha();
        acelerar();
        frenar();

    }
}
