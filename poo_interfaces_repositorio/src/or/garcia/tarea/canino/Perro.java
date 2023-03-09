package or.garcia.tarea.canino;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Perro(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
    }

    public Perro(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos,
                 int fuerzaMordida) {
        super(habitat, nombreCientifico, altura, largo, peso, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }



    public int getFuerzaMordida() {
        return fuerzaMordida;
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
