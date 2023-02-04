package TAREAS.herencia;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Genrente extends Empleado {

    private double presupuesto;

    public Genrente(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion, double presupuesto){
        super(nombre, apellido, numeroFiscal, direccion, renumeracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto(){
        return this.presupuesto;
    }

    public void setPresupuesto(double presupuesto){
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGenrente{" +
                "presupuesto=" + presupuesto +
                '}';
    }
}
