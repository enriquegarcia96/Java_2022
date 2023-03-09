package or.garcia.tarea.felino;

import or.garcia.tarea.Mamifero;

abstract public class Felino extends Mamifero {

    private float tamanoGarras;
    private int velocidad;
    public Felino(String habitat, String nombreCientifico, float altura, float largo, float peso) {
        super(habitat, nombreCientifico, altura, largo, peso);
    }

    public Felino(String habitat, float altura, float largo,
                  float peso, String nombreCientifico,
                  float tamanoGarras, Integer velocidad){

        super(habitat, nombreCientifico, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

}
