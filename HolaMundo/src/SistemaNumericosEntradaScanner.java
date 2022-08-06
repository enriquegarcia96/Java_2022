import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaNumericosEntradaScanner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){
            System.out.println("Error debe de ingrese un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);


        //octal
        System.out.println("numero octal = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;

        System.out.println("numeroOctal = " + numeroOctal);


        System.out.println("numero hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        String mensaje = "SIUU";
        System.out.println(mensaje);
    }
}
