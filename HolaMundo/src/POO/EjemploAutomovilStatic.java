package POO;

import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Honda Civic","Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor("Rojo");

        Automovil mazda = new Automovil("Mazda","BT-50","Rojo",3.0);
        System.out.println("manzda.fabricante = " +  mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris", 3.5, 50);
        nissan2.setColor("Amarillo");
        Automovil.setColorPatente("Azul");

        Automovil auto = new Automovil();



        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println( nissan.verDetalle());

        System.out.println( nissan2.verDetalle());
        System.out.println("Automovil,getColorPatente() = "+  Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));



    }
}
