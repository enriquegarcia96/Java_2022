package POO;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Gonzales");
        Automovil subaru = new Automovil("Honda Civic","Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);



        Persona pato = new Persona("Andrea", "Caceres");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL) );
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);



        Rueda[] ruedasNissan = new Rueda[5];
        Persona bea = new Persona("Bea", "Gonzales");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);


        Persona lalo = new Persona("Lalo", "Garcia");
        Automovil suzuki = new Automovil("Suziki", "Vitare",
                Color.GRIS, new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);


        Automovil audi = new Automovil("Audi", "AS");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;


        Arrays.sort(autos);

        for (Automovil auto: autos) {
            System.out.println(auto);
        }
    }
}
