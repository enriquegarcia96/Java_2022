package TAREAS.herencia.verduras;

public class Producto {
    public String nombre;
    public double precio;


    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }


}
