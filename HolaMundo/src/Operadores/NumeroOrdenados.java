package Operadores;

import java.util.Scanner;

public class NumeroOrdenados {

    public static void main(String[] args) {
        
        int numero1 = 0, numero2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        numero1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero");
        numero2 = scanner.nextInt();
        
        String mensaje = (numero1 > numero2) ? numero1 + " Y " + numero2 : numero2 + " y " + numero1;

        System.out.println("mensaje = " + mensaje);
    }
    
}
