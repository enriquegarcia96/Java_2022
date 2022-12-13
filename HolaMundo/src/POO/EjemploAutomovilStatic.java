package POO;

import javax.swing.text.DefaultStyledDocument;
import java.util.Date;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Honda Civic","Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor(Automovil.COLOR_BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-50",Automovil.COLOR_ROJO,3.0);
        System.out.println("manzda.fabricante = " +  mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);
        nissan2.setColor(Automovil.COLOR_AMARILLO);
        Automovil.setColorPatente(Automovil.COLOR_AZUL);

        Automovil auto = new Automovil();



        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println( nissan.verDetalle());

        System.out.println( nissan2.verDetalle());
        System.out.println("Automovil,getColorPatente() = "+  Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));


        System.out.println("Velocidad maxima carretera:  "  + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad:  "  + Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}
