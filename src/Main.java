import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Vehiculo b = new Bicicleta("GM","rtxx","michelin",45.4,4);
        Vehiculo c= new Moto("pulsar","2019",400,false);
        Auto a=new Auto("chevrolet","2015","LS400",4);


  
        System.out.println("Escribe el tipo de vehiculo que quieras ver"+
                          "\n1. Auto"+
                           "\n2. Moto"+
                             "\n3. Bicicleta");
        switch (sc.nextInt()){
            case 1:
                a.datos();
                break;
            case 2:
                b.datos();

                break;
            case 3 :
                c.datos();
                        break;
        }


    }
}