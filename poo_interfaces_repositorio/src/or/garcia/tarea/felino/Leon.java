package or.garcia.tarea.felino;

public class Leon extends Felino {

    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }


    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad,
                int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }


    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
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
