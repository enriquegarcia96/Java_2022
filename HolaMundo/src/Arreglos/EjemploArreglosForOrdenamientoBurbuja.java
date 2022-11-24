package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

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

        String[] products = {"Kingston pendrive", "Samsumg  Galaxy", "Disco duro SSD", "Asus NoteBook", "Macbook air",
        "Chomecast", "Biicleta oxford"};

        int total = products.length;

        int contador = 0;
        for (int i = 0; i < total - 1; i++){

            for (int j = 0; j < total-1 -i; j++){
                if(products[j+1].compareTo(products[j]) < 0){
                    String auxiliar = products[j];
                    products[j] = products[j+1];
                    products[j+1] = auxiliar;
                }
                contador++;
            }

        }

        System.out.println("contador = " + contador);

        System.out.println("====== usando for =====");
        for (int i = 0; i< total; i++){
            System.out.println("para Indice " +i+ " : " + products[i]);
        }

    }
}
