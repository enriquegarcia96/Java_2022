package FlujoDeControl;

import java.util.Scanner;

public class SistemasDeNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroNota = 1;
        double[] listadoDeNotas = new double[20];
        int contadorMayores5 = 0;
        int contadorInferiores4 = 0;
        int contadorNota1 = 0;
        double notasMayores5 = 0;
        double notasinferiores4 = 0;
        double notas1 = 0;


        for (int i = 0; i < listadoDeNotas.length; i++) {

            System.out.println("Ingrese la nota " + numeroNota);
            double nota = scanner.nextDouble();

            if(nota >8) continue;
            if(nota == 0){
                System.out.println("Programa finalizado, digito un 0");
                break;
            }

            listadoDeNotas[i] = nota;
            numeroNota++;

            switch ((int) nota){

                case 5:
                case 6:
                case 7:
                    contadorMayores5++;
                    notasMayores5 += nota;
                    break;
                case 4:
                case 3:
                case 2:
                    contadorInferiores4++;
                    notasinferiores4 += nota;
                    break;
                case 1:
                    contadorNota1++;
                    notas1 += nota;
                    break;
                default:
                    System.out.println("Error es una nora mayor a 7");
            }

        }

        System.out.println("Promedio de notas >  5 " +  notasMayores5/contadorMayores5 + "\n" + "promedio notas < 4 " + notasinferiores4/contadorInferiores4 + "\n"+
        " promedio notas < 1 " + contadorNota1 + "\n Promedio total : " + (notasMayores5+notasinferiores4+notas1)/20

        );





    }

}
