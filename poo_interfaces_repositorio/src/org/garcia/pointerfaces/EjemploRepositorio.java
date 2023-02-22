package org.garcia.pointerfaces;
import org.garcia.pointerfaces.modelo.Cliente;
import org.garcia.pointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Kike", "Garcia"));
        repo.crear(new Cliente("andrea", "caceres"));
        repo.crear(new Cliente("Maria", "Romero"));
        repo.crear(new Cliente("Luigi", "Mario"));

        List<Cliente> clientes =  repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== Paginable =====");
        List<Cliente> paginable =  repo.listar(1, 4);
        paginable.forEach(System.out::println);


        System.out.println("==== Ordenar =====");
        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("=====  editar =====");
        Cliente beaActualizar = new Cliente("Maria", "Bardales");
        beaActualizar.setId(3);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(3);
        System.out.println(bea);
        System.out.println("------------------");

        List<Cliente> clientes2 = repo.listar("nombre", Direccion.ASC);
        clientes2.forEach(System.out::println);

        System.out.println("======= Eliminar ===========");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);
        System.out.println(" Total Registro ::: " + repo.total());
    }

}
