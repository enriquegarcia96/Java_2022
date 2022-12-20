package POO.tarea;

import java.util.Date;

public class OrdenCompra {

    private static int identificador;
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto;

    public OrdenCompra(String descripcion){
        this.descripcion = descripcion;
        this.id = ++identificador;
        this.productos = new Producto[4];
    }

    public static Integer getIdentificador() {
        return identificador;
    }

    public int getId(){
        return  id;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public Date getFecha(){
        return fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Producto[] getProductos(){
        return productos;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setFecha(Date fecha1){
        this.fecha = fecha1;
    }

    // agrega los productos
    public OrdenCompra addProducto(Producto producto){
        if(indiceProducto < this.productos.length){
            this.productos[indiceProducto++] = producto;
        }

        return this;
    }

    public int getGranTotal(){
        int total = 0;
        for (Producto p: productos) {
            total += p.getPrecio();
        }
        return  total;
    }
}
