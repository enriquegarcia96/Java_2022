package org.garcia.generics;

import org.garcia.pointerfaces.modelo.Cliente;
import org.garcia.pointerfaces.modelo.ClientePremium;

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

        Integer[] enterosArreglos = {1, 2, 3};

        List<Cliente> clientesList = fromArrayToList(clientesArreglo);
        List<Integer> enterosList = fromArrayToList(enterosArreglos);

        clientesList.forEach(System.out::println);
        for (Integer i : enterosList) {
            System.out.println(i);
        }
        List<String> nombres = fromArrayToList(new String[]{"Diana", "Omar", "Shellsea", "Maria"}, enterosArreglos);
        nombres.forEach(System.out::println);

        // genericos con limites - Bounded Generics
        List<ClientePremium> clientePremiumsList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Karla", "Anuel")}
        );

        imprimirClientes(clientes);
        imprimirClientes(clientesList);
        imprimirClientes(clientePremiumsList);
    }

    // metodo generico
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    // ? Es un comodín - wildcards generics, para que pueda extender
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

}
