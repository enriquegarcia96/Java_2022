package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-1];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

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
        arregloInverso(products);

        System.out.println("====== usando for =====");

       // Collections.reverse(Arrays.asList(products));

        System.out.println("====== usando for =====");
        for (int i = 0; i< total; i++){
            System.out.println("para Indice " +i+ " : " + products[i]);
        }

    }
}
