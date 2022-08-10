package Operadores;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String estado = "";
        double promedio = 0.0, matematicas = 0.0, ciencias = 0.0, historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematica entre  2.0 - 7.0");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre  2.0 - 7.0");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia entre  2.0 - 7.0");
        historia = scanner.nextDouble();


        promedio = ((matematicas + ciencias + historia) / 3);
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("promedio = " + estado);



    }
}
