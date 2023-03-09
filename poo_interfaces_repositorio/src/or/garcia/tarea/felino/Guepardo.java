package or.garcia.tarea.felino;

public class Guepardo extends Felino{


    public Guepardo(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
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
