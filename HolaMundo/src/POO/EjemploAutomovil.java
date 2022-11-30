package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();

        subaru.setFabricante("Honda Civic");
        subaru.setModelo("Impresa");
        subaru.setCilindrada(2.0);
        subaru.setColor("Rojo");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Mazda");
        mazda.setModelo("BT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(5000));
        System.out.println(subaru.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 60));

    }
}
