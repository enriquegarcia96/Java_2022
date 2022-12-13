package POO;
// coleccion de valores constantes o atributos constantes
public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranja");

    private final String color;

    Color (String color){
        this.color = color;
    }

    public String getColor(){
        return  color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
