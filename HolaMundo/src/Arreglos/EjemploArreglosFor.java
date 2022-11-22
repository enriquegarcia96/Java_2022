package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {

    public static void main(String[] args) {

        String[] products = new String[7];

        int total = products.length;


        products[0] = "memoria pendrive";
        products[1] = "iphone";
        products[2] = "Disco duro";
        products[3] = "Asus";
        products[4] = "macbook";
        products[5] = "Chomecast";
        products[6] = "Bicicleta";

        Arrays.sort(products);
        System.out.println("====== usando for =====");
        for (int i = 0; i< total; i++){
            System.out.println("para Indice " +i+ " : " + products[i]);
        }

        System.out.println("========  usando forech  ===" );

        for (String prod: products) {
            System.out.println("prod = " + prod);
        }

        System.out.println("========  usando while  ===" );
        int i = 0;
        while ( i< total){
            System.out.println("para Indice " +i+ " : " + products[i]);
            i++;
        }

        System.out.println("========  usando do while  ===" );
        int j = 0;
        do{
            System.out.println("para Indice " +j+ " : " + products[j]);
            j++;
        }while (i < total);


        int [] numeros = new int[10];
        int totalNumeros = numeros.length;

        for (int k = 0; k < totalNumeros; k ++){
            numeros[k] = k*3;
        }


        for (int k = 0; k < totalNumeros; k ++){
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
