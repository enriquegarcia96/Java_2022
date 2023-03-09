package org.garcia.pointerfaces.repositorio;

import org.garcia.pointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }


    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        // creo una lista para NO afectar al original
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((Cliente a, Cliente b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;

        });
        return listaOrdenada;
    }


    static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

}
