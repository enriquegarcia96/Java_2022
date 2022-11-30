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


    public static  void sortBurbuja(Object[]   arreglo  ){
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++){
            for (int j = 0; j < arreglo.length-1 -i; j++){
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] products = {"Kingston pendrive", "Samsumg  Galaxy", "Disco duro SSD", "Asus NoteBook", "Macbook air",
        "Chomecast", "Biicleta oxford"};

        int total = products.length;

        sortBurbuja(products);


        System.out.println("====== usando for =====");
        for (int i = 0; i< total; i++){
            System.out.println("para Indice " +i+ " : " + products[i]);
        }

        Integer [] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("i =  "+ i  +" : " + numeros[i]);
        }


    }
}
