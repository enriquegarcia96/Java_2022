package POO;

import java.security.AuthProvider;
import java.util.Date;
import java.util.Stack;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Honda Civic","Impresa");
        Date fecha = new Date();

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,3.0);



        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil auto = new Automovil();

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println( nissan.verDetalle());

        System.out.println("================================");
        System.out.println(auto.equals(fecha));
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
