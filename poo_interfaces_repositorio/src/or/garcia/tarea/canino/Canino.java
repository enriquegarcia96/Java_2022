package or.garcia.tarea.canino;

import or.garcia.tarea.Mamifero;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Canino(String habitat, String nombreCientifico, float altura, float largo, float peso, String color, float tamanoColmillos){
        super(habitat, nombreCientifico, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
}
