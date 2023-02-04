package TAREAS.herencia;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Persona {

    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal =  numeroFiscal;
        this.direccion = direccion;
    }


    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getNumeroFiscal(){
        return this.numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        return "\nnombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion;
    }
}
