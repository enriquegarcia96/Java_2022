import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {


    public static void main(String[] args) {
        String nombreFactura;
        double producto1 = 0, producto2 =0, impuesto = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola bienvenidos a la pulperia Belkin");
        System.out.println("Ingrese el nombre de la factura\n");
        nombreFactura = scanner.nextLine();

        try {
            System.out.println("Ingrese el precio del producto 1 ");
            producto1 = scanner.nextDouble();
            System.out.println("Ingrese el precio del producto 2 ");
            producto2 = scanner.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("Error debe de ingresar un valor entero\n");
            main(args);
            System.exit(0);
        }

        impuesto = ((producto1 + producto2) * 0.19 );

        System.out.println("La factura de " + nombreFactura + " tiene un total bruto de " + (producto1+producto2) + ", "
        + "con un impuesto de " + impuesto + " el monto despues de impuesto es de " + (producto1+producto2+impuesto));

    }

}
