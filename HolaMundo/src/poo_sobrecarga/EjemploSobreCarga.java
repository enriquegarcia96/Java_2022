package poo_sobrecarga;

import static poo_sobrecarga.Calculadora.*;

public class EjemploSobreCarga {
    public static void main(String[] args) {



        System.out.println("Sumar int : " + sumar(10, 5));

        System.out.println("Sumar float : "  + sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + sumar(3, 4.3));

        System.out.println("Sumar 4 int: " + sumar(10,5,3, 4,5,6));
        System.out.println("Sumar float mas N int : "  + sumar(10.5F, 5,9,15));
        System.out.println("Sumar 4 double : " +  sumar(10.0, 5.0, 3,5,4,5));

    }
}

