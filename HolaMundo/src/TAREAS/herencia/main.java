package TAREAS.herencia;

public class main {
    public static void main(String[] args) {

        Genrente genrente = new Genrente("Enrique", "Garcia", "0209",
                "Barrio las flores", 3.3f, 16250.20f);
        genrente.setPresupuesto(7000);

        System.out.println(genrente);

    }
}
