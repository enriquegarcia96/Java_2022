package POO.tarea;

import javax.swing.*;
import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        OrdenCompra ordenCompra1 = new OrdenCompra("Compras componentes pc");
        ordenCompra1.setCliente(new Cliente("enrique", "garcia"));
        ordenCompra1.setFecha(new Date());
        ordenCompra1.addProducto(new Producto("hola", "SSd", 200))
                    .addProducto(new Producto("hola", "SSd", 200))
                    .addProducto(new Producto("hola", "SSd", 200))
                    .addProducto(new Producto("hola", "SSd", 200));

        OrdenCompra ordenCompra2 = new OrdenCompra("Compras de video juegos");
        ordenCompra2.setCliente(new Cliente("Andrea", "Caceres"));
        ordenCompra2.setFecha(new Date());
        ordenCompra2.addProducto(new Producto("Mia", "Smash", 1390))
                    .addProducto(new Producto("Mia", "Smash", 1390))
                    .addProducto(new Producto("Mia", "Smash", 1390))
                    .addProducto(new Producto("Mia", "Smash", 1390));


        OrdenCompra ordenCompra3 = new OrdenCompra("Compras carros");
        ordenCompra3.setCliente(new Cliente("Diana", "Gonzales"));
        ordenCompra3.setFecha(new Date());
        ordenCompra3.addProducto(new Producto("Mia", "Smash", 1390))
                    .addProducto(new Producto("Mia", "Smash", 1390))
                    .addProducto(new Producto("Mia", "Smash", 1390))
                    .addProducto(new Producto("Mia", "Smash", 1390));


        OrdenCompra[] ordenes = {ordenCompra1, ordenCompra2, ordenCompra3};

        for (OrdenCompra orden: ordenes  ) {
            System.out.println("Folio : " + orden.getId());
            System.out.println("Cliente : "+ orden.getCliente());
            System.out.println("Descripcion : " + orden.getDescripcion());
            System.out.println("Fecha : " + orden.getFecha());
            System.out.println("Total : "+ orden.getGranTotal());

            int i = 1;

            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");

        }




    }

}
