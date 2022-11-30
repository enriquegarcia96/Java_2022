package FlujoDeControl;

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        // Etiquetas para los bucles
        bucle1:
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana!");
                    // se salta el 2
                    continue bucle1;
                }
                System.out.println("Dia " + i + " , trabajando a las " + j + " hrs. ");
            }
        }


        System.out.println("\n==============================");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    // se salta el 2
                    break etiqueta;
                }
                System.out.print("[i = " + i + " , j = " + j + "], ");
            }
        }


    }
}
