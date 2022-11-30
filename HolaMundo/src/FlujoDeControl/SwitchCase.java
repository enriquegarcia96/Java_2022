package FlujoDeControl;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 - 12");
        int mes = scanner.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";break;
            case 2:
                nombreMes = "Febrero";break;
            case 3:
                nombreMes = "Marzo"; break;
            case  4:
                nombreMes = "Abril"; break;
            case 5:
                nombreMes = "Mayo"; break;
            case 6:
                nombreMes = "Junio"; break;
            case 7:
                nombreMes = "Julio"; break;
            case 8:
                nombreMes = "Agosto"; break;
            case 9:
                nombreMes = "Septiembre"; break;
            case 10:
                nombreMes = "Octubre"; break;
            case 11:
                nombreMes = "Noviembre"; break;
            case  12:
                nombreMes = "Diciembre"; break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);







        char  num = 'a';
        switch (num){

            case '0':
                System.out.println("El numero 0");
                break;
            case '1':
                System.out.println("numero 1");
                break;
            case '2':
                System.out.println("El numero 2");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("la letras es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }


        String nombre = "diana";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, welcome");
                break;
            case "kike":
                System.out.println("Hola kike");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }


    }
}
