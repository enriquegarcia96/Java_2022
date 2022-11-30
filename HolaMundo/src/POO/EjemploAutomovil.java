package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();

        subaru.fabricante = "Honda Civic";
        subaru.modelo = "Impresa";
        subaru.cilindrada = 2.0;
        subaru.color = "Rojo";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());



    }
}
