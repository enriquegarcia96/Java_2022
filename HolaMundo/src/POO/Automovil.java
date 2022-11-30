package POO;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "Gris";
    double cilindrada;
    int capacidadEstanque = 40;


    // Métodos
    public String verDetalle(){
        return  "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar (){
        return this.fabricante + " " + this.modelo + " frenando!!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.capacidadEstanque*(porcentajeBencina/100f));
    }

}
