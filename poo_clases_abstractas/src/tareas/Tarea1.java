package tareas;

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int [] array = new int[10];

        System.out.println("Ingrese 10 numeros");
        System.out.println("=========================");

        for(int i = 0; i < 10; i++ ){
            System.out.println("Ingrese el Numero # " + (i +1) );
            array[i] = leer.nextInt();
        }

        for (int i =0; i <4; i++){
            System.out.println(array[i] + ":" + array[9-i]);
        }





    }

}
