package POO;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Honda Civic","Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("manzda.fabricante = " +  mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
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
    }
}
