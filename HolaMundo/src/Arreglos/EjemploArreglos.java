package Arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {

        int [] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        //numeros[2] = (int) 3L;// cas
        numeros[2] = 3;
        numeros[3] = 4;
        //numeros[4] = 5;

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
