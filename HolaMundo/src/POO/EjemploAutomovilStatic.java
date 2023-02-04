package POO;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Honda Civic","Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL) );
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("manzda.fabricante = " +  mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        //mazda.setEstanque(new Estanque());

        Automovil nissan2 = new Automovil("Nissan", "Navara",
                Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();



        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println( nissan.verDetalle());

        System.out.println( nissan2.verDetalle());
        System.out.println("Automovil,getColorPatente() = "+  Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));


        System.out.println("Velocidad maxima carretera:  "  + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad:  "  + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoAutomovil = subaru.getTipo();
        System.out.println("tipoAutomovil.getNombre() = " + tipoAutomovil.getNombre());
        System.out.println("tipoAutomovil.getDescripcion() = " + tipoAutomovil.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));

    }
}
