package org.garcia.generics;

import org.garcia.pointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Kike", "Guzman"));

        Cliente kike = clientes.iterator().next();

        Cliente[] clientesArreglo = {
                new Cliente("Andrea", "Caceres"),
                new Cliente("Derick", "Garcia")};

        Integer[] enterosArreglos = {1,2,3};

        List<Cliente> clientesList = fromArrayToList(clientesArreglo);
        List<Integer> enterosList = fromArrayToList(enterosArreglos);

        clientesList.forEach(System.out::println);
        for (Integer i : enterosList) {
            System.out.println(i);
        }
        List<String> nombres = fromArrayToList(new String[]{"Diana", "Omar", "Shellsea", "Maria"}, enterosArreglos);
        nombres.forEach(System.out::println);

    }

    // metodo generico
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento: x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
