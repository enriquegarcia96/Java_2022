package ValorvsReferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        // variables primitivas siempre pasan por valor
        int i = 10;

        System.out.println("iniciamos en main i = " + i);
        test(i);
        System.out.println("finaliza el método main con el valor de i (se mantiene igual) = " + i);

    }

    public  static void test(int i){
        System.out.println("Iniciamos el metodo test con i  = " + i);
        i = 35;
        System.out.println("finaliza el metodo con i = " + i);
    }

}
