package FlujoDeControl;

import java.beans.XMLEncoder;
import java.util.Scanner;

public class TareaBuscarMinimoValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indice = 1;

        System.out.println("ingrese la cantidad de numeros: ");
        int cantidadDeNumeros = scanner.nextInt();

        int[] agrega = new int[cantidadDeNumeros];
        int menor = Integer.MAX_VALUE;

        for (int i= 0; i<agrega.length; i++){

            System.out.println("ingrese el numero " + indice);
            int agregar = scanner.nextInt();
            agrega[i] = agregar;
            menor = (agregar < menor ) ? agregar : menor;
            indice++;

        }
        System.out.println("numero menor es = " + menor);

    }

}
