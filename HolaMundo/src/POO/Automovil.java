package POO;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;


    // Métodos
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        return sb.toString();
    }



}
