package or.garcia.tarea.felino;
public class Tigre extends Felino {

    private String especie;

    public Tigre(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, Integer velocidad,
                String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especie = especie;
    }



    public String getEspecie(){
        return  especie;
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
