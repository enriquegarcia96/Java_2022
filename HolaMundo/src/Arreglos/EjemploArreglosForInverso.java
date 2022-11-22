package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {

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

        System.out.println("====== usando for  inverso =====");
        for(int i = 0; i < total; i++){
            System.out.println("Para i = " + (total-1-i) + " Valor :" + products[total-1-i]);
        }

        System.out.println("====== usando for  inverso  2 =====");

        for(int i = total -1; i >= 0; i--){
            System.out.println("Para i = " + i + " Valor "+ products[i]);
        }

    }
}
