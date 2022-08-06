import javax.swing.*;

public class SistemaNumericos {

    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

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
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
