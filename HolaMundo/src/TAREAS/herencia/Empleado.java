package TAREAS.herencia;

public class Empleado extends Persona {

    private double remuneracion;
    private int empleadoId;
    private  static  int id;


    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion){
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId = ++id;
        this.remuneracion =renumeracion;
    }

    public double getRemuneracion(){
        return this.remuneracion;
    }

    public int getEmpleadoId(){
        return this.empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId;
    }
}
