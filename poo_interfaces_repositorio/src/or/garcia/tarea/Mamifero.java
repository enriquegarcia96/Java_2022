package or.garcia.tarea;

abstract public class Mamifero {

    protected String habitat, nombreCientifico;
    protected float altura, largo, peso;

    public Mamifero(
            String habitat, String nombreCientifico,
            float altura, float largo, float peso
    )
    {
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    abstract public String getHabitat();
    abstract public String getNombreCientifico();
    abstract public float getAltura();
    abstract public float getLargo();
    abstract public float getPeso();


    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}
