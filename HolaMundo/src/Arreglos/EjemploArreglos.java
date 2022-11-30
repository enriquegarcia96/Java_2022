package Arreglos;

import java.util.Arrays;

public class EjemploArreglos {

    public static void main(String[] args) {

        String[] products = new String[7];
        products[0] = "memoria pendrive";
        products[1] = "iphone";
        products[2] = "Disco duro";
        products[3] = "Asus";
        products[4] = "macbook";
        products[5] = "Chomecast";
        products[6] = "Bicicleta";

        Arrays.sort(products);

        String prod1 = products[0];
        String prod2 = products[1];
        String prod3 = products[2];
        String prod4 = products[3];
        String prod5 = products[4];
        String prod6 = products[5];
        String prod7 = products[6];

        System.out.println("products[0] = " + prod1);
        System.out.println("products[1] = " + prod2 );
        System.out.println("products[2] = " + prod3);
        System.out.println("products[3] = " + prod4);
        System.out.println("products[4] = " + prod5);
        System.out.println("products[5] = " + prod6);
        System.out.println("products[6] = " + prod7);



        int [] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        //numeros[2] = (int) 3L;// cas
        numeros[2] = 35;
        numeros[3] = -1;
        //numeros[4] = 5;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        //int m = numeros[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
