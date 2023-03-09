package or.garcia.tarea;

abstract public class Mamifero {

    protected String habitat, nombreCientifico;
    protected float altura, largo, peso;

    public Mamifero(
            String habitat, String nombreCientifico,
            float altura, float largo, float peso
    ) {
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public String getHabitat(){
        return habitat;
    }

    public String getNombreCientifico(){
        return  nombreCientifico;
    }

    public float getAltura(){
        return altura;
    }

    public float getLargo(){
        return largo;
    }

    public float getPeso(){
        return peso;
    }


    abstract public String comer();

    abstract public String dormir();

    abstract public String correr();

    abstract public String comunicarse();
}
