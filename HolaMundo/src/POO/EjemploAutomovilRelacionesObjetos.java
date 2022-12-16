package POO;
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Rueda[] ruedasSub = new Rueda[5];
        ruedasSub[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[4] = new Rueda("Yokohama", 16, 7.5);

        Persona conductorSubaru = new Persona("Luci", "Gonzales");
        Automovil subaru = new Automovil("Honda Civic","Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        subaru.setRuedas(ruedasSub);



        Rueda[] ruedasMaz = {new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)
        };
        Persona pato = new Persona("Andrea", "Caceres");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0, TipoMotor.DIESEL) );
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        mazda.setRuedas(ruedasMaz);


        Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),};
        Persona bea = new Persona("Bea", "Gonzales");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50), bea, ruedasNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.setRuedas(ruedasNissan);


        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),};
        Persona lalo = new Persona("Lalo", "Garcia");
        Automovil nissan2 = new Automovil("Nissan", "Navara",
                Color.GRIS, new Motor(3.5, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);


        Automovil auto = new Automovil();



        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println( nissan.verDetalle());
        System.out.println( nissan2.verDetalle());


        /*System.out.println("Conductor subaru:  " + subaru.getConductor());
        System.out.println("Ruedas subaru");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante()  + ", " + r.getAro() + ", ancho: "+r.getAncho());
        }*/


    }
}
