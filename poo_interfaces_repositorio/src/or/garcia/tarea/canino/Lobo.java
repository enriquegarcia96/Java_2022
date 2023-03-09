package or.garcia.tarea.canino;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Lobo(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
    }

    public Lobo(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos,
                int numCamada, String especieLobo) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }


    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
