package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);

        Automovil subaru = new Automovil("Honda Civic","Impresa");
        subaru.setEstanque(new Estanque());
        subaru.setMotor(motorSubaru);
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL),
                new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEL),
                new Estanque(50));


        Automovil auto = new Automovil();

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println( nissan.verDetalle());

        System.out.println("================================");
        System.out.println(nissan);
        System.out.println(nissan.toString());


        System.out.println(subaru.acelerar(5000));
        System.out.println(subaru.frenar());
        System.out.println(auto.equals(nissan));

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60));

    }
}
