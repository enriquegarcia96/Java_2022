package Facturas.egarcia.appfacturas;

import Facturas.egarcia.appfacturas.modelo.Cliente;
import Facturas.egarcia.appfacturas.modelo.Factura;
import Facturas.egarcia.appfacturas.modelo.ItemFactura;
import Facturas.egarcia.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("kike");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descipcion de la factuta : ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° "+ producto.getCodigo() +  ": ");
            nombre = s.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio : ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura itemFactura = new ItemFactura(cantidad, producto);
            factura.addItemFactura(itemFactura);

            System.out.println();
        }

        System.out.println(factura.generarDetalle());

    }


}
