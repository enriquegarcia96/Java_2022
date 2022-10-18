package FlujoDeControl;

import java.util.Scanner;

public class Multiplicar_dos_numeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = scanner.nextInt();

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        System.out.println("resultado = " + resultado);
    }

}
